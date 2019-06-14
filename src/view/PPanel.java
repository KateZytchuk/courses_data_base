package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PPanel extends JFrame
{
	JFrame my_pnl = new JFrame();
	JScrollPane scr;
	static JTable tbl;
	Person_DM dm = new Person_DM();
	public PPanel()
	{	
		my_pnl.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// что будет при выходе
		add_table();		
		add_combobox();
		add_buttons();
		my_pnl.setSize(830,650);//задаем размеры окна при старте 
		my_pnl.setVisible(true);//делаем видимым
		my_pnl.setLocationRelativeTo(null);
	}
	public void add_combobox()
	{
		String [] variants = {
				"Mock base",
				"SQL base",
				"H2 base",
				"XML base",
				"JSON base",
				"YAML base",
				"CSV base"
		};
		JComboBox my_select = new JComboBox(variants);
		my_select.setSize(250, 30);
		my_select.setLocation(450, 50);
		my_pnl.add(my_select);
	}
	public  void add_table()
	{		
		tbl = new JTable(dm);
		scr = new JScrollPane(tbl);
		scr.setSize(400, 550);
		scr.setLocation(10, 10);
		my_pnl.add(scr);
	}

	public void add_buttons()
	{
		//_____________________________
		// добавляем кнопку "Создать"
		//_____________________________
		JButton crt = new JButton ("Create");
		crt.setSize(80, 30);
		crt.setLocation(420, 530);
		my_pnl.add(crt);
		crt.addActionListener(dm.create);

		//_____________________________
		// добавляем кнопку "Считать"
		//_____________________________
		JButton rd = new JButton ("Read");
		rd.setSize(80, 30);
		rd.setLocation(520, 530);
		my_pnl.add(rd);
		rd.addActionListener(dm.read);
		//_____________________________
		// добавляем кнопку "Обновить"
		//_____________________________
		JButton upd = new JButton ("Update");
		upd.setSize(80, 30);
		upd.setLocation(620, 530);
		my_pnl.add(upd);
		upd.addActionListener(dm.update);
		//_____________________________
		// добавляем кнопку "Удалить"
		//_____________________________
		JButton dlt = new JButton ("Delete");
		dlt.setSize(80, 30);
		dlt.setLocation(720, 530);
		my_pnl.add(dlt);
		dlt.addActionListener(dm.delete);
		//_____________________________
		// добавляем кнопку "Сохранить"
		//_____________________________
		JButton sv = new JButton ("Save");
		sv.setSize(80, 30);
		sv.setLocation(450, 100);
		my_pnl.add(sv);
		sv.addActionListener(dm.save);
		//_____________________________
		// добавляем кнопку "Загрузить"
		//_____________________________
		JButton ld = new JButton ("Load");
		ld.setSize(80, 30);
		ld.setLocation(620, 100);
		my_pnl.add(ld);
		ld.addActionListener(dm.load);
	}
}
