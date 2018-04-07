package DAL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import view.Person;

public class Person_DAO_JSON  implements  Person_DAO
{
	File file = new File("D:\\JAVA\\Data_Bases\\my.json");	
	@Override
	public void create(Person p) 
	{
		// TODO Auto-generated method stub		
	}
	@Override
	public List<Person> read() 
	{
		List <Person> pp = new ArrayList<Person>();	
		try
		{
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String str = br.readLine();
		br.close();	
		String [] st = str.split("[\\W]+");
		if(!st[1].equals("Persons"))
		{			
			throw new IOException();
		}
		else
		{
			Person tmp = null;
			for (int i =1; i< st.length; i++)
			{
				switch(st[i])
				{
					case "id":
						tmp = new Person();
						tmp.id = Integer.parseInt(st[++i]);
						break;
					case "fname":
						tmp.fname = st[++i];
						break;
					case "lname":
						tmp.lname = st[++i];
						break;
					case "age":
						tmp.id = Integer.parseInt(st[++i]);
						pp.add(tmp);
						break;
				}
			}		
		}
		}
		catch(IOException ex)
		{
			JOptionPane.showMessageDialog(null, "ÎØÈÁÊÀ!!!!");
		}
		return pp;
	}
	@Override
	public void update(Person p) 
	{
		// TODO Auto-generated method stub	
	}
	@Override
	public void delete(Person p) 
	{
		// TODO Auto-generated method stub		
	}
}
