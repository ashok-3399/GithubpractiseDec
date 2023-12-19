package InheritanceBasics;

public class C1 extends B1 {
	//multi level inheritance
	
	public static void main(String[] args) {
		C1 cref=new C1();
		cref.M3();
		A1 aref=new A1();
		System.out.println("calling A1 var="+aref.a);
		aref.M1();
	}

}
