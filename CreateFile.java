import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try{
          File obj=new File("balaji.txt");
          if(obj.createNewFile()){
            System.out.println("File created successfully");
          }else{
            System.out.println("File alredy exists");
          }
        }catch(Exception e){
         System.out.println("Something went wrong");
        }
    }
}
