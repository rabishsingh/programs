//Develop a programme to create BankAc of a Customer with the vales BankName,Branch,Ifsc,AcNo,AcHolder,Bal.
//initialize above variables with dynamic values using methods create Bankaccount,initialize above variables in the account display the values;

class BankAccount{
   
   static String BankName;
   static String Ifsc;
   static String Branch;

   long AcNo;
   String AcName;
   double Bal;

   static void setBankName(String BankName){

   BankAccount.BankName=BankName;

   }

   static void setBranch(String Branch){

   BankAccount.Branch=Branch;
   }

   static void setIfsc(String Ifsc){
    BankAccount.Ifsc=Ifsc;

    }



   void Display(){
   System.out.println("BankName:"+BankName);
   System.out.println("Branch:"+Branch);
   System.out.println("Ifsc:"+Ifsc);
   System.out.println("AcNo:"+AcNo);
   System.out.println("AcName:"+AcName);
   System.out.println("Bal:"+Bal);
 
   }



     class Bank1{

    public  void main(String[] args){

    BankAccount acc1=new BankAccount();
    acc1.Display();
    acc1.setBankName("hdfc");
    acc1.setBranch("ameerpet");
    acc1.setIfsc("hd11f");
    
	
	acc1.Display();
    
	}

   }
}