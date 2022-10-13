package jdbc;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_First {

	public static void main(String[] args) throws Exception{

	   //to fetch data 
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root", "Cft6xdr5");
		
		PreparedStatement pstmt = conn.prepareStatement("select * from candidate");
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		   
		}
	}

}
//////////////////////////
//delete certain columns

//Scanner sc = new Scanner(System.in);
//
//
//System.out.println("Enter name to delete record/s!");
//String name = sc.next();
//
//Class.forName("com.mysql.cj.jdbc.Driver");
//
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root", "Cft6xdr5");
//
//PreparedStatement pstmt = conn.prepareStatement("delete from candidate where first_name = ?");
//
//pstmt.setString(1, name);
//
//
//pstmt.execute(); 




///////////////////////

//delete all in the table


//Class.forName("com.mysql.cj.jdbc.Driver");
//
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root", "Cft6xdr5");
//
//PreparedStatement pstmt = conn.prepareStatement("delete from candidate");
//
//pstmt.execute();  



/////////////////////
// updating table

//Scanner sc = new Scanner(System.in);
//
//System.out.println("Enter your ID to update email address");
//int cid = sc.nextInt();
//
//System.out.println("Enter email! ");
//String email = sc.next();
//
//Class.forName("com.mysql.cj.jdbc.Driver");
//
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root", "Cft6xdr5");
//
//PreparedStatement pstmt = conn.prepareStatement("update candidate set email = ? where c_id = ?");
//
//pstmt.setString(1, email);
//pstmt.setInt(2, cid);
//
//   
//pstmt.execute();  

///////////////////////////////////

//Creating table 

//Scanner sc = new Scanner(System.in);
//
//System.out.println("Enter your ID!");
//int cid = sc.nextInt();
//
//System.out.println("Enter name!");
//String name = sc.next();
//
//System.out.println("Enter email! ");
//String email = sc.next();
//
//Class.forName("com.mysql.cj.jdbc.Driver");
//
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root", "Cft6xdr5");
//
//PreparedStatement pstmt = conn.prepareStatement("insert into candidate value (?,?,?)");
//
//pstmt.setInt(1, cid);
//pstmt.setString(2, name);
//pstmt.setString(3, email);
//
//pstmt.execute(); 

//Class.forName("com.mysql.cj.jdbc.Driver");
//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cohort20", "root", "Cft6xdr5");
//
//Statement stmt = conn.createStatement();
//
//stmt.execute("create table candidate (c_id int, first_name varchar(12), second_name varchar(12), email varchar(20));");




//Scanner sc = new Scanner(System.in);
//
//System.out.println("Enter first number! ");
//
//int firstNumber = sc.nextInt();
//
//System.out.println("Enter second number! ");
//
//int secondNumber = sc.nextInt();
//
//int result = firstNumber + secondNumber;
//
//System.out.println("The result is: " + result);
