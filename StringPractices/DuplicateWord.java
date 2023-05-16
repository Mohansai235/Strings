import java.util.*;
class DuplicateWord{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your Sentence:");
    String str=s.nextLine();
    String words[]=str.split(" ");
    System.out.println("Your String is: ");
    System.out.println(str);
    String duplicate=words[0];
    System.out.println("Duplicate word in the string is:");
    int count=0;
    for(int i=0;i<words.length;i++)
      {
        for(int j=i+1;j<words.length;j++)
          {
            if(words[i].equals(words[j])){
              duplicate=words[i];
              System.out.println(duplicate);
              count++;
            }
          }
      }
    System.out.println("count: "+count);
  }
}