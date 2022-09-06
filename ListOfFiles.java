
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
	public class ListOfFiles {
	   public static void main(String args[]) throws IOException {
	      //Creating a File object for directory
		   BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));
		    System.out.println("Enter directory path:");
		    String dirpath = null;
			try {
				dirpath = br.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		  //  System.out.println("Enter the name of directory:");
		  String dname = null;
		 //  dname = br.readLine();
		   
		   File f = new File(dirpath,dname);
		  // if (f.exists()) {
			      //get the contents into data[] 
			      //now data[i] represent either a File or Directory 
			      String data[] = f.list();

			      int n = data.length;
			      for (int i = 0; i < n; i++) {
			        System.out.println(data[i]);

	      	
	   }
	   }
	}

