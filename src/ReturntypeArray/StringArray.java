package ReturntypeArray;

public class StringArray {
	//07-12-23
	//HW : WAP to Define method  and return String array  and display array values  in main()

	public static String[] SArray()
	{
		String S1[] = new String[3];

		S1[0] = "Ram";
		S1[1] = "Sita";
		S1[2] = "Lakshman";

		return S1; //['A,'B','C']
	}

	public static void main(String[] args) {

		System.out.println("Inside main()");

		//Calling SArray(), and storing the return values in the Array variable 'res' of type String[]
		String[] res = SArray();

		for(String sarr : res) //Displaying array value by using for each loop
		{			
			System.out.println("The array value is :"+ sarr);
		}	
		System.out.println("After SArray()");
	}

}
