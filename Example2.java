//program 22
//develop a program to create a NSV inside a class access these variable,red and display its value in all methods of current class rewrite 
//8/29/2018
class Object
{

int a=5;
String str="n";

}

class Example2
{
   static void m1(){

	 System.out.println("from m1");

	 Object o1=new Object();

	 System.out.println(o1.a);
	 System.out.println(o1.str);

 }


   static void m2(){


	 System.out.println("from m2");

	  Object o2 =new Object();

	  System.out.println(o2.a);
	  System.out.println(o2.str);

 }

 public static void main(String[] args){
        
		System.out.println("from main");

         Object o3=new Object();


        System.out.println(o3.a);
	    System.out.println(o3.str);
	 


	    m1();
        m2();
 }


}  

