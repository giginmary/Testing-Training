package multilevelInheritance;

public class C2 extends C1
{
	public void disp()
	{
	System.out.println("Result is " +result);
	}
	public static void main(String arg[]) {
		C1 obj1=new C1();
		C2 obj2=new C2();
		obj1.ans();
		obj2.disp();
		

	}

}
