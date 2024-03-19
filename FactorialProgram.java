import java.util.Scanner;

public class FactorialProgram {
    public static int FactorilaNumber(int num){
        if(num==0){
            return 1;
        }
        return num*FactorilaNumber(num-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
       int result= FactorilaNumber(number);
       System.out.println("Factorial of "+number+" is "+result);

    }
}
