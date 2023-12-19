package InheritanceBasics;

public class B1  extends A1
{
	int b=20;
	//multi level inheritance
	void M3()
	{
	System.out.println("calling B1 class-M3() from C1 class");
	}
public static void main(String[] args)
{
	B1 bref=new B1();
	bref.M1();
}


}
