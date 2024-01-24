import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Pass2 {
	public static void main(String[] Args) throws IOException{
		 
	     String temp;
	     
	     BufferedReader buff1 = new BufferedReader(new FileReader("D:\\intermediate.txt"));
	     BufferedReader buff2 = new BufferedReader(new FileReader("D:\\symbol_table.txt"));
	     BufferedReader buff3 = new BufferedReader(new FileReader("D:\\literal_table.txt"));
	     
	     FileWriter f1 = new FileWriter("E:\\programs\\lp\\Pass2.txt");
	     
	     HashMap<Integer, String> symSymbol = new HashMap<Integer, String>();
	     HashMap<Integer, String> litSymbol = new HashMap<Integer, String>();
	     HashMap<Integer, String> litAddr = new HashMap<Integer, String>();
	     
	     int symtabPointer=1,littabPointer=1,offset;
	    
	     while((temp=buff2.readLine())!=null){
	    	 String word[]=temp.split("\t\t\t");
	    	 symSymbol.put(symtabPointer++,word[1]);
	     }
	     
	     
	     while((temp=buff3.readLine())!=null){
	    	 String word[]=temp.split("\t\t");
	    	 litSymbol.put(littabPointer,word[0]);
	    	 litAddr.put(littabPointer++,word[1]);
	     }
	     
	     
	     while((temp=buff1.readLine())!=null){
	    	 if(temp.substring(1,6).compareToIgnoreCase("IS,00")==0){
	    		 f1.write("+ 00 0 000\n");
	    	 }
	    	 else if(temp.substring(1,3).compareToIgnoreCase("IS")==0){
	    		 f1.write("+ "+temp.substring(4,6)+" ");
	    		 if(temp.charAt(9)==')'){
	    			 f1.write(temp.charAt(8)+" ");
	    			 offset=3;
	    		 }
	    		 else{
	    			 f1.write("0 ");
	    			 offset=0;
	    		 }
	    		 if(temp.charAt(8+offset)=='S')
    				 f1.write(symSymbol.get(Integer.parseInt(temp.substring(10+offset,temp.length()-1)))+"\n");
    			 else
    	 			 f1.write(litAddr.get(Integer.parseInt(temp.substring(10+offset,temp.length()-1)))+"\n");
    	   	} 
	    	 else if(temp.substring(1,6).compareToIgnoreCase("DL,01")==0){
	    		 String temps1=temp.substring(10,temp.length()-1),temp2="";
	    		 for(int i=0;i<3-temps1.length();i++)
	    			 temp2+="0";
	    		 temp2+=temps1;
	    		 f1.write("+ 00 0 "+temp2+"\n");
	    	 }
	    	 else{
	    		 f1.write("\n");
	    	 }
	     }
	     f1.close();
	     buff1.close();
	     buff2.close();
	     buff3.close();
	}
}