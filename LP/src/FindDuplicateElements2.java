import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElements2 {

	public static void main(String[] args)
	{
		
		int arr[]= {1,5,2,8,9,5,7,2};
		Map<Integer, Integer> hm= new HashMap<>();
        for(int no:arr)
        {
        	Integer count =hm.get(no);
        	if(count==null)
        	{
        		hm.put(no,1);
        	}
        	else
        	{
        		count=count+1;
        		hm.put(no, count);
        	}
        }
        //print duplicate elements
        System.out.println("Duplicate elements are:");
        Set<Map.Entry<Integer, Integer>> es=hm.entrySet();
        for(Map.Entry<Integer, Integer> me:es)
        {
        	if(me.getValue()>1)
        	{
        		System.out.print(me.getKey());
        	}
        }
	}

}
