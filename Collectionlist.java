import java.util.*;
public class Collectionlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector v = new Vector();
     v.add(11);
     v.add(12);
     v.add(13);
     Enumeration e = v.elements();
     while(e.hasMoreElements())
     {
    	 System.out.println(e.nextElement());
     }
     
     
     Stack s = new Stack();
     s.push(12);
     s.push(13);
     s.push(18);
     s.push(19);
     System.out.println(s);
     s.pop();
     s.pop();
     System.out.println(s);
     System.out.println(s.peek());
     
     HashSet hs = new HashSet();
     hs.add(11);
     hs.add(11);  
     hs.add(13);
     hs.add(50);
     
     System.out.println(hs);
     
     
     LinkedHashSet hs1 = new LinkedHashSet();
     hs1.add(11);
     hs1.add(11);  
     hs1.add(13);
     hs1.add(50);
     System.out.println(hs1);
     
     
     TreeSet hs2 = new TreeSet();
     hs2.add(100);
     hs2.add(150);  
     hs2.add(13);
     hs2.add(50);
     System.out.println(hs2);
     
     
	}

}
