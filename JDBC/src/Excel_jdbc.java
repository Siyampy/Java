
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Excel_jdbc {

public static void main(String[] args) {
	//String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ=F:\\Education\\JAVA\\J2EE\\empdetails.xlsx;";
	try {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Siyam_Excel_dsn");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("Select * from [Sheet1$]");
	System.out.println("-----------------------");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+rs.getString(2)+rs.getFloat(3)+rs.getString(4));
	}
	rs.close();
	con.close();
	}
	
	
	
	catch (ClassNotFoundException | SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
