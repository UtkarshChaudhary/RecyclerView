package com.example.lenovo.recyclerview;

import java.util.ArrayList;

/**
 * Created by lenovo on 19-07-2017.
 */

public class Note {
    private String title;
    private String description;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static ArrayList<Note> getRandomNotes(int noOfNotes){
        ArrayList<Note> notes=new ArrayList<>();
        for(int i=0;i<noOfNotes;i++){
            Note note=new Note("Title "+i,"Description "+i);
            notes.add(note);
        }
        return notes;
    }
}
