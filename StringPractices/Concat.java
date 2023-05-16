import java.util.*;
public class Concat{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your first sentences");
    String str1=s.nextLine();
    System.out.println("Enter your second sentence");
    String str2=s.nextLine();
    System.out.println("After concatinating the two sentences");
    System.out.println(str1+" "+str2);
  }
}