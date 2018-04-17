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
		String arg = "INSERT INTO person (Id, Fname, Lname, Age) \n" +
				" VALUES ("+p.id+", '"+p.fname+"', '"+p.lname+"', "+p.age+");";
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edu", "root", "");
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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edu", "root", "");
			Statement stmn = (Statement) con.createStatement();
			ResultSet rs = stmn.executeQuery("select * from person");
			while(rs.next()){
				pp.add(new Person(rs.getInt(1), rs.getString("Fname"), rs.getString("Lname"), rs.getInt(4)));
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
		String arg = "UPDATE person SET Fname='"+p.fname+"', Lname='"+p.lname+"', Age="+p.age+" WHERE person.Id="+p.id+";";
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edu", "root", "");
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
		String arg = "DELETE FROM person WHERE person.Id="+p.id+";";
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edu", "root", "");
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

