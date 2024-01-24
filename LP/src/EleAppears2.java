
public class EleAppears2 {

	public static void main(String[] args)
	{
		int arr[]= {1,2,5,1,2};
		int res=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			res=res^arr[i];
		}
		System.out.println("The element that appears only once is:"+res);
	}

}
