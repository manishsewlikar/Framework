package JavaintPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MsAccessConnect {

	public MsAccessConnect() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConnectJdbc();
	}

	public static   void ConnectJdbc() 
	{
		String databaseURL = "jdbc:ucanaccess://D://ApptusAuto//ApptusAuto//Emp1.accdb";
		//D:\ApptusAuto\ApptusAuto
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
             
             
         String sql1 = "INSERT INTO Empinfo (Name, Age, Sal) VALUES (?, ?, ?)";
             
			
			  PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			  preparedStatement.setString(1, "Win Ramsay"); 
			  preparedStatement.setString(2, "45"); 
			  preparedStatement.setString(3, "150000");
			  
			  int row = preparedStatement.executeUpdate();
			  
			  if (row < 0) { System.out.println("A row has been inserted successfully."); }
			 
             
           String  sql = "SELECT *FROM Empinfo";
           //
             
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            System.out.println("ID\tName\t\tAge\tSalary");
            System.out.println("==\t======\t===\t=======");
            while (result.next()) {
            	System.out.println(result.getInt(1) + "\t" + 
                        result.getString(2) + "\t" + 
                        result.getString(3) + "\t" +
                        result.getString(4));
            }
             result.close();
             statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
    }

}
	


