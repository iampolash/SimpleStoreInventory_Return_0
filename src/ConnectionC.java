import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionC {

	static Connection DB_Con = null;
	
static Connection Dbconnect()
{
	try{
        Class.forName("org.sqlite.JDBC");
        DB_Con=DriverManager.getConnection("jdbc:sqlite:Driver\\Return_0.sqlite");
        return DB_Con;
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
	}

}
