import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number");
        double num1=sc.nextDouble();

        System.out.print("Enter a number");
        double num2 =sc.nextDouble();
        
        System.out.print("Enter a operator (+ ,-,*,/)");
        char operator=sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
              result=num1+num2;
                break;
            case '-':
               result=num1-num2;
               break;
            case '*':
              result=num1*num2;
              break;
            case '/':
              if(num2!=0){
                result =num1/num2;
              }else{
                System.out.println("Error!!Divisable by zero");
                return;
              }
              break;
            default:
            System.out.println("Invalid operator");
                return;
        }
         System.out.println("Result "+result);
    }
}
