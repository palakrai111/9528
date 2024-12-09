import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");  
		   deque.addFirst("palak");
		   deque.addLast("gagan");
		   deque.offer("abc");
		   
		   
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  

		   
	}

}
