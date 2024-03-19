import java.util.Scanner;
public class VowelConsonantChecke {
    public static void VowelOrConsonant(char ch){
        ch=Character.toLowerCase(ch);
        if(ch >='a'&& ch<='z'){
           if((ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')){
            System.out.println(ch+" is a Vowel");
           }
           else{
            System.out.println(ch+" is a consonant");
           }
        }
        else{
            System.out.println("Enter valid character");
        }
    }
   public static void main(String[] args) {
    System.out.print("Enter a charecter:");
    Scanner sc=new Scanner(System.in);
      char character=sc.next().charAt(0);
      VowelOrConsonant(character);  
   }
}