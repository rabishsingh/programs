//program 28


class Student{
	
	int sno;
	String sname;
	String course;
	double fee;

}

class College2
{
  void join(Student s) {

	  System.out.println(s.sno);
	  System.out.println(s.sname);
	  System.out.println(s.course);
      System.out.println(s.fee);



	Student getStudent(){

	Student s1=new Student();
	
	s1.sno=102;
	s1.sname="nneraj";
	s1.course="core java";
	s1.fee=1000;
	return s1;

	}
  }

   public static void main(String[] args){

      College2 c1=new College2();

      Student s1=new Student();
	
    	s1.sno=101;
	    s1.sname="abhi";
	    s1.course="a java";
	    s1.fee=1050;
	 
	    c1.join(s1);

	Student s2=c1.getStudent();

      System.out.println(s2.sno);
	  System.out.println(s2.sname);
	  System.out.println(s2.course);
      System.out.println(s2.fee);

       }

  }




