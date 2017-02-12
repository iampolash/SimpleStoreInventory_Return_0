import java.sql.ResultSet;
import java.sql.SQLException;



public class Model {
	
	static boolean Login_Check (String x) throws SQLException
	{
		
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.login());
		ps.setString(1, x);
		
		ResultSet rs = ps.executeQuery();
		if (rs.next())
		B = true;
		ps.close();
		return B;
		
	}
	
	static boolean Insert_ECA(String Ec1,String Ec2,String Ec3,String Ec4,String Ec5,String Ec6,String Ec7,String Ec8) throws SQLException
	{
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.Insert_ECA());
		
		ps.setString(1, Ec1);
		ps.setString(2, Ec2);
		ps.setString(3, Ec3);
		ps.setString(4, Ec4);
		ps.setString(5, Ec5);
		ps.setString(6, Ec6);
		ps.setString(7, Ec7);
		ps.setString(8, Ec8);
		
		
		
		
		int rs = ps.executeUpdate();
		if (rs>0)
		B = true;
		ps.close();
		
		return B;
		
		
	}
	
	
	
	static boolean Insert_ECB(String Ec1,String Ec2,String Ec3,String Ec4,String Ec5,String Ec6,String Ec7,String Ec8) throws SQLException
	{
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.Insert_ECB());
		
		ps.setString(1, Ec1);
		ps.setString(2, Ec2);
		ps.setString(3, Ec3);
		ps.setString(4, Ec4);
		ps.setString(5, Ec5);
		ps.setString(6, Ec6);
		ps.setString(7, Ec7);
		ps.setString(8, Ec8);

		
		
		
		int rs = ps.executeUpdate();
		if (rs>0)
		B = true;
		ps.close();
		
		return B;
		
		
	}
	static boolean Insert_GCA(String Gc1,String Gc2,String Gc3,String Gc4,String Gc5,String Gc6,String Gc7,String Gc8,String Gc9,String Gc10,String Gc11) throws SQLException
	{
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.Insert_GCA());
		
		ps.setString(1, Gc1);
		ps.setString(2, Gc2);
		ps.setString(3, Gc3);
		ps.setString(4, Gc4);
		ps.setString(5, Gc5);
		ps.setString(6, Gc6);
		ps.setString(7, Gc7);
		ps.setString(8, Gc8);
		ps.setString(9, Gc9);
		ps.setString(10,Gc10);
		ps.setString(11,Gc11);

		
		
		
		int rs = ps.executeUpdate();
		if (rs>0)
		B = true;
		ps.close();
		
		return B;	
		
	}
	
	static boolean Insert_GCB(String Gc1,String Gc2,String Gc3,String Gc4,String Gc5,String Gc6,String Gc7,String Gc8,String Gc9,String Gc10) throws SQLException
	{
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.Insert_GCB());
		
		ps.setString(1, Gc1);
		ps.setString(2, Gc2);
		ps.setString(3, Gc3);
		ps.setString(4, Gc4);
		ps.setString(5, Gc5);
		ps.setString(6, Gc6);
		ps.setString(7, Gc7);
		ps.setString(8, Gc8);
		ps.setString(9, Gc9);
		ps.setString(10,Gc10);
		
	
	
	
		
		
		
		int rs = ps.executeUpdate();
		if (rs>0)
		B = true;
		ps.close();
		
		return B;
		
		
	}
	
	
	static boolean Insert_AE(String Ec1,String Ec2,String Ec3,String Ec4,String Ec5,String Ec6,String Ec7) throws SQLException
	{
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.Insert_AE());
		
		ps.setString(1, Ec1);
		ps.setString(2, Ec2);
		ps.setString(3, Ec3);
		ps.setString(4, Ec4);
		ps.setString(5, Ec5);
		ps.setString(6, Ec6);
		ps.setString(7, Ec7);
	
		
		
		
		int rs = ps.executeUpdate();
		if (rs>0)
		B = true;
		ps.close();
		
		return B;
		
		
	}
	
	static boolean Update_Return(String Ec1,String Ec2) throws SQLException
	{
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.Update_Return());
		
		ps.setString(1, Ec1);
		ps.setString(2, Ec2);

		int rs = ps.executeUpdate();
		if (rs>0)
		B = true;
		ps.close();
		
		return B;
		
		
	}
	
	static boolean Update_EnterCompA(String Ec1,String Ec2) throws SQLException
	{
		boolean B = false ;
		java.sql.PreparedStatement ps = ConnectionC.Dbconnect().prepareStatement(Logic.Update_EnterCompA());
		
		ps.setString(1, Ec1);
		ps.setString(2, Ec2);

		int rs = ps.executeUpdate();
		if (rs>0)
		B = true;
		ps.close();
		
		return B;
		
		
	}
	
	
	
	
	
	
}
