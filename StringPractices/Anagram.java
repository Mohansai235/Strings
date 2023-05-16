import java.util.*;
public class Anagram{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your first string:");
    String str=s.nextLine();
    str=str.toLowerCase();
    System.out.println("Enter your second string:");
    String str1=s.nextLine();
    str1=str1.toLowerCase();
    char[] arr=str.toCharArray();
    char[] arr1=str1.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(arr1);
    if(arr.equals(arr1)){
      System.out.println("It is anagram");
    }
    else{
      System.out.println("It is not anagram");
    }
  }
}