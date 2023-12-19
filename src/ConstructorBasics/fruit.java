package ConstructorBasics;
//15-12-23
//HW define constr for fruit class
public class fruit {
	//define constructor
	//constructor --can be used to to initise the instance variables

	String fname;
	fruit()//constructor name and class name should be same
	{
		System.out.println("calling default fruit  constructor ");
	}

	fruit(String fname)
	{
		System.out.println("1 PC calling-");
		System.out.println("1 PC constructor calling="+fname);
	}

	fruit(String fname,int fid)
	{
		System.out.println("2 PC calling =");
		System.out.println("2 PC constructor fname="+fname);
		System.out.println("2 PC costructor fid="+fid);
	}

	public static void main(String[] args) {
		// call the constructor
		fruit fr=new fruit("apple");//1 PC  constructor
		fruit fr1=new fruit("banana",101);//2 PC constructor calling


	}

}
