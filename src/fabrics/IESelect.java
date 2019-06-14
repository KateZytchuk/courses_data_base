package fabrics;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import view.Person;

public class IESelect 
{
	public static ImplExport getIE(File file, ArrayList<Person> pp)
	{
		ImplExport ie = null;
		String name = file.getName();
		name = name.toLowerCase();
		if(name.endsWith("json"))
		{
			ie = new ImplExport_JSON(pp, file);
		}
		else if (name.endsWith("xml"))
		{
			ie = new ImplExport_XML(pp, file);
		}
		else if(name.endsWith("yml"))
		{
			ie = new ImplExport_YAML(pp, file);
		} 
		else if(name.endsWith("csv"))
		{
			ie = new ImplExport_CSV(pp, file);
		}
		return ie;
	}
}
