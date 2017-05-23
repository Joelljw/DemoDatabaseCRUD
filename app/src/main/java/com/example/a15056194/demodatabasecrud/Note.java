package com.example.a15056194.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 15056194 on 23/5/2017.
 */

public class Note implements Serializable{

    private int id;
    private String noteContent;

    public Note(int id, String noteContent){
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId(){
        return id;
    }

    public String getNoteContent(){
        return noteContent;
    }

    public void setNoteContent(String noteContent){
        this.noteContent = noteContent;
    }
}
