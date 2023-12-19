package MethodBasics;

public class MethodReturnCharVal {
	
	public static char add()
	{
		System.out.println("inside add method");
		return 'A';
	}

	public static void main(String[] args) {
		
		char ch= add();
		System.out.println("char value="+ch);
	}

}
