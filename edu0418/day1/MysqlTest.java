package edu0418.day1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;


public class MysqlTest {
	private static String url ="jdbc:mysql://localhost:3306/edu20200415";
	private static String user="root";
	private static String password="root";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conn =(Connection)DriverManager.getConnection(url,user,password);
			Statement stmt = (Statement) conn.createStatement();
			
			List<DeptInfo> deptList = new ArrayList<DeptInfo>();
			
			ResultSet rs = stmt.executeQuery("select * from dept");
			while(rs.next()) {
				DeptInfo dept = new DeptInfo(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
				
				deptList.add(dept);
			}
			for(DeptInfo dept: deptList) {
				System.out.println(dept);
			}
			
			List<EmpInfo> empList = new ArrayList<EmpInfo>();
			
			ResultSet rs1 = stmt.executeQuery("select * from emp");
			while(rs1.next()) {
				EmpInfo emp = new EmpInfo(rs1.getInt("empno"),rs1.getString("ename"),rs1.getString("job"),rs1.getInt("mgr"),rs1.getDate("hiredate"),rs1.getInt("sal"),rs1.getInt("deptno"));
				
				empList.add(emp);
			}
			for(EmpInfo emp: empList) {
				System.out.println(emp);
			}
			
			stmt.close();
			conn.close();
		  }catch(Exception e) {
			  e.printStackTrace();
			  
		  }
	}
} 
	

