public class FindFirstDuplicateEle {

	public static void main(String[] args) 
	{
		int[] arr= {6,5,2,7,5,9,2};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && (i!=j))
				{
					System.out.println(arr[j]);
					temp=temp+1;
					break;
					
				}
			}
			if(temp>0)
			{
				break;
			}
			
		}
		

	}

}
