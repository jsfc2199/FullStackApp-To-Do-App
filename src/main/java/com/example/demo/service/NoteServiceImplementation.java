package com.example.demo.service;

import com.example.demo.entity.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //this annotation allows spring boot to identify this as a beam to make the dependency injection in another class
//instanciate the class and will save the class, so we can used it in another place using autowired latter

public class NoteServiceImplementation implements NoteService{

    @Autowired //injection of the repository to access to all the methods
    private NoteRepository noteRepository;


    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll(); //bring us all the notes
    }

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note); //save the object that we are going to pass throw the front end app
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
