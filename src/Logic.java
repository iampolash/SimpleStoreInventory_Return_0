public class Logic {

	
	
	static String login()
	{
		
		String sql = "SELECT * From Login where passcode = ? ";
		return sql;
		
	}
	

	public static String Insert_ECA()
    {
    String sql = "INSERT INTO EnterCompA VALUES (NULL, ?, ?, ?, ?, ?, ?, ?,?)";
    return sql;
    }
	
	public static String Insert_ECB()
    {
    String sql = "INSERT INTO EnterCompB VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?)";
    return sql;
    }
	
	
	public static String Insert_GCA()
    {
    String sql = "INSERT INTO GetCompA_1 VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";
    return sql;
    }
	
	
	public static String Insert_GCB()
    {
    String sql = "INSERT INTO GetCompB VALUES (Null, ?, ?, ?, ?, ?, ?, ?,?,?,NULL,?)";
    return sql;
    }
	
	public static String Insert_AE()
    {
    String sql = "INSERT INTO Add_Employee VALUES (?, ?, ?, ?, ?, ?, ?)";
    return sql;
    }
	
	public static String Update_Return()
    {
    String sql = "UPDATE GetCompB SET Return_Date = ? WHERE Serial_No= ?;";
    return sql;
    }
	
	public static String Update_EnterCompA()
    {
    String sql = "UPDATE EnterCompA SET Quantity = ? WHERE Serial_No= ?";
    return sql;
    }
	
	
	
	
}

