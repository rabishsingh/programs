//PROGRAM 31 (NON STATIC) 

class Example6 {

	int x=10;
	int y=20;

	void setxy(){
		
		x=50;
		y=60;

	}

	void printxy(){

	   System.out.println("x:"+x);
	   System.out.println("y:"+y);
	    
	}
		void m1(){
			setxy();
			printxy();
		}

		public static void main(String[] args){
			Example6 e1 = new Example6();
			e1.m1();
		}

}