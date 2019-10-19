//programme 18
//bank system



class Account{

String accountname;
long accountno;
double bal;
String add;
}

class Bank{

 public static void main(String[] args){

 Account a1 =new Account();

 a1.accountname="Neeraj";
 a1.accountno=40006126;
 a1.add="hydrabad";
 a1.bal=500.50;

Account a2 =new Account();

 a2.accountname="Roshni";
 a2.accountno=40009126;
 a2.add="punjab";
 a2.bal=5000.50;


      System.out.println("\nacname\t:"+a1.accountname);
	  System.out.println("acno\t:"+a1.accountno);
	  System.out.println("acbal\t:"+a1.bal);
	  System.out.println("add\t:"+a1.add);


      System.out.println("\nacname\t:"+a2.accountname);
	  System.out.println("acno\t:"+a2.accountno);
	  System.out.println("acbal\t:"+a2.bal);
	  System.out.println("add\t:"+a2.add);

    }

 }
