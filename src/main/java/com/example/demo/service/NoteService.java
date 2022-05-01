package com.example.demo.service;

import com.example.demo.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> getNotes(); //Method that give us all the notes
    Note saveNote(Note note); //Mehtod that allow us to save a note
    Note updateNote(Note note);
    void deleteNote(Long id); //Method that deletes a note basen on the id
}
