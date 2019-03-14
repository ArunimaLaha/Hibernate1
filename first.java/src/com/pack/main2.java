package com.pack;

import java.sql.CallableStatement;
import java.sql.Connection;

public class main2 {

	public static void main(String[] args) {
try{
	Connection con=JdbcConnection.getConnection();
	CallableStatement cs=con.prepareCall("{call sample(?,?,?,?)}");
	cs.setInt(1, 449983);
	cs.registerOutParameter(2, java.sql.Types.VARCHAR);
	cs.registerOutParameter(3, java.sql.Types.FLOAT);
	cs.registerOutParameter(4, java.sql.Types.VARCHAR);
	cs.execute();
	System.out.println(cs.getString(2)+" "+cs.getFloat(3)+" "+cs.getString(4));
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
