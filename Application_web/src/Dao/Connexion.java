package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	private static Connection con;
    private static Statement stm;
    
    public static void connect() throws ClassNotFoundException, SQLException  {
    	Class.forName("com.mysql.jdbc.Driver");
    	con=DriverManager.getConnection("jdbc:mysql://localhost/fsbmcommunity?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
    	stm=con.createStatement();
    }
    public static void disconnect() throws SQLException {
    	stm.close();
    	con.close();
    }
    public static int Maj(String sql) throws SQLException {
    	return stm.executeUpdate(sql);
    }
    public static ResultSet Select(String sql) throws SQLException {
    	return stm.executeQuery(sql);
    }
}
