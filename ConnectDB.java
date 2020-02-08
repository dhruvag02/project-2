import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
	static Connection con=null;
	static String databaseName="studentdatabase";
	static String url="jdbc:mysql://localhost:3306/"+databaseName;
	static String username="root";
	static String password="bmscecse";
	
	public static void main(String[] args) throws InstantiationException,IllegalAccessException,
	ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement("insert into 'studentdatabase'.'student'('Student_id','Name1','E_mail') values('003','Akash','aks@yahoo.com');");
		int status=ps.executeUpdate();
		if(status!=0) {
			System.out.println("Database was connected");
			System.out.println("Record was inserted");
		}
	}
}
