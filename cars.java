class vechile{

public void Break(){

System.out.println("all vechiles have break");

}

}

class cars extends vechile{

public static void main(String [] args){

cars c1= new cars();
c1.Break();

}
}