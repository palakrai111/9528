
public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {1,2,2,3,5};
		for(int i = 0; i <a.length;i++)
		{int temp = 0;
			for(int j = 0; j<a.length;j++)
			{
				if((a[i] == a[j])&&(i!=j))
				{
					temp++;
					//System.out.println(a[i]);
					break;
					
				}
				
			}
			if(temp == 0)
			{
				System.out.println(a[i]);
				
			}
			
		}
		


	}

}
