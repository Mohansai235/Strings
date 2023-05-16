/*import java.util.*;
public class StringOperations{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Your Name: "+" ");
    String fullName=s.nextLine();
    if(fullName.length()>=5 && fullName.length()<=15){
      System.out.println(fullName);
    }
    else{
      System.out.println("Please provide your name between 5-15 characters only");
    }
    System.out.println("Enter your Email: "+" ");
    String email=s.nextLine();
    if(email.contains(".") && email.contains("@")){
      System.out.println(email);
    }
    else{
      System.out.println("please provide your email that contains . and @");
    }
    System.out.println("Please Enter your password:");
    String password=s.nextLine();

    
    if(password.length()>=5 && password.length()<=15){
      if(password.matches("[a-z]") && password.matches("[A-Z]") && password.matches("[0-9]") && password.matches("[!,@,#,$,*,&]")){
          system.out.println(password);
        }
      }
    else{
      System.out.println("Enter Valid Password");
    }
    }
    System.out.println("Enter your phonenumber");
    String phonenumber=s.nextLine();
    if(phonenumber.length()==10 && phonenumber.matches("[0-9]")){
      System.out.println(phonenumber); 
    }
    else{
      System.out.println("Please enter the valid phonenumber");
  }
  
}*/