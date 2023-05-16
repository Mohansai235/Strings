import java.util.*;
public class Swap{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String str1=s.nextLine();
    System.out.println("Enter the second string: ");
    String str2=s.nextLine();
    System.out.println("***************************");
    System.out.println("the original strings are: ");
    System.out.println();
    System.out.println("The first string is : "+str1);
    System.out.println("The second string is: "+str2);
    str1=str1+str2;
    str2=str1.substring(0,str1.length() - str2.length());
    str1=str1.substring(str2.length());
    System.out.println("***************************");
    System.out.println("After Swapping: ");
    System.out.println();
    System.out.println("The first string is: "+str1);
    System.out.println("The second string is: "+str2);
  }
}
