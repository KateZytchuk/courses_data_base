package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import view.Person;



public class Person_DAO_H2  implements  Person_DAO
{
	ArrayList<Person> pp = new ArrayList<Person>();
	@Override
	public void create(Person p) 
	{
		String arg = "INSERT INTO MY_PERSONS (ID, LNAME, FNAME, AGE) \n" +
				" VALUES ("+p.id+", '"+p.lname+"', '"+p.fname+"',  "+p.age+");";
		try{
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(arg);
			stmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}

	}
	@Override
	public List<Person> read() 
	{
		pp = new ArrayList<Person>();
		try{
			Connection con = DriverManager.getConnection("jdbc:h2:~/test ", "sa", "");
			Statement stmn = (Statement) con.createStatement();
			ResultSet rs = stmn.executeQuery("select * from MY_PERSONS");
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
		String arg = "UPDATE MY_PERSONS SET LNAME='"+p.lname+"', FNAME='"+p.fname+"',  AGE="+p.age+" WHERE MY_PERSONS.ID="+p.id+";";
		try{
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(arg);
			stmt.close();
			con.close();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	@Override
	public void delete(Person p) 
	{
		String arg = "DELETE FROM MY_PERSONS WHERE MY_PERSONS.ID="+p.id+";";
		try{
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(arg);
			stmt.close();
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
