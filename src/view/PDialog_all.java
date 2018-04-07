package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PDialog_all extends JDialog
{
	JDialog additional_wndw = new JDialog();
	static JTextField text_id, text_fname, text_lname, text_age;
	JButton ok, cancel;
	boolean isOK = false;
	public PDialog_all()
	{
		additional_wndw.setLayout(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		add_buttons();
		add_textfields();
		add_lable();
		additional_wndw.setSize(400, 350);
		additional_wndw.setVisible(true);
		additional_wndw.setLocationRelativeTo(null);
	}
	public void add_buttons() 
	{
		//_____________________________
		// добавляем кнопку "OK"
		//_____________________________
		ok = new JButton ("OK");
		ok.setSize(80, 30);
		ok.setLocation(50, 270);
		additional_wndw.add(ok);

		//_____________________________
		// добавляем кнопку "Cancel"
		//_____________________________
		cancel = new JButton ("Cancel");
		cancel.setSize(80, 30);
		cancel.setLocation(255, 270);
		additional_wndw.add(cancel);
	}
	public void add_textfields()
	{
		//_____________________________
		// добавляем текстовое поле для "ID"
		//_____________________________
		text_id = new JTextField(20);
		text_id.setLocation(80, 30);
		text_id.setSize(250, 25);
		text_id.setHorizontalAlignment(JTextField.LEFT);
		additional_wndw.add(text_id);

		//_____________________________
		// добавляем текстовое поле для "LName"
		//_____________________________
		text_lname = new JTextField(20);
		text_lname.setLocation(80, 85);
		text_lname.setSize(250, 25);
		text_lname.setHorizontalAlignment(JTextField.LEFT);
		additional_wndw.add(text_lname);

		//_____________________________
		// добавляем текстовое поле для "FName"
		//_____________________________
		text_fname = new JTextField(20);
		text_fname.setLocation(80, 140);
		text_fname.setSize(250, 25);
		text_fname.setHorizontalAlignment(JTextField.LEFT);
		additional_wndw.add(text_fname);

		//_____________________________
		// добавляем текстовое поле для "Age"
		//_____________________________	
		text_age = new JTextField(20);
		text_age.setLocation(80, 195);
		text_age.setSize(250, 25);
		text_age.setHorizontalAlignment(JTextField.LEFT);
		additional_wndw.add(text_age);
	}
	public void add_lable()
	{
		//_____________________________
		// добавляем надпись "ID"
		//_____________________________
		JLabel title_id = new JLabel("ID", JLabel.CENTER);
		title_id.setForeground(Color.black);
		title_id.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_id.setLocation(20, 10);
		title_id.setSize(70, 65);
		additional_wndw.add(title_id);

		//_____________________________
		// добавляем надпись "LName"
		//_____________________________
		JLabel title_lname = new JLabel("LName", JLabel.CENTER);
		title_lname.setForeground(Color.black);
		title_lname.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_lname.setLocation(15, 65);
		title_lname.setSize(70, 65);
		additional_wndw.add(title_lname);
		
		//_____________________________
		// добавляем надпись "FName"
		//_____________________________
		JLabel title_fname = new JLabel("FName", JLabel.CENTER);
		title_fname.setForeground(Color.black);
		title_fname.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_fname.setLocation(15, 120);
		title_fname.setSize(70, 65);
		additional_wndw.add(title_fname);

		//_____________________________
		// добавляем надпись "Age"
		//_____________________________
		JLabel title_age = new JLabel("Age", JLabel.CENTER);
		title_age.setForeground(Color.black);
		title_age.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 16));
		title_age.setLocation(20, 175);
		title_age.setSize(70, 65);
		additional_wndw.add(title_age);
	}
}
