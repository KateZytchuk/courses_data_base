package fabrics;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import view.Person;

public interface ImplExport 
{
	public void save(File file, ArrayList<Person> pp);
	public List<Person> load (File file, List<Person> pp);
}
