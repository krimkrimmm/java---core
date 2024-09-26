package extend_lesson.lab2.entities;
import java.time.LocalDateTime;
public class Ticketbook{
    private int id;
    private int bookid;
    private int personid;;

    private int quality;
    private LocalDateTime borrowdate;
    private LocalDateTime returndate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public LocalDateTime getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(LocalDateTime borrowdate) {
        this.borrowdate = borrowdate;
    }
    public LocalDateTime getReturndate() {
        return returndate;
    }

    public void setReturndate(LocalDateTime returndate) {
        this.returndate = returndate;
    }
    public Ticketbook(int id, int bookid, int personid, int quality, LocalDateTime borrowdate, LocalDateTime returndate) {
        this.id = id;
        this.bookid = bookid;
        this.personid = personid;
        this.quality = quality;
        this.borrowdate = borrowdate;
        this.returndate = returndate;
    }

    @Override
    public String toString() {
        return "Ticketbook{" +
                "id=" + id +
                ", bookid=" + bookid +
                ", personid=" + personid +
                ", quality=" + quality +
                ", borrowdate=" + borrowdate +
                ", returndate=" + returndate +
                '}';
    }
}





