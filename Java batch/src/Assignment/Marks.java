package Assignment;
 class Marks
	{
		int mark1=60,mark2=75,mark3=80,totalmarks;
		static float avg;
		public Marks()
		{
			totalmarks=mark1+mark2+mark3;
			avg=totalmarks/3;
			System.out.println("Student 1");
			System.out.println("Total Marks:"+totalmarks);
			System.out.println("Average:"+avg);
			Marks.display();	
		}
		public Marks(int mark1,int mark2,int mark3)
		{
			totalmarks=mark1+mark2+mark3;
			avg=totalmarks/3;
			System.out.println("Student 2");
			System.out.println("Total Marks:"+totalmarks);
			System.out.println("Average:"+avg);
			Marks.display();	
		}
		
		public static void display()
		{
			
			if(avg>=80)
			{
				System.out.println("A Grade");
			}
			else if(avg>=70)
			{
				System.out.println("B Grade");
			}
			else if(avg>=60)
			{
				System.out.println("C Grade");
			}
			else if(avg>=50)
			{
				System.out.println("D Grade");
			}
			else
			{
				System.out.println("Failed");
			}
		}
		

		public static void main(String[] args)
		{
			Marks obj=new Marks();
			Marks obj1=new Marks(80,78,90);
			
		}
			
}




	