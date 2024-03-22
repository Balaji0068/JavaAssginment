import java.io.FileWriter;
public class WriteFile {
    public static void main (String args[]){
        try{
         FileWriter Mywriter=new FileWriter("balaji.txt");
         Mywriter.write("Hello welcome to java file writer calss");
         Mywriter.close();
         System.out.println("Successfully writed the file");
        }catch(Exception e){
          System.out.println("Something went wrong");
        }
    }
}
