package ReturntypeArray;

public class FloatArray {
	//06-12-23
	//-HW : WAP to Define method  and return float array    and display array values  in main()  ?

	public static float[] fArray()
	{
		float f1[]=new float[3];
		f1[0]=2.3f;
		f1[1]=2.4f;
		f1[2]=2.5f;

		return f1;
	}
	public static void main(String[]args)
	{
		System.out.println("Inside main()");

		//Calling fArray(), and storing the return values in the Array variable 'res' of type float[]
		float[] res = fArray();

		for(float farr : res) //Displaying array value by using for each loop
		{			
			System.out.println("The array value is :"+ farr);
		}	
		System.out.println("After fArray()");
	}


}
