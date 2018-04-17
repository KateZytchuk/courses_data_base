package DAL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import view.Person;

public class Person_DAO_Sql implements Person_DAO
{
	ArrayList<Person> pp = new ArrayList<Person>();
	@Override
	public void create(Person p) 
	{
		String arg = "INSERT INTO my_persons (Id, Fname, Lname, Age) \n" +
				" VALUES ("+p.id+", '"+p.lname+"', '"+p.fname+"',  "+p.age+");";
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_edu", "root", "");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(arg);
			stmt.close();
			con.close();
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Person> read() 
	{
		pp = new ArrayList<Person>();
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_edu", "root", "");
			Statement stmn = (Statement) con.createStatement();
			ResultSet rs = stmn.executeQuery("select * from my_persons");
			while(rs.next()){
				pp.add(new Person(rs.getInt(1), rs.getString("Lname"), rs.getString("Fname"),  rs.getInt(4)));
			}
			rs.close();
			stmn.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
		return pp;
	}

	@Override
	public void update(Person p) 
	{
		String arg = "UPDATE my_persons SET  Lname='"+p.lname+"', Fname='"+p.fname+"', Age="+p.age+" WHERE my_persons.id="+p.id+";";
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_edu", "root", "");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(arg);
			stmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Person p) 
	{
		String arg = "DELETE FROM my_persons WHERE my_persons.id="+p.id+";";
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_edu", "root", "");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(arg);
			stmt.close();
			con.close();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
}

