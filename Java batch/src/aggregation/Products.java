package aggregation;

public class Products 
{
	float price1,price2,price3,price4,price5;
	Customer cust;
	
	public void purchase(float p1,float p2,float p3,float p4,float p5,Customer cust) 
	{
		this.price1=p1;
		this.price2=p2;
		this.price3=p3;
		this.price4=p4;
		this.price5=p5;
		this.cust=cust;
		
	}
	
	public void total() 
	{
		float totalprice=price1+price2+price3+price4+price5;
		if(totalprice>=2000)
		{
			float discount=totalprice*0.2f;
			totalprice=totalprice-discount;
			System.out.println("Discounted Total price:"+totalprice);
		}
		else
		{
			//float totalprice==totalprice;
			System.out.println("Not eligible for Discount,Total price:"+totalprice);
		}
	}

	public static void main(String[] args)
	{
		Customer obj=new Customer();
		obj.details("25-10-2021","FO229",828149);
		Products obj1=new Products();
		obj1.purchase(250.75f,350.50f,445.80f,500.25f,600.85f,obj);
        obj1.total();
        
        Customer obj2=new Customer();
		obj2.details("26-10-2021","FO230",99999);
		Products obj3=new Products();
		obj3.purchase(100.75f,50.50f,45.80f,120.25f,10.85f,obj2);
        obj3.total();
        
        Customer obj4=new Customer();
		obj4.details("26-10-2021","FO230",99999);
		Products obj5=new Products();
		obj5.purchase(1000.75f,50.50f,450.80f,120.25f,510.85f,obj4);
        obj5.total();
        
        
        
	}


}