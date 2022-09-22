import java.util.Scanner;
public class Email { //class Email

    //declaring variables or objects to use in main class
    private String FirstName;
    private String LastName;
    private String password;
    private int defaultPassLength=10;
    private String Department;
    private String email;
    private String companyName = "akshatIscoding.com";



//creating method to recieve first last name 
public void email(String FirstName, String LastName){
/*using this to access only class pvt obj or variables*/
this.FirstName = FirstName;       
this.LastName = LastName;
System.out.println("**********************************************************************************************************************************************************************************************************************");
System.out.println("Welcome "+this.FirstName+" "+ this.LastName);
System.out.println("**********************************************************************************************************************************************************************************************************************");


//calling method which is asking for department to return the department 
this.Department= setdepartment();
System.out.println("\n");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________");
System.out.println("Department: "+this.Department);
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________");



//combine element to generate email and to return it 
 this.email= FirstName.toLowerCase() +"."+LastName.toLowerCase()+"@"+"from"+Department+"."+companyName;
 System.out.println("\n");
 System.out.println("**********************************************************************************************************************************************************************************************************************");
 System.out.println("Email: "+email);
 System.out.println("**********************************************************************************************************************************************************************************************************************");

 //call a method that genrate a random password to return password
this.password = randomPassword(defaultPassLength);
System.out.println("\n");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________");
System.out.println("password :"+this.password);
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________");
}



//method asking for department 
private String setdepartment() {
System.out.println("Department codes are:\n 1 for Sale's \n 2 for Devlopment \n 3 for Account's \n 0 for none \n Enter your Department code:");
Scanner enter = new Scanner (System.in);
int departmentChoice =enter.nextInt();
enter.close();
if(departmentChoice==1){return "Sale's";}
else if (departmentChoice==2){return "Devlopment";}
else if (departmentChoice==3){return "Account's";}
else{ return "";}
}


//method to generate random password
private String randomPassword(int length){
    String setpassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    char[] password = new char [length]; //char type array
    for(int i=0;i<length;i++){
   int rand =   (int) (Math.random()*setpassword.length()); //casting String setpass into int and using random fucntion
   password[i] = setpassword.charAt(rand);
    }
    return new String (password);
}



}





