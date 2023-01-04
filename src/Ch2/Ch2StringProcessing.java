package Ch2;
/**
 *
 * @author frank
 */
public class Ch2StringProcessing {
    public static void main(String[] args){
    String fullName, firstName, middleName, lastName;
    fullName = "Frankline Mwenda Kagendo";
    firstName = fullName.substring(0,9);
    middleName = fullName.substring(10,16);
    lastName = fullName.substring(17,24);
    System.out.println("Full Name: "+fullName);
    System.out.println("First Name: " +firstName);
    System.out.println("Middle Name: "+middleName);
    System.out.println("Last Name: "+lastName);
    System.out.println("Your name has " +fullName.length() +" characters");
    }
    
}
