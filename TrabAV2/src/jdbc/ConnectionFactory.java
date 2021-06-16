/*Rayná Araújo Reveles - 0050013521*/

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://database-poo.cmhzu3n26s1e.us-east-1.rds.amazonaws.com:3306/POO_Banco?useTimezone=true&serverTimezone=UTC"; 
	private static final String USER = "admin"; 
	private static final String SENHA = "super123"; 
	
	
	public static Connection getConnection() {
        try {
        	
        	//Class.forName(DRIVE);  //opcional dependendo da versao
        	
            return DriverManager.getConnection(
            		URL, USER, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(),e);
        	//System.out.println(e);
        }
	}

	public static void closeConnection(Connection con) {
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement stmt)
	{
		closeConnection(con);
		
		if(stmt != null)
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
