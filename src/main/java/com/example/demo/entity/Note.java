package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Note")
@Table(name = "note")
@Data //give us the getters and setters and toString method of the attibutes
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String message;
    private boolean done;
}
