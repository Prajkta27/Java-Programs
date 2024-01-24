import java.util.ArrayList;
public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==0)
        	{
        		al1.add(arr[i]);
        	}
        	else
        	{
        		al2.add(arr[i]);
        	}
        }
        System.out.println("Even Numbers are:");
        int total1=0;
        for(int no:al1)
        {
        	total1=total1+no;
        	System.out.print(no+" ");
        	
        }
        System.out.println("\n");
        System.out.println("Sum of all even numbers:"+total1);
    	System.out.println("Total number of odd numbers present:"+al1.size());
    	System.out.println("\n");
    	
        
        System.out.println("Odd Numbers are:");
        int total2=0;
        for(int no:al2)
        {
        	total2=total2+no;
        	System.out.print(no+" ");
        	
        }
        System.out.println("\n");
        System.out.println("Sum of all odd numbers:"+total2);
    	System.out.println("Total number of even numbers present:"+al2.size());
    	
	}

}
