package methodOverriding;


	
	public class C1 extends P1
	{
		int sum;
		public void add(int a,int b)
		{
		sum=a+b;
		System.out.println("Child class sum :"+sum);
	
	}
	public static void main(String[] args) {
		C1 obj=new C1();
		obj.add(10, 20);

	}

}
