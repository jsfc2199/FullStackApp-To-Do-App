package com.example.demo.repository;

import com.example.demo.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository requires the type of the entity and the type of the primary key (Id)
@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {
}
