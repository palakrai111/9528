import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile1 m1 = new Mobile1("oppo",500);
		Mobile1 m2 = new Mobile1("oppo",600);
		Mobile1 m3 = new Mobile1("vivo",700);
		Mobile1 m4 = new Mobile1("vivo",800);
		
		
		
		HashMap<Integer , String> hm = new HashMap<Integer , String>();
		
		hm.put(1, "palak");
		hm.put(2, "nayan");
		hm.putIfAbsent(3,"mmmm");
		
		System.out.println(hm);
		System.out.println("gd"+hm.getOrDefault(4,"palak"));
		
		
		for(Map.Entry<Integer,String> x : hm.entrySet())
		{
			System.out.println(x.getValue() + " " + x.getKey());
		}
		
		Set<Integer> s = new HashSet<Integer>();
		System.out.println(hm.values());
		s = hm.keySet(); // [1,2]
		for(int i : s)
		{
			System.out.println(hm.get(i));
		}

		// mobile
		HashMap<String , Mobile1> hm1 = new HashMap<String , Mobile1>();
		hm1.put("A", m1);
		hm1.put("B", m1);
		hm1.put("C", m1);
		hm1.put("D", m1);
		
		Set<String> s1 = new HashSet();
		s1 = hm1.keySet();
		for(String v : s1)
		{
		System.out.println(hm1.get(v));
		}
		
		
	}

}
