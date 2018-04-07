package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.JOptionPane;

import view.Person;



public class Person_DAO_H2  implements  Person_DAO
{
	/* Connection con;
	 Statement stmt = null;
	 String query = "select * from persona";
	 ResultSet rs = null;
	 
	 public static java.sql.Connection connect() 
	 {
	  java.sql.Connection con = null;
	  JOptionPane.showMessageDialog(null, "00000");
	  try
	  {
		  JOptionPane.showMessageDialog(null, "11111");
	   Class.forName("org.h2.Driver");
	   JOptionPane.showMessageDialog(null, "22222");
	  con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	  JOptionPane.showMessageDialog(null, "333333");
	  }
	  catch(ClassNotFoundException e) 
	  {
	   JOptionPane.showMessageDialog(null, "Драйвер не найден");
	   System.exit(1);
	  }
	  catch(SQLException e)
	  {
	   JOptionPane.showMessageDialog(null, "Ошибка: " + e.getMessage());
	   System.exit(1);
	  }
	  return con;
	 }*/
	// Connection con;
	// Statement stmt = null;
	//String query = "select * from persona";
	// ResultSet rs = null;
	 
	 public static Connection connect() 
	 {
	  Connection con = null;
	  try
	  {
	   Class.forName("org.h2.Driver");
	   con =DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	  }
	  catch(ClassNotFoundException e) 
	  {
	   JOptionPane.showMessageDialog(null, "Драйвер не найден");
	   System.exit(1);
	  }
	  catch(SQLException e)
	  {
	   JOptionPane.showMessageDialog(null, "Ошибка: " + e.getMessage());
	   System.exit(1);
	  }
	  return con;
	 }
	public static void main(String[] args) 
	{
		Connection con = connect ();
	}
	@Override
	public void create(Person p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Person> read() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Person p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Person p) {
		// TODO Auto-generated method stub
		
	}
}
