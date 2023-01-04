
package Ch4;

import java.util.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author HP
 */
public class LibraryCard {
    private Student owner;
    private int borrowCnt;
    private GregorianCalendar expDate;
    
    public LibraryCard(){
        owner = null;
        borrowCnt = 0;
        expDate = null;
    }
    public void checkOut(int numOfBooks){
        borrowCnt = borrowCnt + numOfBooks;
    }
    public int getNumOfBooks(){
        return borrowCnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public void setOwner(Student student){
        owner = student;
    }
    public void setExpDate(GregorianCalendar date){
        expDate = date;
    }
    public int getExpYear(){
       return expDate.get(Calendar.YEAR);
    }
    public int getExpMonth(){
        return expDate.get(Calendar.MONTH);
    }
    public int getExpDate(){
        return expDate.get(Calendar.DATE);
    }
    public String mabangi(){
        return "Owner Name:     " + owner.getName() + "\n" +
               "     Email:     " + owner.getEmail() + "\n" +
               "Books Borrowed: " + borrowCnt;
               
    }
}
