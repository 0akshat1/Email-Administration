import java.util.Scanner;
public class emailmain{
public static void main (String [] args){

    Scanner input = new Scanner (System.in);
    System.out.println("Enter your First Name");
    String f1Name = input.nextLine();
    System.out.println("Enter your Last Name");
    String s2Name = input.nextLine();
    

    Email em1 = new Email(); //CREATING OBJECT em1 TO USE CLASS EMAIL
    em1.email(f1Name,s2Name );//USING email FUNCTION
    input.close();
    

   
}
}