package Ch4;
import java.util.*;
/**
 *
 * @author HP
 */
public class Librarian {
    public static void main(String[] args){
        GregorianCalendar expDate = new GregorianCalendar(2025, Calendar.NOVEMBER, 12);
        Student student;
        LibraryCard card1, card2;
        
        student = new Student();
        student.setName("Jon Java");
        student.setEmail("mabangi@gmail.com");
        
        card1 = new LibraryCard();
        card1.setOwner(student);
        card1.setExpDate(expDate);
        card1.checkOut(3);
        
        card2 =new LibraryCard();
        card2.setOwner(student);
        
        System.out.println("card1 Info: ");
        System.out.println(card1.mabangi() + "\nCard Expiry Year: " + card1.getExpYear() + "\n");
        
        System.out.println("Card2 Info: ");
        System.out.println(card2.mabangi() + "\n");
    }
}
