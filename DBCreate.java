package jdbc;
import java.sql.*;
 class DBCreate {
	

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbookingsystem","root","170998@Sriss");
			Statement state=conn.createStatement();
			String sql="select*from employeedetails";
			ResultSet res=state.executeQuery(sql);
			
			while(res.next()) {
				System.out.println("name:"+res.getString("empname"));
				System.out.println("last name:"+res.getString("last_name"));
				
			}
			
			
		}
		catch(SQLException s) {
			System.out.println(s);
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
