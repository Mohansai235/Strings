import java.util.*;
public class VowelsCount1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Please Enter your sentence");
    String str=s.nextLine();
    int ecount=0,icount=0,acount=0,ocount=0,ucount=0;
    String str1=str.toLowerCase();
    System.out.println("After converting the string to lower case");
    System.out.println(str1);
    for(int i=0;i<str.length();i++){
      if(str1.charAt(i)=='a' || str1.charAt(i)=='e'|| str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u'){
        if(str1.charAt(i)=='a'){
        acount++;
        }
        if(str1.charAt(i)=='e'){
          ecount++;
        }
        if(str1.charAt(i)=='i'){
          icount++;
        }
        if(str1.charAt(i)=='o'){
          ocount++;
        }
        if(str1.charAt(i)=='u'){
          ucount++;
        }
        
      }
    }
    System.out.println("The count of vowel 'a' is: "+acount);
    System.out.println("The count of vowel 'e' is: "+ecount);
    System.out.println("The count of vowel 'i' is: "+icount);
    System.out.println("The count of vowel 'o' is: "+ocount);
    System.out.println("The count of vowel 'u' is: "+ucount);

  }
}