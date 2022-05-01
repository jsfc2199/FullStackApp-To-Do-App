package com.example.demo.controller;

import com.example.demo.entity.Note;
import com.example.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http request that we are going to performing from the fron-end
@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/") //Allows to accept requests from a local front-end app (3000 is the front-end app's port)
public class NoteController {

    @Autowired //Injection of the NoteService layer to use the methods
    private NoteService noteService;

    @GetMapping("get/notes")
    public List<Note> getAllNotes(){
        return noteService.getNotes();
    }

    @PostMapping("save/note")
    public Note saveNote(@RequestBody Note note){ //RequestBody is because we are goint to receive from the body of the http request the note
        return noteService.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note){
        return noteService.updateNote(note);
    }

    @DeleteMapping("delete/note/{id}") //path variable to send just the id to the request
    public void deleteNote(@PathVariable Long id){ //With path variable we get the id we sent from the path
        noteService.deleteNote(id);
    }

}
