
public class Comaparetwomatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,8},{0,5,6},{7,8,9}};
		
		boolean flag = true;
		for(int i= 0; i < a.length;i++)
		{                         
			
			for(int j= 0; j < a.length;j++)
			{
				if(a[i][j] != b[i][j])
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
		{System.out.println("arrays are identical");}
		else {
			System.out.println("arrays are not identical");
		}

	}

}
