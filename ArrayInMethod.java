
public class ArrayInMethod {
  int sum = 0;
	
	int sumArray(int arr[])
	{
		for(int x:arr)
		{
		sum = sum + x;
		}
		return sum;
	}
	
	boolean maxCheck(int arr1[],int arr2[])
	{
		if(arr1[0] > arr2[arr2.length-1])
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInMethod ob = new ArrayInMethod();
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		int x = ob.sumArray(a);
		boolean r = ob.maxCheck(a,b);
		System.out.println("um of array is :" + x);
		System.out.println("result is :" + r);

	}

}
