import java.util.*;
public class Palindrome{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your Sentence");
    String str=s.nextLine();
    String reverse="";
    for(int i=str.length()-1;i>=0;i--){
      reverse=reverse+str.charAt(i);
    }
    if(str.equals(reverse)){
      System.out.println(str +" is a palindrome");
    }
    else{
      System.out.println(str+"is not a palindrome");
    }

  }
}