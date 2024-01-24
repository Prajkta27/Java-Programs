import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) 
	{
		int arr[]={6,5,2,9,8,5,7,2};
		System.out.println("Duplicate elements are");
		Set<Integer> s= new HashSet<>();
        for(int no:arr)
        {
        	boolean b=s.add(no);
        	if(b==false)
        	{
        		System.out.print(no+" ");
        	}
        }
        
        
	}

}
