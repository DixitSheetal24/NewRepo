
import java.io.*;
import java.util.Scanner;
public class DelFile{
    public static void main(String[] args){
      String name;
  	  System.out.println("File name:");
  	  Scanner Sc=new Scanner(System.in);
  	  name =Sc.nextLine();

        
        File temp_file = new File(name);   // Object of file class       
        if(temp_file.delete()){
            System.out.println(temp_file.getName()+" is successfully deleted");
        }
        else{
            System.out.println("Failed to delete "+temp_file.getName()+" file");
        }
    }
}

