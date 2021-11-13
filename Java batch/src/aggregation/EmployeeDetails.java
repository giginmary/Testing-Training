package aggregation;

public class EmployeeDetails
{
	String id,name,department;
	long salary;
	EmployeeAddress adr;
	
	public void details(String id,String name,String dep,long sal,EmployeeAddress adr)
	{
		this.id=id;
		this.name=name;
		this.department=dep;
		this.salary=sal;
		this.adr=adr;
		
	}
	public void display()
	{
	System.out.println("Name :" +name);
	System.out.println("ID :"+id);
	System.out.println("Salary :"+salary);
	System.out.println("Department :"+department);
	System.out.println("Address Line1 :"+adr.addressL1);
	System.out.println("Address Line2 :"+adr.addressL2);
	System.out.println("Street :"+adr.street);
	System.out.println("Street :"+adr.dist);
	System.out.println("pincode :"+adr.pin);
	System.out.println("****************************");
	}
	public static void main(String arg[])
	{
		EmployeeAddress obj=new EmployeeAddress();
		obj.address("karuvelil","Muttar","Neerattupuram","Alappuzha",689571);
		EmployeeDetails obj1=new EmployeeDetails();
		obj1.details("Gigin", "FF2233","QC", 10000,obj);
		obj1.display();
		
		EmployeeAddress obj2=new EmployeeAddress();
		obj2.address("Binnn","IndiraNagar","Bangalore","Karnataka",12229);
		EmployeeDetails obj3=new EmployeeDetails();
		obj3.details("Riya", "FF2234","DEV", 200000,obj2);
		obj3.display();
		
		EmployeeAddress obj4=new EmployeeAddress();
		obj4.address("Binnn","IndiraNagar","Bangalore","Karnataka",12229);
		EmployeeDetails obj5=new EmployeeDetails();
		obj5.details("Kartika", "FF2244","DB", 200000,obj4);
		obj5.display();
		
		
	}
	
	

}
