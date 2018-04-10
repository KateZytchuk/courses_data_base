package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.table.AbstractTableModel;

import DAL.Person_DAO;
import DAL.Person_DAO_CSV;
import DAL.Person_DAO_JSON;
import DAL.Person_DAO_Sql;
import DAL.Person_DAO_XML;
import DAL.Person_DAO_YAML;
import DAL.Person_DAO_Mock;
import DAL.Person_DAO_H2;

public class Person_DM extends AbstractTableModel
{
	List<Person> lst = new ArrayList<Person>();
	Person_DAO pd;
	public Person_DM()
	{
		pd = new Person_DAO_JSON(); //��� ������ � ������ ����� ������� ���
		lst = pd.read();	
	}
static String choice;
	
	Combobox aCombo = new Combobox();
	class Combobox implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JComboBox cb = (JComboBox)e.getSource();
			String petName = (String)cb.getSelectedItem();
			switch(petName){
			case "SQL base": 
				pd = new Person_DAO_Sql(); 
				break;
			case "MOCK base": 
				pd = new Person_DAO_Mock();
				break;	 
			case "H2 base": 
				pd = new Person_DAO_H2(); 
				break;
			case "XML base": 
				pd = new Person_DAO_XML(); 
				break;
			case "JSON base": 
				pd = new Person_DAO_JSON(); 
				break;
			case "YAML base": 
				pd = new Person_DAO_YAML(); 
				break;
			case "CSV base": 
				pd = new Person_DAO_CSV(); 
				break;
			}
		}
	}
	@Override
	public String getColumnName(int col)
	{
		String [] str = {"ID", "LName", "FName", "Age"};
		return str[col];
	}
	@Override
	public int getRowCount() 
	{
		return lst.size();
	}

	@Override
	public int getColumnCount() 
	{
		return 4;
	}

	@Override
	public Object getValueAt(int row, int column) 
	{
		Person oo = lst.get(row);
		Object ret = null;
		switch(column)
		{
		case 0: 
			ret = oo.getId();
			break;
		case 1:
			ret = oo.getLname();
			break;
		case 2:
			ret = oo.getFname();
			break;
		case 3:
			ret = oo.getAge();
			break;
		}
		return ret;
	}
	ActionCreate create = new ActionCreate();
	public class ActionCreate implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PDialog_all dlg = new PDialog_all();
			//dlg.setModal(true);
			//dlg.setVisible(true);
			if (dlg.isOK == true)
			{
				Person p = new Person(Integer.parseInt(dlg.text_id.getText()), dlg.text_lname.getText(), dlg.text_fname.getText(), Integer.parseInt(dlg.text_age.getText()));
				pd.create(p);
				my_reload();
			}
			/*int my_id = Integer.parseInt(PPanel.text_id.getText());
			String my_fname = PPanel.text_fname.getText();
			String my_lname = PPanel.text_lname.getText();
			int my_age = Integer.parseInt(PPanel.text_age.getText());
			Person my = new Person(my_id, my_lname, my_fname,  my_age);
			pd.create(my);	
			my_reload();
			JOptionPane.showMessageDialog(null, "��������� ������ �   ��");*/
		}
	}
	ActionRead read = new ActionRead();
	public class ActionRead implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			lst = pd.read();
			my_reload();
		}
	}
	ActionUpdate update = new ActionUpdate();
	public class ActionUpdate implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PDialog_all dlg = new PDialog_all();
			if (dlg.isOK == true)
			{
				Person p = new Person(Integer.parseInt(dlg.text_id.getText()), dlg.text_lname.getText(), dlg.text_fname.getText(), Integer.parseInt(dlg.text_age.getText()));
				pd.update(p);
				dlg.dispose();
				my_reload();
			}
			/*int my_id = Integer.parseInt(PPanel.text_id.getText());
			String my_fname = PPanel.text_fname.getText();
			String my_lname = PPanel.text_lname.getText();
			int my_age = Integer.parseInt(PPanel.text_age.getText());
			Person my = new Person(my_id, my_lname, my_fname,  my_age);
			pd.update(my);	
			my_reload();
			JOptionPane.showMessageDialog(null, "��������� ������ ��  ��");*/
		}
	}
	ActionDelete delete = new ActionDelete();
	public class ActionDelete implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PDialog_all dlg = new PDialog_all();
			/*int my_id = Integer.parseInt(PPanel.text_id.getText());
			String my_fname = PPanel.text_fname.getText();
			String my_lname = PPanel.text_lname.getText();
			int my_age = Integer.parseInt(PPanel.text_age.getText());
			Person my = new Person(my_id,  my_lname, my_fname, my_age);
			pd.delete(my);	
			my_reload();
			JOptionPane.showMessageDialog(null, "������� ������ ��  ��");*/
			if (dlg.isOK == true)
			{
				Person p = new Person(Integer.parseInt(dlg.text_id.getText()), dlg.text_lname.getText(), dlg.text_fname.getText(), Integer.parseInt(dlg.text_age.getText()));
				pd.delete(p);
				dlg.dispose();
				my_reload();
			}
		}	
	}
	ActionSave save = new ActionSave();
	public class ActionSave implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// to do
		}
		
	}
	ActionLoad load = new ActionLoad();
	public class ActionLoad implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub			
		}
		
	}	
	private void my_reload()
	{
		lst = pd.read();
		fireTableDataChanged();
	}
}
