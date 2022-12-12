import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
         Author author = new Author("brendon","sanderson");
         author.setFirstNameAuthor("Brendon");
         author.setLastNameAuthor("Sanderson");
        Book theFinalEmpire = new Book("Mistborn", 2006, author);
        System.out.println(
                "Book - " + theFinalEmpire.getNameOfBook()
                + "\nYear - " + theFinalEmpire.getPublishingYear()
                        + "\nAuthor - " + theFinalEmpire.getAuthor().getFirstNameAuthor()
                        + " " + theFinalEmpire.getAuthor().getLastNameAuthor());

        System.out.println();

        Author author1 = new Author("brendon1","sanderson1");
        author1.setFirstNameAuthor("Brendon1");
        author1.setLastNameAuthor("Sanderson1");

        Book theWellOfAscention = new Book("The Well Of Ascention",2007, author1);
        System.out.println(
                "Book - " + theWellOfAscention.getNameOfBook()
                + "\nYear - " + theWellOfAscention.getPublishingYear()
                + "\nAuthor - " + theWellOfAscention.getAuthor().getFirstNameAuthor()
                + " " + theWellOfAscention.getAuthor().getLastNameAuthor());

        System.out.println();

         theWellOfAscention.setPublishingYear(2022);

         System.out.println("Book - " + theWellOfAscention.getNameOfBook()
                 + "\nYear - " + theWellOfAscention.getPublishingYear()
                 + "\nAuthor - " + theWellOfAscention.getAuthor().getFirstNameAuthor()
                 + " " + theWellOfAscention.getAuthor().getLastNameAuthor());
    }
}