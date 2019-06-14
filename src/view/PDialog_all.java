package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PDialog_all extends JDialog
{
	Person_DM dm = new Person_DM();
	public boolean isOk = false;
	public boolean isCancel = false;
	public JTextField fid;
	public JTextField ffname;
	public JTextField flname;
	public  JTextField fage;
	public String strId;
	public String strFname;
	public String strLname;
	public String strAge;
	static String choice;
	public PDialog_all()
	{	
		setSize(400, 350);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);

		if(PPanel.tbl.getSelectedRow() == -1)
		{
			strId = "";
			strFname = "";
			strLname = "";
			strAge = "";
		}
		else 
		{
			strId = PPanel.tbl.getModel().getValueAt(PPanel.tbl.getSelectedRow(), 0).toString();
			strFname =  PPanel.tbl.getModel().getValueAt(PPanel.tbl.getSelectedRow(), 1).toString();
			strLname = PPanel.tbl.getModel().getValueAt(PPanel.tbl.getSelectedRow(), 2).toString();
			strAge = PPanel.tbl.getModel().getValueAt(PPanel.tbl.getSelectedRow(), 3).toString();
		}

		JButton cancel = new JButton("Cancel");
		cancel.setSize(80, 30);
		cancel.setLocation(255, 270);
		cancel.addActionListener(new ActionListener() 
		{
             public void actionPerformed(ActionEvent e) 
             {
 				isCancel = false;
 				setVisible(false);
             }
        });
		add(cancel);

		JButton ok = new JButton("OK");
		ok.setSize(80, 30);
		ok.setLocation(50, 270);
		ok.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				isOk = true;
				setVisible(false);				
			}
		});

		add(ok);

		fid = new JTextField(strId);
		fid.setLocation(80, 30);
		fid.setSize(250, 25);
		add(fid);

		flname = new JTextField(strLname);
		flname.setLocation(80, 85);
		flname.setSize(250, 25);
		add(flname);
		
		ffname = new JTextField(strFname);
		ffname.setLocation(80, 140);
		ffname.setSize(250, 25);
		add(ffname);

		fage = new JTextField(strAge);
		fage.setLocation(80, 195);
		fage.setSize(250, 25);
		add(fage);
	

		JLabel Jfid = new JLabel("Id");
		Jfid.setLocation(20, 10);
		Jfid.setSize(70, 65);
		add(Jfid);
		
		JLabel Jflname = new JLabel("Lname");
		Jflname.setLocation(15, 65);
		Jflname.setSize(70, 65);
		add(Jflname);
		
		JLabel JFName = new JLabel("Fname");
		JFName.setLocation(15, 120);
		JFName.setSize(70, 65);
		add(JFName);
		
		JLabel JAge = new JLabel("Age");
		JAge.setLocation(20, 175);
		JAge.setSize(70, 65);
		add(JAge);
		
		setLocationRelativeTo(null);
		setModal(true);
		setVisible(true);
		
	}
}
