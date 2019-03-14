package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class main1 {

	public static void main(String[] args) {
try{
	Connection con=JdbcConnection.getConnection();
	/*Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("select id,salary from Employee");
	rs.absolute(2);
	System.out.println(rs.getInt(1));
	rs.absolute(4);
	System.out.println(rs.getInt(1));
	rs.first();
	System.out.println(rs.getInt(1));
	System.out.println(rs.isFirst());
	rs.last();
	System.out.println(rs.getInt(1));
	System.out.println(rs.isLast());
	rs.updateFloat(2,150000);
	rs.updateRow();
	rs.absolute(2);
	rs.deleteRow();
	rs.absolute(1);
	rs.moveToInsertRow();
	rs.updateInt(1,10045);
	rs.updateFloat(2,45000);
	rs.insertRow();
	System.out.println(rs.getInt(1));
	rs.moveToCurrentRow();
	System.out.println(rs.getInt(1));*/
	PreparedStatement ps=con.prepareStatement("insert into Employee(id,ename,salary,designation) values (?,?,?,?)");
	ps.setInt(1,10);
	ps.setString(2,"aaa");
	ps.setFloat(3, 20000);
	ps.setString(4,"Member");
	ps.addBatch();
	ps.setInt(1,20);
	ps.setString(2,"bbb");
	ps.setFloat(3, 40000);
	ps.setString(4,"Testing");
	ps.addBatch();
	ps.setInt(1,30);
	ps.setString(2,"ccc");
	ps.setFloat(3, 60000);
	ps.setString(4,"HR");
	ps.addBatch();
	int count[]=ps.executeBatch();
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
