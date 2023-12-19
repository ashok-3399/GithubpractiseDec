package ReturntypeArray;
//06-12-23
//HW : WAP to Define method  and return char array    and display array values  in main()
public class CharArray {

	public static char [] CArray()
	{
		char ch[]=new char[3];
		ch[0]='A';
		ch[1]='B';
		ch[2]='C';
		return ch;


	}

	public static void main(String[] args) {
		System.out.println("Inside main()");

		//Calling CArray(), and storing the return values in the Array variable 'res' of type char[]
		char[] res = CArray();

		for(char carr : res) //Displaying array value by using for each loop
		{			
			System.out.println("The array value is :"+ carr);
		}	
		System.out.println("After CArray()");



	}

}
