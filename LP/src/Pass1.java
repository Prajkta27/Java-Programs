import java.io.*;
class Pass1
{
	public static void main(String args[])throws Exception
	{
		FileReader fp=new FileReader("D:\\in.txt");
		BufferedReader bufr = new BufferedReader(fp);		
		 final int MAX=100;
		 String sybltb[][]=new String[MAX][3];
		 String optb[][]=new String[MAX][3];
		 String ltb[][]=new String[MAX][2];
		 int plTb[]=new int[MAX];
		 String lne=null;
			int LC=0,symTabLine=0,opTabLine=0,litTabLine=0,poolTabLine=0,ln_c=0;
	

		 System.out.println("=============================================");
		   
		 while((lne = bufr.readLine()) != null)
		     {
		     	 String[] tkns = lne.split("\t");
		     	if(ln_c==0)
		     	{
		     		LC=Integer.parseInt(tkns[1]);			
		     		for(int i=0;i<tkns.length;i++)		
		     	 		System.out.print(tkns[i]+"\t");
		     	 	System.out.println("");
		     	}
		     	else
		     	{
			     	 for(int i=0;i<tkns.length;i++) 
			     	 	System.out.print(tkns[i]+"\t");
			     	 System.out.println("");
			     	if(!tkns[0].equals(""))
			     	{
			     		sybltb[symTabLine][0]=tkns[0];
			     		sybltb[symTabLine][1]=Integer.toString(LC);
			     		sybltb[symTabLine][2]=Integer.toString(1);
			     		symTabLine++;
			     	}
				else if(tkns[1].equalsIgnoreCase("DS")||tkns[1].equalsIgnoreCase("DC"))
				{
					sybltb[symTabLine][0]=tkns[0];
			     		sybltb[symTabLine][1]=Integer.toString(LC);
			     		sybltb[symTabLine][2]=Integer.toString(1);
			     		symTabLine++;
				}

				if(tkns.length==3 && tkns[2].charAt(0)=='=')
				{ltb[litTabLine][0]=tkns[2];
				 ltb[litTabLine][1]=Integer.toString(LC);
			     litTabLine++;
				}
	
				else if(tkns[1]!=null)
				{
					optb[opTabLine][0]=tkns[1];
					
					if(tkns[1].equalsIgnoreCase("START")||tkns[1].equalsIgnoreCase("END")||
							tkns[1].equalsIgnoreCase("ORIGIN")||
							tkns[1].equalsIgnoreCase("EQU")||tkns[1].equalsIgnoreCase("LTORG"))
					{
			     			optb[opTabLine][1]="AD";
						optb[opTabLine][2]="R11";					
					}			     	
					else if(tkns[1].equalsIgnoreCase("DS")||tkns[1].equalsIgnoreCase("DC"))
					{
						optb[opTabLine][1]="DL";
						optb[opTabLine][2]="R7";					
					}
					else
					{
						optb[opTabLine][1]="IS";
						optb[opTabLine][2]="(04,1)";
					}
			     	opTabLine++;
				}
		        }
		        ln_c++;
		        LC++;
		    }   

			System.out.println("_______");  

			
			System.out.println("\n\n	SYMBOL TABLE		");
			System.out.println("=============================");			
			System.out.println("SYMBOL\tADDRESS\tLENGTH");
			System.out.println("=============================");			
			for(int i=0;i<symTabLine;i++)
				System.out.println(sybltb[i][0]+"\t"+sybltb[i][1]+"\t"+sybltb[i][2]);
			System.out.println("=============================");

			System.out.println("\n\n	OPCODE TABLE		");
			System.out.println("=============================");			
			System.out.println("MNEMONIC\tCLASS\tINFO");
			System.out.println("=============================");			
			for(int i=0;i<opTabLine;i++)
				System.out.println(optb[i][0]+"\t\t"+optb[i][1]+"\t"+optb[i][2]);
			System.out.println("=============================");

		
			System.out.println("\n\n   LITERAL TABLE		");
			System.out.println("-----------------");			
			System.out.println("LITERAL\tADDRESS");
			System.out.println("-----------------");			
			for(int i=0;i<litTabLine;i++)
				System.out.println(ltb[i][0]+"\t"+ltb[i][1]);
			System.out.println("------------------");
	

			
			for(int i=0;i<litTabLine;i++)
			{
				if(ltb[i][0]!=null && ltb[i+1][0]!=null ) 
				{
					if(i==0)
					{
						plTb[poolTabLine]=i+1;
						poolTabLine++;
					}
					else if(Integer.parseInt(ltb[i][1])<(Integer.parseInt(ltb[i+1][1]))-1)
					{	
						plTb[poolTabLine]=i+2;
						poolTabLine++;
					}
				}
			}
		
			System.out.println("\n\n   POOL TABLE");
			System.out.println("-----------------");			
			System.out.println("LITERAL NUMBER");
			System.out.println("-----------------");			
			for(int i=0;i<poolTabLine;i++) {
				System.out.println(plTb[i]);}
			System.out.println("------------------");
			
		
		     
		    bufr.close();
	}
}