class product
{
   String pcode;
   String pname;
   int price;
   product(String x,String y,int z)
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
	 
	  product p1=new product ("abc","book",255);
	  int price1=p1.price();
	  product p2=new product("efg","pencil",55);
	  int price2=p2.price();
	  product p3=new product("hig","box",30);
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



