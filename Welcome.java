import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Welcome {
	 public static void main(String args[]) {
		 
		 System.out.println("*****************Welcome to File Handling Application***********");
		 System.out.println("************************Developer@SK DIXIT**********************");
		 System.out.println("================================================================");
		 System.out.println("      Press 1 : To List Files ");
		 System.out.println("      Press 2 : To Add File ");
		 System.out.println("      Press 3 : To Delete File ");
		 System.out.println("      Press 4 : To Search File ");
		 System.out.println("      Press 5 : Return to Main ");
		 System.out.println("================================================================");
		 System.out.println("Enter Correct Choice(1/2/3/4/5) : ");
		 
		 Scanner Sc=new Scanner(System.in);
		 int i = Sc.nextInt();
		 if (i==1)
			 listFile();
		 else if(i==2)
			 addFile();
		 else if(i==3)
			 delFile();
		 else if(i==4)
			 searchFile();
		 else if(i==5)
			 welcome();
			 
	 }
	 private static void welcome() {
		 System.out.println("*****************Welcome to File Handling Application***********");
		 System.out.println("************************Developer@SK DIXIT**********************");
		 System.out.println("================================================================");
		 System.out.println("      Press 1 : To List Files ");
		 System.out.println("      Press 2 : To Add File ");
		 System.out.println("      Press 3 : To Delete File ");
		 System.out.println("      Press 4 : To Search File ");
		 System.out.println("      Press 5 : Return to Main ");
		 System.out.println("================================================================");
		 System.out.println("Enter Correct Choice(1/2/3/4/5) : ");
		 }

	private static void addFile() {
		// TODO Auto-generated method stub
		  String name;
		  System.out.println("Enter File name:");
		  Scanner Sc=new Scanner(System.in);
		  name =Sc.nextLine();
     	  String data = "This is the data in the output file";
 	    try {
	      // Creates a FileWriter
	      FileWriter output = new FileWriter(name);

	      // Writes the string to the file
	      output.write(data);
	      System.out.println("File added Succesfully");

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


	
	private static void delFile() {
		// TODO Auto-generated method stub
		String name;
	    System.out.println("Enter File name you want to delete:");
	  	Scanner Sc=new Scanner(System.in);
	  	name =Sc.nextLine();
        File temp_file = new File(name);   // Object of file class       
	    if(temp_file.delete())
	        {
	         System.out.println(temp_file.getName()+" is successfully deleted");
	        }
	    else{
	            System.out.println("Failed to delete "+temp_file.getName()+" file");
	        }
	    }

	private static void searchFile() {
		String path = System.getProperty("user.dir");
		 String dname = null;
		 File f = new File(path);
		 String data[] = f.list();
        int n = data.length;
		
		 
		 String name = null;
		 System.out.println("Enter File name:");
		    try {
		    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
				name = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		   n=data.length;
		   //System.out.println("Filename = " +name);
		   int i;
		   int k = 0;
		 try{
		   for(i=0;i<=n;i++) 
		   {
		   if( name.compareTo(data[i])==0)
		   {
		         System.out.println("file found");}
		     else
		    	 {k++;}
		   }
		 
		   }catch(Exception e) {System.out.println("");} 
		 
		 if(k==n) {System.out.println("file does not exist");}
		 	    	
	}
	
	private static void listFile() {
		 String path = System.getProperty("user.dir");
		 String dname = null;
		 File f = new File(path);
		 String data[] = f.list();
         int n = data.length;
         String temp=null;
         try{
		 for (int i = 0;i<=n;i++) {
			 
			 for(int j=1;j<=n;j++) {
				 if(data[i].compareTo(data[j])<0);
				 {
				 temp=data[i];
				 data[i]=data[j];
				 data[j]=temp;
				 
				 }	 
				 System.out.println(data[i]);
				 }
		 } 
         }catch(Exception e) {
             System.out.println("\nException caught");}
	 

	}
}
