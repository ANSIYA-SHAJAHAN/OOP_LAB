class CO1_qn1
{
   String pcode;
   String pname;
   int price;
   CO1_qn1(String x,String y,int z)
   {
	  pcode=x;
	  pname=y;
	  price=z;
   }
   int price()
   {
	   return price;
   }
 
  public static void main(String args[])
  {
	 
	  CO1_qn1 p1=new CO1_qn1 ("abc","book",255);
	  int price1=p1.price();
	  CO1_qn1 p2=new CO1_qn1("efg","pencil",55);
	  int price2=p2.price();
	  CO1_qn1 p3=new CO1_qn1("hig","box",30);
	  int price3=p3.price();
	  
	  if(price1<price2 && price1<price3)
	  {
		  System.out.println("price of product 1 is small");
	  }
	  else if(price2<price3 && price2<price1)
	  {
		  System.out.println("price of product2 is small");
	  }
	  else
	  {
		  System.out.println("price of third is small");
	  }
	  
  }
	
}


