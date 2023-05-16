//1.Write a Java Program to reverse each word in String?
import java.util.Scanner;
public class Reverse1{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Original string");
    String str = s.nextLine();
    String words[] = str.split(" ");
    String reversedString = "";
    for(int i=0; i<words.length; i++)
      {
        String word = words[i];
        String reverseWord = "";
        for(int j=word.length()-1; j>=0; j--) {
          reverseWord = reverseWord + word.charAt(j);
        }
        reversedString = reversedString + reverseWord + " ";
      }
    System.out.println("Reversed string :" +reversedString);
  }    
}