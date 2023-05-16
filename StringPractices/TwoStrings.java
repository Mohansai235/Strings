import java.util.*;
public class TwoStrings{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your first string");
    String str1=s.nextLine();
    System.out.println("Enter your Second string");
    String str2=s.nextLine();
    if(str1.equalsIgnoreCase(str2)){
      System.out.println("Two strings are equal");
    }
    else{
      System.out.println("Two strings are not equal");
    }
  }
}