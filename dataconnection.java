import java.io.*;
import java.sql;

class DataConnection {
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			String serverip = "x.x.x.x";
			String database = "sampledata"
			String username = "username";
			String password = "password";
			Connection connection = null;
			connection = DriverManager.getConnection("jdbc:postgresql://" + serverip + "/" + database", username, password);
			return connection;
		}
		catch(ClassNotFoundException exception) {
			System.out.println("Exception - Class Not Found");
			System.out.println(exception.printStackTrace());
			return connection;
		}
		catch(SQLException exception){
			System.out.println("SQl Exception");
			return connection;
		}
	}
}
