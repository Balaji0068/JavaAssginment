import java.util.Random;
public class RandomNum {
    public static void main(String[] args) {
        int Otp=(int)(Math.random()*1000);
        System.out.println(Otp);
    }
}

class RandomNum2{
    public static void main(String[] args) {
        Random random=new Random();
        int Otp2=random.nextInt(10000);
        System.out.println(Otp2);
    }
}
