package fabrics;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import view.Person;

public class ImplExport_JSON implements ImplExport 
{
	ArrayList<Person> pp = null;
	File file = null;
	public ImplExport_JSON(ArrayList<Person> pp, File file)
	{
		this.pp = pp;
		this.file = file;
	}
	@Override
	public void save(File file, ArrayList<Person> pp) 
	{

	}

	@Override
	public List<Person> load(File file, List<Person> pp) 
	{
		return null;
	}

}
