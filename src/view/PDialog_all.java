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
		//setBounds(450, 100, 700, 350);
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
		fid.setBounds(120, 50, 100, 25);
		add(fid);

		ffname = new JTextField(strFname);
		ffname.setBounds(400, 50, 200, 25);
		add(ffname);

		fage = new JTextField(strAge);
		fage.setBounds(120, 100, 100, 25);
		add(fage);

		flname = new JTextField(strLname);
		flname.setBounds(400, 100, 200, 25);
		add(flname);

		JLabel Jfid = new JLabel("Id");
		Jfid.setBounds(60, 50, 200, 25);
		add(Jfid);
		
		JLabel Jflname = new JLabel("Lname");
		Jflname.setBounds(350, 100, 200, 25);
		add(Jflname);
		
		JLabel JFName = new JLabel("Fname");
		JFName.setBounds(350, 50, 200, 25);
		add(JFName);
		
		JLabel JAge = new JLabel("Age");
		JAge.setBounds(60, 100, 200, 25);
		add(JAge);
		
		setLocationRelativeTo(null);
		setModal(true);
		setVisible(true);
		
	}
}
