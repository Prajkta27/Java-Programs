
import java.util.Scanner;  
public class scalar 
{  
    public static void main(String[] args) 
    {  
        String str;  
        Scanner sc=new Scanner(System.in);                     
        System.out.print("Enter a String: ");  
        str=sc.nextLine(); 
        int count;  
          
        //Converts a string into a character array  
        char string[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in the string: ");  
        
        //Counts the characters in the string  
        for(int i = 0; i <string.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) 
            {  
                if(string[i] == string[j] && string[i] != ' ') 
                {  
                    count++;  
                    
                    //Set string[j] to 0 
                    //to avoid printing visited character  
                    string[j] = '0';  
                }  
            } 

            //If the count is greater than 1
            //a character is considered duplicate  
            if(count > 1 && string[i] != '0')  
            System.out.println(string[i]);  
        }  
    }  
}

