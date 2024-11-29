
public class CartItems extends ProductDesc
{
      int quantity;
      void display()
      {
    	  System.out.println(quantity + pname+pid+desc + category);
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartItems ob = new CartItems();
		ob.setPid(101);
		ob.setDesc("electricity");
		ob.setPname("tubelight");
		ob.setCategory("electric");
		ob.quantity = 10;
		//System.out.println(ob);
		ob.display();
		
	}

}
