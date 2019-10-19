import java.io.*;
class count_file_inDirectory{


	public static void main(String[] args) 
	{
		
     int count =0;
      
	  File f = new File("C:\\Users\\NEERAJ");

	 String[] s= f.list();

	 for (String S:s)
	 {
		 count++;

		 System.out.println(S);
	 }

     System.out.println("count files in a directory" + count);


	}

}
