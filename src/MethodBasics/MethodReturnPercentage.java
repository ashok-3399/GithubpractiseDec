package MethodBasics;

public class MethodReturnPercentage {
	
	
	public static int percentage(int a,int b)
	{
		int result=a%b;
	System.out.println("percentage result="+result);
	return result;
	}

	public static void main(String[] args) {
	
     int percentageresult=percentage(30,5);
     System.out.println("percentageresult="+percentageresult);


	}

}
