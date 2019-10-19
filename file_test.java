import java.io.*;
class file_test{

  public static void main(String args[]) throws IOException{
    
    File f = new File("neeraj.txt");
     
	// f.mkdir();    for creating directories

   System.out.println(f.exists());
     
   f.createNewFile();

    System.out.println(f.exists());



    }
    }