import java.util.Scanner;
class Capital{
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str=s.nextLine();
    String word[]=str.split(" ");
    for(int i=0;i<word.length;i++)
      {
        System.out.print(word[i].substring(0,1).toUpperCase() +word[i].substring(1)+" ");
      }
    }
}
