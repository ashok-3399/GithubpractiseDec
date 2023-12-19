package MethodBasics;

public class MethodReturnTypeFloat {
	
	public static float add(float f1,float f2)
	{
		float result=f1+f2;
		System.out.println("float add result="+result);
		return result;
	}

	public static void main(String[] args) {
	 float fresult= add(2.3f,3.5f);
	 System.out.println("float result="+fresult);

	}

}
