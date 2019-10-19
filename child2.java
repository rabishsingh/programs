//java programe for multilevel inheritance and uses of acces control


class parent{
  
  public void m1(){
       System.out.println("this is public uses in parent class");
  }

  /*private void m2(){
	  System.out.println("this is private uses in parent class");
  }
*/
  protected void m3(){
  

	  System.out.println("this is parent class");

  }

}

class child1 extends parent{

/*	private void m6(){
	  System.out.println("this is private uses in parent class");
  }
*/
  protected void m7(){
  

	  System.out.println("this is child1 class");

  }

	public void m4(){

		System.out.println("this is first derived class");
	}
 
}

class child2 extends child1{

	private void m8(){
	  System.out.println("this is private uses in parent class");
  }

  protected void m9(){
  

	  System.out.println("this is parent class");

  }


public void m5(){

	System.out.println("this is second derived class");

}
    public static void main(String args[]){

		child2 obj =new child2();

		obj.m1();
	//	obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
   //	obj.m6();
		obj.m7();
		obj.m8();
		obj.m9();



	}




}
