
import java.util.Date;
class Book {
    public class book {
    private String title;
    private String author;
    private int number;
    private String genre;
    private int version;
    private Date date;
    
    public String getInfo() {
        return "Book title: " + title + " author" + author;
    }
    public boolean inLoan() {
        return false;
    }
}

    
}
