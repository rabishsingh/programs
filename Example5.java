//programme 29
//sshowing always static variable are executed first than main method;


class Example5{

	static int a=10;
	public static void main(String[] args){

		System.out.println("a:"+a);

        System.out.println("b:"+b);

	}

	static int b =20;

}
