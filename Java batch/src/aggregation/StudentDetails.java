package aggregation;

public class StudentDetails
{
	String name,id;
	StudentAddress adr;
	
	public void details(String nm,String id,StudentAddress adr)
	{
		this.name=nm;
		this.id=id;
		this.adr=adr;
		
	}
	
	public void display()
	{
		System.out.println("Name :" +name);
		System.out.println("id :" +id);
		System.out.println("address1 :" +adr.address1);
		System.out.println("address2 :" +adr.address2);
		System.out.println("street :" +adr.street);
		System.out.println("district :" +adr.district);
		System.out.println("pincode :" +adr.pincode);
		
		System.out.println("**************************");
		
	}

	public static void main(String[] args) 
	{
		StudentAddress obj=new StudentAddress();
		obj.address("Kondackal","Neerattupuram","Block 1","Alappuzha",892833);
		StudentDetails obj1=new StudentDetails();
		obj1.details("Jiby","FF9911",obj);
		obj1.display();
		
		StudentAddress obj2=new StudentAddress();
		obj2.address("Karuvelil","Karikuzhy","Block 2","Alappuzha",689533);
		StudentDetails obj3=new StudentDetails();
		obj3.details("Jijin","FF9912",obj2);
		obj3.display();
		
	}

}
