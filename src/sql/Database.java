package sql;

import java.sql.*;

public class Database {
	private static Statement stat;
	
    public static void createDB(String DBName) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:" + DBName);
        stat = con.createStatement();
    }
    
    public static void readCommand(String command) {
    	try {
			stat.execute(command);
		} catch (SQLException e) {
			System.out.println("Invalid argument");
		}
    }
    
    public static Statement getStat() {
    	return stat;
    }
}
