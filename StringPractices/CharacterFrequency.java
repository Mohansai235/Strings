import java.util.*;
public class CharacterFrequency{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Your sentence");
    String str=s.nextLine();
    char arr[]=str.toCharArray();
    int freq[]=new int[256];
    for(int i=0;i<arr.length;i++){
      freq[arr[i]]++;
      
    }
    for(int i=0;i<freq.length;i++){
      if(freq[i]!=0){
        System.out.println((char)i+" Frequency is "+freq[i]);
      }
    }
  }
}
