
// Java Program to Search for a File in a Directory
import java.io.*;
import java.util.Scanner;
  
  
public class SearchFile1 {
    
    public static void main(String[] args)throws IOException
    {
        
    	        
    	        String path = System.getProperty("user.dir");
    	               
    	        //System.out.println("Working Directory = " + path);
    	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
    	        String Filename = null;
    	        System.out.println("Enter File name:");
    		    try {
					Filename = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		    File f= new File(path);
    		    String[] data=f.list();
    		    //System.out.println(data[6]);
    		    
    		    for(int i=0;i<=data.length;i++)
    		    {
    		    	    if(data[i]!=Filename)
    		              System.out.println("File " +Filename+ "not Found");
    		            
    		    }
    		    
    		    System.out.println("File " +Filename+ " Found");
    
    		    }		    	
    }  

//}
    	    
    	
       
      // MyFilenameFilter filter   = new MyFilenameFilter("file.cpp");
  
        //String[] flist = .list(filter);
  
        // Empty array
        //if (flist == null) {
          //  System.out.println(
          //      "Empty directory or directory does not exists.");
        
      //  else {
  
            // Print all files with same name in directory
            // as provided in object of MyFilenameFilter
            // class
         //   for (int i = 0; i < flist.length; i++) {
          //      System.out.println(flist[i]+" found");
            
        
    



