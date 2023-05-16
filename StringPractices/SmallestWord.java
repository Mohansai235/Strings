class SmallestWord{
  public static void main(String args[]) {
    String str="Hi hello welcome to bitlabs";  // no. of words
    String words[]=str.split(" ");
    System.out.println("Number of words: "+words.length);
    for(int i=0;i<words.length;i++) {
      System.out.println(words[i]+" : "+words[i].length());
    }
    String min=words[0];
    System.out.println("Smallest word in the string is:");
    int j=0;
    for(int i=0;i<words.length;i++)
      {
        for(j=i+1;j<words.length;j++)
          {
            if(words[i].length() < words[j].length()){
              min=words[i];
            }
          }
      }
    System.out.println(min);
  }
}