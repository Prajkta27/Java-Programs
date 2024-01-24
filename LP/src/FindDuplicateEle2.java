import java.util.HashSet;
public class FindDuplicateEle2 {

	public static void main(String[] args)
	{
		int temp=-1;
		int arr[]= {6,5,2,7,9,5,8,2};
		
		HashSet<Integer> hs= new HashSet<>();
        for(int i=arr.length-1;i>=0;i--)
        {
        	if(hs.contains(arr[i]))
        	{
        		temp=i;
        	}
        	else
        	{
        		hs.add(arr[i]);
        	}
        	
        }
        if(temp!=-1)
        {
        	System.out.println("First duplicate element is at:"+arr[temp]);
        }
        else
        {
        	System.out.println("There is no duplicate element present in the list");
        }
	}

}
