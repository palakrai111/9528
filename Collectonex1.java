import java.util.*;
public class Collectonex1 {

	   static void print(int x)
	   {
		   int y = x+ 10;
		   System.out.println(y);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(11);
		a1.add(12);
		a1.add(13);
			System.out.println(a1);
		//System.out.println(a1.get(8));
		
		System.out.println(a1.contains(11));
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		if(a2.isEmpty())
		{
		   a2.addAll(a1);	
		}
		else
		{
			System.out.println("not empty");
		}
		
		System.out.println(a2);
		
		
		/*for(int x : a2)
		{
			int y = x+ 10;
			System.out.println(y);
		}*/
		
		
		
		/*Iterator itr = a2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		a1.forEach(x -> print(x));
   
	}

}
