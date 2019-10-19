//program 23
//8/30/2018
//parameter and local variable oniy get memory when we call method and the memory is destryed once method executoin is compl.
/*the parameter and local variable svope is only within the same and enclosing 
method it means we cannot access then from another method compiler will thrown error.*/
class Addition1{

static void add(int a,int b){

	int c=a+b;

	System.out.println(c);
	
}
   public static void main(String[] args){

	   add(5,6);
	   add(7,8);

   }

}