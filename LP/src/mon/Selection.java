package mon;

public class Selection {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int idx = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[idx]){  
                    idx = j; //lowest index  
                }  
            }  
            int smallerNo = arr[idx];   
            arr[idx] = arr[i];  
            arr[i] = smallerNo;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {18,24,33,2,43,10,58,42};  
        System.out.println("Before sorting");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1); //using selection sort for sorting
         
        System.out.println("After Sorting");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  
