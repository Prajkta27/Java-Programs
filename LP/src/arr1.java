
public class arr1 
{
	public static void main(String[] args)
	{
		int arr1[]= {2,5,4,6,7};
		System.out.println(findLargestElement(arr1));
		
		int arr2[]= {10,0,30,60,40};
		System.out.println(findLargestElement(arr2));
		

	}
	static int findLargestElement(int arr[])
	{
		int max= arr[0];
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i] > max)
			{
				max= arr[i];
			}
		}
		return max;
	}

}
