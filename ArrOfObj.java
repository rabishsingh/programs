// wap for implement array of object in java

class STUDENT{

	public int rollNo;
	public String Name;

	STUDENT(int rollNo,String Name){
		this.rollNo=rollNo;
		this.Name=Name;


   }
}

   public class ArrOfObj {
	   public static void main(String args[]){

        STUDENT[] arr;

		arr =new STUDENT[5];

        arr[0]=new STUDENT(1,"NEERAJ");
		arr[1]= new STUDENT(2,"ABhishek");
		arr[2]=new STUDENT(3,"AASHISH");
		arr[3]=new STUDENT(4,"CHETAN");
		arr[4]=new STUDENT(5,"ANKIT");


		for (int i=0;i<=arr.length;i++ )
	
			System.out.println("arrAt"+ i +":"+ arr[i].rollNo +"  "+arr[i].Name);


   }
   }
