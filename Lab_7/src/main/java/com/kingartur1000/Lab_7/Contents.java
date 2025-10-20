package com.kingartur1000.Lab_7;

/**
 * Класс Contents – оглавление журнала
 * Автор: Артур
 */
public class Contents {
    private Note[] notes;              // массив статей
    private int[][] pageNumberNote;    // массив номеров страниц
    private int numberPage;            // текущий номер страницы

    public Contents(Note[] notes) {
        this.notes = notes;
        pageNumberNote = new int[notes.length][2];
        createContents(notes);
    }

    /**
     * Метод формирования оглавления
     */
    public void createContents(Note[] notes) {
        for (int i = 0; i < notes.length; i++) {
            pageNumberNote[i][0] = 0;
            pageNumberNote[i][1] = 0;
        }
        numberPage = 3; // 1 – титульная, 2 – оглавление
        int i = 0;
        while (i < notes.length && notes[i] != null) {
            pageNumberNote[i][0] = numberPage;
            pageNumberNote[i][1] = notes[i].getNumberPages();
            numberPage += pageNumberNote[i][1];
            i++;
        }
    }

    /**
     * Подсчёт общего количества страниц
     */
    public int getNumberPages() {
        return numberPage - 1;
    }

    @Override
    public String toString() {
        String str = "\nСодержание:";
        int i = 0;
        while (i < notes.length && notes[i] != null) {
            str += "\n" + (i + 1) + " " + notes[i].getAuthorNote() +
                    " " + notes[i].getNoteTitle() + "\t" + pageNumberNote[i][0];
            i++;
        }
        return str;
    }
}

