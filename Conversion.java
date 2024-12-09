import java.util.ArrayList;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Integer> a1 = new ArrayList<>();
	
	
	a1.add(11);
	a1.add(12);
	a1.add(13);
	a1.add(14);
	int b[] = new int[a1.size()];
	System.out.println(a1.size());
	for(int i = 0; i < a1.size();i++)
	{
		b[i]= a1.get(i);
	}
    for(int i = 0; i < b.length; i++)
    {
	   System.out.println(b[i]);
	}
    
    System.out.println("---convert array to arraylis----");
    
    int c[] = {1,2,3,4,5};
    
    ArrayList<Integer> d= new ArrayList<Integer>();
    
    for(int i = 0; i<c.length;i++)
    {
    	d.add(c[i]);
    }

    System.out.println(d);
}
}