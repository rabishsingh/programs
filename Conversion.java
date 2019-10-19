class Conversion{

public static void main(String [] args){

byte b;
int i=256;
double d=323.142;

System.out.println("conversion of int to byte");
      b=(byte)i;

System.out.println("the value of b and i " + b + "  " +i);

System.out.println("Conversion of double to int");
       i=(int)d;
System.out.println("the value of i and double"+i+"  " +d);
        
System.out.println("Conversion of double to byte");
       b=(byte)d;

System.out.println("the value of b and d is"+b+"  " +d);


}
}

