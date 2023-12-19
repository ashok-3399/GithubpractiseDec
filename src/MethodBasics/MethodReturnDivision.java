package MethodBasics;

public class MethodReturnDivision {

	public static int add (int a,int b)
	{
		int result =a/b;
		System.out.println("division result="+result);
		return result;
	}
  



	public static void main(String[] args) {

		int divresult=add(30,5);
		System.out.println("div result="+divresult);
	}

}
