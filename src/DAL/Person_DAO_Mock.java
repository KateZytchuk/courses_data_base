package DAL;

import java.util.ArrayList;
import java.util.List;
import view.Person;

public class Person_DAO_Mock implements  Person_DAO
{
	ArrayList <Person> lst = new ArrayList<Person>();
	ArrayList<Person> p_1 = new ArrayList<Person>();
	public static ArrayList<Person> init ()
	{	
		ArrayList <Person> pp = new ArrayList<Person>();
		pp.add(new Person(17, "������" , "�����", 49));
		pp.add(new Person(30, "������" , "�������", 44));
		pp.add(new Person(4, "�����" , "�������", 36));
		pp.add(new Person(42, "����������" , "��������", 27));
		pp.add(new Person(16, "�������" , "���������", 21));
		pp.add(new Person(29, "���������" , "���������", 26));
		pp.add(new Person(31, "������" , "�����", 19));
		pp.add(new Person(15, "������" , "������", 16));
		pp.add(new Person(5, "��������" , "�������", 50));
		pp.add(new Person(28, "�������" , "��������", 41));
		pp.add(new Person(18, "���������" , "�����", 50));
		pp.add(new Person(14, "�����" , "�������", 45));
		pp.add(new Person(6, "������" , "���������", 33));
		pp.add(new Person(32, "�������" , "������", 27));
		pp.add(new Person(27, "��������" , "���������", 65));
		pp.add(new Person(13, "�����" , "�����", 75));
		pp.add(new Person(19, "��������" , "������", 45));
		pp.add(new Person(33, "������" , "�������", 29));
		pp.add(new Person(41, "�����" , "�������", 24));
		pp.add(new Person(43, "������" , "����", 28));
		pp.add(new Person(12, "��������" , "����", 38));
		pp.add(new Person(26, "�����" , "�������", 35));
		pp.add(new Person(20, "�������" , "�����", 16));
		pp.add(new Person(34, "�����" , "�����", 19));
		pp.add(new Person(39, "������" , "���������", 17));
		pp.add(new Person(11, "����������" , "�������", 25));
		pp.add(new Person(21, "�������" , "�����", 30));
		pp.add(new Person(25, "�����" , "������", 49));
		pp.add(new Person(10, "�������" , "�����", 55));
		pp.add(new Person(35, "����������" , "������", 80));
		pp.add(new Person(22, "������" , "������", 17));
		pp.add(new Person(38, "�������" , "������", 38));
		pp.add(new Person(7, "��������" , "���������", 25));
		pp.add(new Person(36, "������" , "�������", 16));
		pp.add(new Person(23, "�����������" , "���������", 18));
		pp.add(new Person(9, "���������" , "�������", 55));
		pp.add(new Person(40, "�����" , "�����", 65));
		pp.add(new Person(24, "����" , "���������", 30));
		pp.add(new Person(8, "�������" , "������",  27));
		pp.add(new Person(37, "��������" , "�������", 37));
		return pp;
	}
	public Person_DAO_Mock()
	{
		lst = init();
	}
	@Override
	public void create(Person p) 
	{
		lst.add(p);		
	}

	@Override
	public List<Person> read() 
	{
		return lst;
	}

	@Override
	public void update(Person p) 
	{
		int nov_id = p.getId();
		int indx_chng = 0;
		for (Person n: lst)
		{
			if(n.getId() == nov_id)
			{
				indx_chng = lst.indexOf(n);
			}
			else
			{
				p_1.add(n);
			}
		}
		lst.set(indx_chng, p);
	}

	@Override
	public void delete(Person p) 
	{
		int nov_id = p.getId();
		int indx= 0;
		for(Person n : lst)
		{
			if(n.getId() == nov_id )
			{
				indx = lst.indexOf(n);
			}
		}
		lst.remove(indx);
	}
}
