package MethodBasics;

public class checkevenno {
	
	//05-12-23
	//Return type String :
	//-------------------
	//HW  WAP to define method i.e checkEvenNo  and pass argument as int no, 
		//if it is even no, return "Yes" value 
		//             else return "No" value and display the result in main()? 
	
	public static String checkeven(int no)
	{
		int rem=no%2;
		if(rem==0)
		{
			System.out.println("the given no="+no + " the given no evenno");
			return "YES";
		}
		else
		{
			System.out.println("the given no="+no +"the given no  not evenno");
			return "NO";
		}
	}

	public static void main(String[] args) {
		checkeven(8);

	}

}
