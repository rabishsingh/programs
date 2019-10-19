class vechile{

public void Break(){

System.out.println("all vechiles have break");

}

}

class cars extends vechile{



public void m1(){
	System.out.println("m1 fro, first child");


}


}

class bikes extends vechile{
 public void m2(){
	 System.out.println("m2 from second ");

}



}

class testrun{

	public static void main(String [] args){

bikes b1= new bikes();
b1.Break();
b1.m2();

cars c1= new cars();
c1.Break();
c1.m1();

}}