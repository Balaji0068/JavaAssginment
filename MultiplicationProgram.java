import java.util.Scanner;

public class MultiplicationProgram {
    public static void MultiplicationTable(int num){
      for(int i=1;i<=10;i++){
        System.out.println(num+"x"+i+"="+(num*i));
      }
    }
   public static void main (String args[]){
    System.out.print("Enter a Number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    MultiplicationTable(number);
   }
    
}