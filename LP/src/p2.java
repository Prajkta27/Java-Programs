import java.util.Scanner;
		public class p2 {

		 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter row size");
			int row_size=sc.nextInt();
			for(int i=0;i<=row_size;i++)
			{
				for(int j=row_size;j>=i;j--)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
			sc.close();
		 }
		

	

}
