import java.util.*;
import java.util.Set;
import java.util.HashSet;
public class Revsion 
{
	public static void main(String args[])
	{
		int temp;
		int j;
		
		int arr[]= {40,60,50,90,10};
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}
}