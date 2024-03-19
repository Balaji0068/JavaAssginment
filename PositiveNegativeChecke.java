import java.util.Scanner;

public class PositiveNegativeChecke {
    public static void isPositiveOrNegatvie(int num){
    if(num>0){
        System.out.println("The number "+num+" is positive number");
    }
    else if(num<0){
       System.out.println("The number "+num+" is negative number");
    }
    else{
        System.out.println("The number is zero");
    }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number");
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();
     isPositiveOrNegatvie(number);

    }
}
