package MethodBasics;

public class Predefinedmethods1 {
	
	public static int  squareno(int n)
	{
		 double sqrresult=Math.sqrt(n);
		System.out.println("sqaureno="+sqrresult);
		return n*n;
	}

	public static void main(String[] args) {
		squareno(2);

	}

}
