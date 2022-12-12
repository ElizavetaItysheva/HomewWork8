import org.w3c.dom.ls.LSOutput;

public class Book {
    private String nameOfBook;
     Author author;
    private int publishingYear;
    public Book(String nameOfBook, int publishingYear,Author author) {
        this.nameOfBook = nameOfBook;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getNameOfBook(){
        return this.nameOfBook;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}
