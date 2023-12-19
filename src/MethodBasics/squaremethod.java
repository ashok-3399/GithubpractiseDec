package MethodBasics;

public class squaremethod {

	//HW : WAP to define seprate method - square given no  and pass some int no

	public static int square (int i)
	{
		int result=i*i;
		System.out.println("result="+result);
		return result;

	}

	public static void main(String[] args) {
		//HW : WAP to define seprate method - square given no  and pass some int no
		System.out.println("Inside main()");

		//Calling square(int i), to store return value in the variable 'res' as 'int' data type
		int res = square(2);

		System.out.println("The square value of 2 is : "+res);

		System.out.println("After Square()");



	}

}
