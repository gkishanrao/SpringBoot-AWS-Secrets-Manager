package com.nirwantech.springboot_aws_secrets_manager.Util.TestJava8;



public class SingletonABC {
	
	public  SingletonABC() {

		System.out.println("SingletonABC.SingletonABC()1111");
	}
	  public static SingletonABC obj=new SingletonABC();
	 	  public static SingletonABC getSingletonABC() {
	  	  	  return obj;


	  }

	public static void main(String[] args) {

		  SingletonABC ob=SingletonABC.getSingletonABC();
		  System.out.println("SingletonABC.main()"+ob); SingletonABC
		  ob1=SingletonABC.getSingletonABC();

		  System.out.println("SingletonABC.main()"+ob1);

	
		
		
	}

}
