import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

public class FileWrite {

  public static void main(String args[]) {
	  String name;
	  System.out.println("File name:");
	  Scanner Sc=new Scanner(System.in);
	  name =Sc.nextLine();

    String data = "This is the data in the output file";

    try {
      // Creates a FileWriter
      FileWriter output = new FileWriter(name);

      // Writes the string to the file
      output.write(data);

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }

private static String Scanner(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}




}


