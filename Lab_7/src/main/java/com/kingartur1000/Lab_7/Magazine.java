package com.kingartur1000.Lab_7;

/**
 * Класс Magazine – журнал, содержащий статьи
 * Автор: Артур
 */
public class Magazine {
    private String magazineTitle;       // название журнала
    private int numberMagazine;         // номер выпуска
    private int publishingYear;         // год издания
    private Note[] notes;               // массив статей
    private String publishingHouse;     // издательство
    private String publishingLocation;  // город
    private int numberPage;             // количество страниц
    private Contents contents;          // композиция – оглавление

    /**
     * Конструктор для создания экземпляра журнала
     */
    public Magazine(String magazineTitle, int numberMagazine,
                    int publishingYear, Note[] notes,
                    String publishingHouse, String publishingLocation) {
        this.magazineTitle = magazineTitle;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
        this.notes = notes;
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        contents = new Contents(notes); // композиция
        this.numberPage = contents.getNumberPages();
    }

    // Get-методы
    public String getMagazineTitle() { return magazineTitle; }
    public int getNumberMagazine() { return numberMagazine; }
    public int getPublishingYear() { return publishingYear; }
    public Note[] getNotes() { return notes; }
    public String getPublishingHouse() { return publishingHouse; }
    public String getPublishingLocation() { return publishingLocation; }
    public int getNumberPage() { return numberPage; }

    // Set-метод для изменения статей
    public void setNotes(Note[] notes) {
        this.notes = notes;
        contents.createContents(notes);
        this.numberPage = contents.getNumberPages();
    }

    @Override
    public String toString() {
        String str = "Журнал " + magazineTitle + " № " + numberMagazine +
                " " + publishingYear + ". – " + publishingLocation +
                ".: " + publishingHouse;
        str += contents.toString();
        return str;
    }
}

