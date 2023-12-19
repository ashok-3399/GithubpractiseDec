package MethodBasics;

public class checkoddno {
	//HW WAP  to define method   to check given no is odd no  and return some char o/p

	public static char checkodd(int no)
	{
		int rem=no%2;

		if(rem==0)
		{
			System.out.println("check the given no=" +no  +"given no is even number");
			return 'Y';

		}
		else
		{
			System.out.println("check the given no=" +no  +" given no is odd number");
			return 'N';
		}
	}

	public static void main(String[] args) {
		checkodd(3);


	}

}
