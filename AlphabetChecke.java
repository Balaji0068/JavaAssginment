import java.util.Scanner;

public class AlphabetChecke {
    public static boolean isAlphabet(char ch){
      return((ch>='a'&& ch<='z')|| (ch>='a'&& ch<='z'));
    }
    public static void main(String[] args) {
        System.out.print("Enter a character:");
        Scanner sc=new Scanner(System.in);
        char character=sc.next().charAt(0);
        if(isAlphabet(character)){
            System.out.println(character+" is Alphabet");
        }
        else{
            System.out.println(character+" is not Alphabet");
        }
    }
}
