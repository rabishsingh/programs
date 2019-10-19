import java.io.*;

class filewriting_prog{
   
   public static void main(String args[])throws IOException{
           
	   FileWriter fw = new FileWriter("aba.txt");

	       fw.write(100);
	       fw.write("ay");
	       fw.write("wedness");
	       fw.write("\n");
	       fw.write("hello");
               fw.flush();
	       fw.close();


	       }
	       }
	       