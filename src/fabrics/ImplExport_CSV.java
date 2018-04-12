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
	ArrayList<Person> pp = null;
	File file = null;
	public ImplExport_CSV (ArrayList<Person> pp, File file)
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
		JFileChooser wndw_choise = new JFileChooser();
		FileNameExtensionFilter my_filter = new FileNameExtensionFilter("Some text files", "csv");
		wndw_choise.setCurrentDirectory(file);
		wndw_choise.setFileFilter(my_filter);
		wndw_choise.setAcceptAllFileFilterUsed(false);
		int ret_val = wndw_choise.showDialog(null, "Choose file");
		if(ret_val == wndw_choise.APPROVE_OPTION)
		{
			Person_DAO_CSV my = new  Person_DAO_CSV();
			pp = my.read();	
		}
		return pp;
	}
}
