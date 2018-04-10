package fabrics;

import java.io.File;
import java.util.ArrayList;

import view.Person;

public class ImplExport_XML implements ImplExport
{
	ArrayList<Person> pp = null;
	File file = null;
	public ImplExport_XML (ArrayList<Person> pp, File file)
	{
		this.pp = pp;
		this.file = file;
	}
	@Override
	public void save(File file, ArrayList<Person> pp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Person> load(File file, ArrayList<Person> pp) {
		// TODO Auto-generated method stub
		return null;
	}

}
