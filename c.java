interface A{

void m1();
}

interface B{

void m1();

}

class c implements A,B{
 public void m1(){

System.out.println("m1");
 }
public static void main(String [] args){


c obj =new c();
obj.m1();


}
}
