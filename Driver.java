interface Vechile{
   
   void engine();
   void breaks();
   
   }

   abstract class Bus implements Vechile{

     public void breaks(){
        
	System.out.println("Bus has two breaks");
	
	}
   }

     class RedBus extends Bus{

	  public void engine(){
	      
	      System.out.println("RedBus engine capacity is 40 kmph");
	      }

         }
     
     class Volvo extends Bus{
         
	 public void engine(){
	    
	      System.out.println("Volvo engine capacity is 110 kmph");
	   
	   }

     }

 // User programe

 class Driver{

    public static void main(String args[]){

    Vechile v;

    v = new RedBus();
    v.engine();
    v.breaks();
    
    v = new Volvo();
    v.engine();
    v.breaks();
    }
    }

