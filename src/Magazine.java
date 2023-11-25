
import java.awt.print.Book;
import java.util.Date;


public class Magazine extends Book {
    private int issueNo;
    private Date releaseDate;

  
    public String getInfo() {
     
        return "Magazine Info: " + getTitle() + " Issue No: " + issueNo;
    }
    public boolean inLoan() {
        return false;
    }

    private String getTitle() {
        throw new UnsupportedOperationException("Not supported yet.");  
    }
}
