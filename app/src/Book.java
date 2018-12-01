import java.util.*;

public class Book implements Comparable <Book> {

    public String ISBN;
    public String bar;
    public String title = "";

    // Due date
    public Date due;
    // Checkout date
    public Date check;

    public Book (String ISBN, String bar, String title) {
        this.ISBN = ISBN;
        this.bar = bar;
        this.title = title;
    }

    public Book (String ISBN, String bar) {
        this.ISBN = ISBN;
        this.bar = bar;
    }

    public Book (String ISBN) {
        this.ISBN = ISBN;
        bar = null;
    }

    public Book (String bar) {
        ISBN = null;
        this.bar = bar;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setDueDate (Date due) {
        this.due = due;
    }

    public void setCheckDate (Date check) {
        this.check = check;
    }

    public String getDueString () {

        if (due == null || check == null) {
            throw new IllegalArgumentException("Date not initialized");
        }

        return "Years: " + due.getYearDiff(check) + "\t Months: " + due.getMonthDiff(check) + "\t Days: " + due.getDayDiff(check);

    }

    public boolean isDue () {
        return !(due.isLarger(check));
    }

    public int compareTo (Book that) {
        return 0;
    }

    public int equals (Book that) {
        if (that.ISBN != null && ISBN.equals(that.ISBN)) {
            return true;
        }
        if (that.bar != null && bar.equals(that.bar)) {
            return true;
        }
        if (title.equals(that.title)) {
            return true;
        }
        return false;
    }

}