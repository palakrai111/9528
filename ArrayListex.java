import java.util.ArrayList;

public class ArrayListex {
	
	static void print(int n)
	{
		int z = n+ 10;
		System.out.println("no is"+z );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1 = new ArrayList();
		int y;
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.forEach(x-> System.out.println(x));
		a1.forEach((x)-> print(x));
		for(int i : a1)
		{
			System.out.println(i);
		}
		

	}

}
