package view;

public class Person 
{
	public int id;
	public String lname;
	public String fname;
	public int age;
	
    public Person(int id, String lname, String fname, int age)
    {
    	 this.id = id;
         this.fname = fname;
         this.lname = lname;
         this.age = age;
    }
    public Person()
    {
    	
    }
    public int getId() 
    {
        return id;
    }
 
    public String getFname() 
    {
        return fname;
    } 
    public int getAge() 
    {
        return age;
    }
    public String getLname() 
    {
        return lname;
    }
}
