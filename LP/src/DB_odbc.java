import java.sql.*;
import java.util.Scanner;

class DB_odbc {  
	static int choice;
	static Scanner sc;
	
     Connection conn;

	public DB_odbc(Scanner sc)throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");  
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praju","root","Praju@123");  
          //obtain mysql

		DB_odbc.sc=sc;
		}

	private static void displayMenu() {
    	//display menu options
    	System.out.println("1.INSERT");
    	System.out.println("2.UPDATE");
    	System.out.println("3.DELETE");
    	System.out.println("4.EXIT");

    	//accept choice from user
    	System.out.println("Enter Your Choice: ");
    	if(sc.hasNextInt())
    	choice=sc.nextInt();
    	}
     
    public static void main(String args[]){  
        try{  
            Scanner sc = new Scanner(System.in);

            DB_odbc tu;
            try {
            tu = new DB_odbc(sc);
            do {
            		displayMenu();

            switch(choice) {
            case 1:tu.insert();
            break;
            case 2:tu.update();
            break;
            case 3:tu.delete();
            break;
            default:
            	break;
            }
            }while(choice != 4);

            } catch (ClassNotFoundException e) {
            e.printStackTrace();
            } catch (SQLException e) {
            e.printStackTrace();
            }
            sc.close();   
            Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praju","root","Praju@123");  
            
            Statement stmt=conn.createStatement(); 
           ResultSet rs = stmt.executeQuery("select * from dept_mast");    
            while(rs.next())  {
          	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
           }
             
        }catch(Exception ex){
            System.out.println(ex);
        }  
    }
   
    private void insert() throws SQLException{
    	int id=0;
    	String name=null;
    	String location=null;
    	System.out.println("Enter the parameter value, Id=");
    	if(sc.hasNextInt())
    	id=sc.nextInt();

    	//accept query parameter name from user
    	System.out.println("Enter the parameter value, name=");
    	if(sc.hasNext())
    	name=sc.next();

    	System.out.println("Enter the parameter value, Location=");
    	if(sc.hasNext())
    	location=sc.next();

    	
    	
    	String query = "INSERT INTO dept_mast VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(query);

      //set the values for parameters
      preparedStatement.setInt(1, id);
      preparedStatement.setString(2, name);
      preparedStatement.setString(3, location);
        
      if (preparedStatement.executeUpdate() == 1)
    	  System.out.println("A Record inserted sccessfully....");;
    	
    }
   
  
private void update() throws SQLException{
	int id=0;
	System.out.println("Enter the parameter value, Id=");
	if(sc.hasNextInt())
	id=sc.nextInt();
	
	String location = null;
	System.out.println("Enter the parameter value, Location=");
	if(sc.hasNext())
	location=sc.next();
	
	String query = "UPDATE dept_mast SET LOCATION= ? WHERE DEPT_NO=?";
	PreparedStatement preparedStatement = conn.prepareStatement(query);

	//set the values for parameters
	preparedStatement.setString(1,location );
	preparedStatement.setInt(2, id);

	if (preparedStatement.executeUpdate() == 1)
		 System.out.println("A Record updated sccessfully....");
	
}
private void delete() throws SQLException{
	int id=0;

	 //accept query parameter salary from user
	 System.out.println("Enter the parameter value, Id=");
	 if(sc.hasNextInt())
	 id=sc.nextInt();

	 //create the parameterized query statement
	 String query = "DELETE FROM dept_mast WHERE DEPT_NO = ?";
	 PreparedStatement preparedStatement =conn.prepareStatement(query);

	 //set the values for parameters
	 preparedStatement.setInt(1, id);

	 if (preparedStatement.executeUpdate() == 1)
	 System.out.println("Record deleted sccessfully....");
}

public int getChoice() {
return choice;
}
public static void setChoice(int choice) {
DB_odbc.choice = choice;
}


}
//  static Connection getConnection() throws ClassNotFoundException, SQLException{
   // 	DB_odbc dd= new DB_odbc(sc);
   // 	Class.forName("com.mysql.cj.jdbc.Driver");  
    //    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/praju","root","Praju@123");  
     //   	return conn;
   // }