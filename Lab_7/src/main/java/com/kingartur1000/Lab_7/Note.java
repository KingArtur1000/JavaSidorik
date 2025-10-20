package com.kingartur1000.Lab_7;

/**
 * Класс Note – статья в журнале
 * Автор: Артур
 */
public class Note {
    private String authorNote;   // автор статьи
    private String noteTitle;    // название статьи
    private double numberPages;  // количество страниц

    public Note(String authorNote, String noteTitle, double numberPages) {
        this.authorNote = authorNote;
        this.noteTitle = noteTitle;
        this.numberPages = numberPages;
    }

    public String getAuthorNote() {
        return authorNote;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public int getNumberPages() {
        return (int) numberPages;
    }

    @Override
    public String toString() {
        return authorNote + " " + noteTitle + ", авт. листов: " + numberPages;
    }
}

