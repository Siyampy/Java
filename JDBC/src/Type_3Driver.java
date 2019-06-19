
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Type_3Driver 
{
	public static void main(String[] a)
	{
		try {
			Class.forName("ids.sql.IDSDriver");
			//Connection con=DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn='odbc_access'");

			Connection con=DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn='odbc_access'&user='system'&pwd='siyam1999'");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getString(2));
		}
		rs.close();
		st.close();
		con.close();
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
