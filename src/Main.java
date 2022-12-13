
public class Main {
    public static void main(String[] args) {
         Author author = new Author("brendon","sanderson");
         author.setFirstNameAuthor("Brendon");
         author.setLastNameAuthor("Sanderson");

        Book theFinalEmpire = new Book("Mistborn", 2006, author);
        System.out.println(theFinalEmpire);

        System.out.println();

        Author author1 = new Author("brendon1","sanderson1");
        author1.setFirstNameAuthor("Brendon1");
        author1.setLastNameAuthor("Sanderson1");

        Book theWellOfAscention = new Book("The Well Of Ascention",2007, author1);
        System.out.println(theWellOfAscention);

        System.out.println();

         theWellOfAscention.setPublishingYear(2022);

        System.out.println(theWellOfAscention);
        System.out.println();

        Author author3 = new Author("","");  // создаем автора 3 для сравнения
        author3.setFirstNameAuthor("Frank");
        author3.setLastNameAuthor("Herbert");

        Author author4 = new Author("","");  // создаем автора 4 для сравнения
        author4.setFirstNameAuthor("Frank");
        author4.setLastNameAuthor("Herbert");

        System.out.println("Автор 3 и 4 равны - " + author3.equals(author4)); // сравниваем автора 3 и 4

        Book book3 = new Book("Dune", 1965, author3); // создаем две одинаковые книги
        Book book4 = new Book("Dune", 1965, author4);
        System.out.println("Книги 3 и 4 равны - " + book3.equals(book4)); // сравниваем книги
        book3.setPublishingYear(1999); // меняем год в 3 книге для проверки верности работы метода equals
        System.out.println("Книги 3 и 4 равны - " + book3.equals(book4)); // повторная проверка
    }
}