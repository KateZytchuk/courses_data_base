package fabrics;

import java.io.File;
import java.util.ArrayList;

import view.Person;

public interface ImplExport 
{
	public void save(File file, ArrayList<Person> pp);
	public ArrayList<Person> load (File file, ArrayList<Person> pp);
}
