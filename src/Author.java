public class Author { // создаем класс для объекта автор
    private String firstNameAuthor; // создаем данные
    private String lastNameAuthor;
    public Author (String firstNameAuthor, String lastNameAuthor){ // создаем конструктор
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getFirstNameAuthor() { // геттеры
        return this.firstNameAuthor;
    }
    public String getLastNameAuthor(){
        return this.lastNameAuthor;
    }

    public void setFirstNameAuthor( String firstNameAuthor ){ // сеттеры
        this.firstNameAuthor = firstNameAuthor;
    }
    public void setLastNameAuthor(String lastNameAuthor){
        this.lastNameAuthor = lastNameAuthor;
    }
}
