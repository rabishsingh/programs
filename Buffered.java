import java.io.*;
class Buffered
{
	public static void main(String [] args) throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("aba.txt"));

               bw.write(100);
			   bw.write("ay");
			   bw.write("wednesday");
               bw.newLine();
			   bw.write("hello");
			   bw.flush();
			   bw.close();




               

	}
}
