//programme no 30
//wap to explain static varibles memory is stored to all methods of same class
//or another class those are loaded in java class

class Example30 {

	static int a =10;

	static void Store(){
		a=50;
	}
  
	static void Read(){
		System.out.println(a);
	}

	static void Modify()
	{

		a=70;
	}
}


 
 