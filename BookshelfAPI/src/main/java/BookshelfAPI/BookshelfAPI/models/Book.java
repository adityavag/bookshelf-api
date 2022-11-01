package BookshelfAPI.BookshelfAPI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int Id;
    private String title;
    private String description;
    private int nofPages;
    private int yearPublished;

    public Book() {
    }

    public Book(String title, String description, int nofPages, int yearPublished) {
        this.title = title;
        this.description = description;
        this.nofPages = nofPages;
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNofPages() {
        return nofPages;
    }

    public void setNofPages(int nofPages) {
        this.nofPages = nofPages;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
