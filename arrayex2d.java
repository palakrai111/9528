
public class arrayex2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int m[][] = {{1,2,3},{4,5,6},{7,8,9}};
		  int n[][] = {{1,2,3},{4,5,6},{7,8,9}};
		  int s[][] = new int[3][3];
		  for(int i = 0; i < m.length;i++)
		  {
			  for(int j = 0; j < n.length;j++)
			  {
				  s[i][j] = m[i][j]+n[i][j];
			  }
			  
			  
		  }
		  
		  for(int i = 0; i < m.length;i++)
		  {
			  for(int j = 0; j < n.length;j++)
			  {
				  System.out.print(s[i][j] + " ");
			  }
			  
			System.out.println();  
		  }
		  
		  
	}

}
