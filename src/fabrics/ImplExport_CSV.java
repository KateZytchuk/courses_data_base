package fabrics;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import view.Person;
import DAL.Person_DAO_CSV;

public class ImplExport_CSV implements ImplExport
{
	/*ArrayList<Person> pp = null;
	{
	if(ie!= null)
		ie.save(); //ie.load();
	}*/
	public ImplExport_CSV (ArrayList<Person> pp, File file)
	{
		/*this.pp = pp;
		this.file = file;*/
	}
	
	@Override
	public void save() 
	{
				
	}

	@Override
	public ArrayList<Person> load() 
	{
		return null;
	}
}
