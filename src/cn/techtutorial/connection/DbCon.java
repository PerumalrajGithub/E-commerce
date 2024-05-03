package cn.techtutorial.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://database-1.cnq6860ye703.us-east-1.rds.amazonaws.com/ecommerce_cart","admin","admin123");
            System.out.print("connected");
        }
        return connection;
    }
}