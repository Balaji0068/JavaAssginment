public class PatternPrograms {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
class Pattern2{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
class pattern3{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j);
            }
         System.out.println();
        }
    }
}
class pattern4{
    public static void main(String[] args) {
            for(int i=5;i>=1;i--){
                for(int j=1;j<=5;j++){
                    System.out.print(i);
                }
                System.out.println();
            }    
    }
}

class pattern5{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
          for(int j=5;j>=1;j--){
            System.out.print(j);
          }
          System.out.println();
        }
    }
}

class pattern6{
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=1;i<=5;j++){
              System.out.print(count+" ");
              count++;
            }
            System.out.println();
        }
    }
}
class pattern7{
    public static void main(String[] args) {
        int count=2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
              System.out.print(count+" ");
              count+=2;
            }
            System.out.println();
        }
    }
}

class Pattern8 {
    public static void main(String[] args) {
       for(char ch='A';ch<='E';ch++){
          for(int j=1;j<=5;j++){
           System.out.print(ch);
          }
          System.out.println();
       }
            
    }
}
class pattern9{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(char chr='A';chr<='E';chr++){
              System.out.print(chr);
            }
            System.out.println();
        }
    }
}
class pattern10{
    public static void main(String[] args) {
        String st="*";
        for(int i=1;i<=5;i++){
          for(int j=1;j<=i;j++){
            System.out.print(st);
          }
          System.out.println();
        }
    }
}
class pattern11{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
class pattern12{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
class Pattern13{
public static void main(String[] args) {
    for (int i = 5; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
        } 
        System.out.println(); 
    }
}
}

class Pattern14{
    public static void main(String[] args) {
        for (int i=5;i>=1;i--) {
           for(int j=5;j>=i;j--){
            System.out.print(i);
           }
           System.out.println();
        }
    }
    }
 class pattern15{
    public static void main(String[] args) {
        for (int i=5;i>=1;i--) {
            for(int j=5;j>=i;j--){
             System.out.print(j);
            }
            System.out.println();
         }
    }
 }   

 class Pattern16{
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            } 
            System.out.println(); 
        }
    }
    }

