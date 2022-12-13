import java.util.Objects;
public class Book {
    private String nameOfBook;
    private Author author;
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
    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, publishingYear);
    }

    @Override
    public String toString() {
        return "Book - " + nameOfBook + "\n" +
                "author - " + author.toString() + "\n" +
                "publishingYear - " + publishingYear;
    }
}
