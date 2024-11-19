
public class rotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[] =  {10,20,30,40,50}; // 20,30,40,50,10
		int temp = a[0];
		int i;
		for(i= 0; i < a.length-1; i++)
		{
		    a[i] = a[i+1];	
		}
         a[i] = temp;
         
         for(i= 0; i < a.length; i++)
 		{
 		   System.out.println(a[i]);	
 		}*/
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i= 0; i < a.length;i++)
		{                         
			//int sumrow = 0;
			int sumcol = 0;
			for(int j= 0; j < a.length;j++)
			{
				/*if(i>j) // (i<j)
				{//System.out.print("0");}else {
				System.out.print(a[i][j]);
				}*/
				
				//System.out.print(a[i][j]);
				//sumrow = sumrow + a[i][j];
				sumcol = sumcol + a[j][i];
				
			}
			System.out.println(sumcol);
			//System.out.println();
		}
		
		
		
		
         
	}

}
