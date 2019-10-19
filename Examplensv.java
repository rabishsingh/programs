//program 22
//develop a program to create a NSV inside a class access these variable,red and display its value in all methods of current class rewrite 8/29/2018


class Examplensv
{
 int a =10;
 string st="neeraj";

 static void m1(){

	 system.out.println("from m1");

	 object o1=new object();

	 system.out.println(o1.a);
	 system.out.println(o1.st);

 }


 static void m2(){


	 system.out.println("from m2");

	 object o2=new object();

	  system.out.println(o2.a);
	  system.out.println(o2.st);

 }

 public static void main(String[] args){
        
		system.out.println("from main");

         object o3=new object();


        system.out.println(o3.a);
	    system.out.println(o3.st);
	

	    m1();



          

	  


 
 }



}  










/*


{
	public static void main(String[] args)  
	{
		System.out.println("Hello World!");
	}
}
*/