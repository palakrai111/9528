import java.util.Arrays;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "naYAn";
		String s1 = "aann";
		/*String rev = "";
		for(int i = s.length()-1; i >=0; i--)
		{
		   rev = rev + s.charAt(i);
		}
		System.out.println(rev);
        if(s.equals(rev))
        {
        	System.out.println("equal");
        }
        else
        {
        	System.out.println("not equal");
        }*/
	/*char c1[] = s.toCharArray();
	char c2[] = s1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b = Arrays.equals(c1,c2);
		System.out.println(b);
		if(b) 
		{System.out.println("ana");}else
		{System.out.println("n ana");}*/
		
		String new1 = "";
		
		for(int i = 0 ; i <= s.length()-1;i++)
		{
			char c = s.charAt(i);
			if(c>='A'&& c<='Z')
			{
				int c2 = c+32;
				char x = (char)c2;
				new1 = new1 + x;
			}else 
			{
				int c2 = c - 32;
				char x = (char)c2;
				new1 = new1 + x;
			}
		}
		
		System.out.println(new1);
		
	}

}
