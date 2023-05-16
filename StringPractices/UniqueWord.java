import java.util.*;
public class UniqueWord{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Your Sentence");
    String str=s.nextLine();
    String word[]=str.split(" ");
    String unique=word[0];
    for(int i=0;i<word.length;i++){
      int count=0;
      for(int j=i+1;j<word.length;j++){
        if(word[i].equalsIgnoreCase(word[j])){
          count++;
          word[j]=" ";
        }
      }
      if(count==0 && word[i]!=" "){
       unique=word[i];
        
      }
    }
    System.out.println("Unique Words in the given sentence are:"+unique);
    
  }
}