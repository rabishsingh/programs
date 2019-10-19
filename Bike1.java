class vechile{

   public void m1(){


	   System.out.println("parent class m1");
   }

   public void start(){

   System.out.println("all Vechile Start in the same way");

   }

   }

   class Bike1 extends vechile{

         public void start(){
	     System.out.println("this is start using kick also");
	  }

	 public static void main(String args[]){

	 Bike1 obj = new Bike1();

	 obj.start();
     
	 obj.m1();
	 }
	 }




	 