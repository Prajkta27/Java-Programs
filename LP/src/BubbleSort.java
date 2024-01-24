
public class BubbleSort {

	public static void main(String[] args)
	{
		int temp;
		int flag=0;
		int arr[]= {36,19,29,12,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		
	}

}
