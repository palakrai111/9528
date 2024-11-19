import java.util.Arrays;

public class Stringex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nayan"; 
		String s1 = "palaK";
		String s2 = new String("palak");
		int x=s1.compareTo(s);
		System.out.println(x);
		/*boolean b = s.equals(s1);
		
		if(b)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}*/
		
		
		/*String rev = "";
		for(int i = s.length()-1; i>=0;i--)
		{
			rev = rev + s.charAt(i);   // kalap
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
		   System.out.println("palindrome");	
		}else
		{
			System.out.println("not palindrome");
		}*/
		
		/*String s3 = "raue";
		String s4 = "care";
		
		if(s3.length()== s4.length())
		{
			char c1[] = s3.toCharArray();
			char c2[]=s4.toCharArray();
			Arrays.sort(c1); 
			Arrays.sort(c2);
			boolean b = Arrays.equals(c1, c2);
			if(b)
			{
				System.out.println("Anagram");
			}else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("strings are not anagram");
		}*/
		
		/*String s5 = "i am palak";
		int scount = 0;
		int ccount=0;
		for(int i = 0; i<=s5.length()-1;i++)
		{
			char c = s5.charAt(i);
		   if(c != ' ')
		   {
			  ccount++;   
		   }
		   else
		   {
			   scount++; 
		   }
		}
		
        System.out.println("ccount" + ccount);
        System.out.println("scount" + scount);
        String sr[]= s5.split(" ");
        System.out.println("wcount :" + sr.length);*/
		
		String s6 = "NAyaN";  // naYAn;
		String new1 = "";
		for(int i = 0; i<=s6.length()-1;i++)
		{
			char c = s6.charAt(i);
			if(c>='A'&& c<= 'Z')
			{
				int l = c + 32;
				char m = (char)l;
				new1 = new1 + m;
			}
			else
			{
				int l = c - 32;
				char m = (char)l;
				new1 = new1 + m;
			}
			
		}
		System.out.println(new1);
        
        
	}

}
