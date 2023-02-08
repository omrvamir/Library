package kz.omrvamir.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotNull(message = "Название книги не может быть пустым")
    @Size(min = 1, max = 100, message = "Название книги должно содержать от 1 до 100 символов")
    private String title;

    @NotNull(message = "Имя автора не может быть пустым")
    @Size(min = 1, max = 100, message = "Имя автора должно содержать от 1 до 100 символов")
    private String author;

    @Min(value = 1000, message = "Год выпуска должен быть больше 1900")
    private int yearOfRelease;

    public Book() {

    }

    public Book(String title, String author, int yearOfRelease) {
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
