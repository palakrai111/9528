
public class Rotationofarray {
	
	public static void main(String args[])   
	{
		int i;
		int a[] = {5,6,7,8,9};
		/*int temp = a[0];
		for( i = 0;i < a.length-1; i++)
		{
			a[i] = a[i+1];
		}
		a[i] = temp;
		System.out.println("left rotation of array");
		for(int j = 0;j< a.length; j++)
		{
			System.out.println(a[j]);
		}*/
		
		System.out.println("right rotation of array");
		int temp1 = a[a.length-1]; // 9 ( last element )
		for( i = a.length-1;i > 0; i--)
		{
			a[i] = a[i-1];
		}
		a[i]= temp1;
		for(int j = 0;j< a.length; j++)
		{
			System.out.println(a[j]);
		}
	}

}
