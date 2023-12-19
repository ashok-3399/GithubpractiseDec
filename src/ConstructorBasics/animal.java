package ConstructorBasics;

public class animal {
//15-12-23
	//HW define constr for Animal class  ?
	//efine constructor
	animal()//default constructor
	{

		System.out.println("calling default constructor");
	}

	animal(String aname,String acolor)
	{
		System.out.println("2 PC constructor calling=");
		System.out.println("aname="+aname);
		System.out.println("acolor="+acolor);
	}

	public static void main(String []args)
	{
		animal an=new animal();
		animal an1=new animal("dog","white");
	}
}
