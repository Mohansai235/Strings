import java.util.*;
public class VowelsCount{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Please Enter your sentence");
    String str=s.nextLine();
    int ccount=0,vcount=0,scount=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
        str.charAt(i)=='O' || str.charAt(i)=='U'){
        vcount++;
      }
        else if(str.charAt(i)==' '){
          scount++;
        }
      else{
        ccount++;
      }
    }
    System.out.println("Length of given string is: "+str.length());
    System.out.println("Count of vowels in a given string is: "+vcount);
   System.out.println("Count of consonants in a given string is: "+ccount);

  }
}