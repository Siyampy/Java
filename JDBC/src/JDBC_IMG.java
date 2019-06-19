//import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
//import java.util.Properties;
public class JDBC_IMG 
{
public static void main(String a[])throws ClassNotFoundException,SQLException, FileNotFoundException, IOException
{
	Connection con=null;
	Statement st=null;
	//ResultSet rs=null;
	
	
	//ResultSetMetaData metaData=null;
	PreparedStatement ps=null;
	//Properties p=new Properties();
	//p.load(new FileInputStream("F:\\Education\\JAVA\\J2EE\\JDBC\\src\\DB.properties"));
	//System.out.println(p.getProperty("user"));
	try
	{
		//Class.forName(p.getProperty("driver"));
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","siyam1999");
//		Class.forName("com.mysql.jdbc.Driver");
//		con=DriverManager.getConnection("jdbc:mysql://node17075-siyam.cloudjiffy.net:3306/Siyam","root","eaGOo6DBil");
//		//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Siyam","root","eaGOo6DBil");

		System.out.println(con);
		//con=DriverManager.getConnection(p.getProperty("url"),p);
		if(con!=null)
		{
			st=con.createStatement();

	
		}
		if(st!=null)
		{
			ps=con.prepareStatement("insert into IMG_TABLE values(?,?)");
			//ps.setInt(1, 3);
			ps.setString(1, "Siyam");
			FileInputStream fs=new FileInputStream("C:\\Users\\Siyam\\Pictures\\counselling.png");
			ps.setBinaryStream(2,fs,fs.available()); 
			//ps.setInt(3, 3);
			//ps.setFloat(4, (float) 20000.00f);
			//ps.executeUpdate();
			//rs=st.executeQuery("Select * from Employee");
			int i=ps.executeUpdate(); 
			System.out.println(i+" records affected"); 
			
//			rs=st.executeQuery("Select * from Employee");
			// metaData=rs.getMetaData();
			//st.execute("Update Student set name='Dhanu' where no=1");
			
//			if(rs!=null)
//			{
//				while(rs.next())
//				{
//					System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+rs.getInt(3));
//				}
//			}
//			
		}
//		String s=metaData.getColumnLabel(2);
//		int n=metaData.getColumnCount();
//		System.out.println(s+n);
//		for(int i=0;i<n;i++)
//		{
//			System.out.println("Column "+(i+1)+"Name"+metaData.getColumnName(i+1)+"  Coulumn Type:"+metaData.getColumnType(i+1));
//		}
		
		
					//st.execute("update student set name='Dhanush' where no=20;");

		
		}
		
	catch(ClassNotFoundException cnf)
	{
		cnf.printStackTrace();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			if(con!=null)
			{
				con.close();
			}
			
		}
		catch(SQLException ee)
		{
			ee.printStackTrace();
			
		}
	}
}
}
