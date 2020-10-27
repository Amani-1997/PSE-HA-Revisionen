import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ListOfPeople extends JFrame {

	Container c;
	JPanel p, p_top, p_bot, ergPanel, topPanel, bottomPanel;
	JFrame tf_frame, tf_lname;
	private textField ;
	HashMap<Integer, String[]> peopleMap = new HashMap<Integer, String[]>();
	int id = 1;
	
	
	
	public ListOfPeople(String name) {
		c = getContentPane();
		JLabel lbl_welcome = new JLabel();
		p = new JPanel();
		p_top = new JPanel();
		p_bot = new JPanel();
		
		Border border = BorderFactory.createEtchedBorder();
		Border padding = BorderFactory.createEmptyBorder(30, 30, 30, 30);
		p_top.setLayout(new GridLayout(0,5,5,5));
		p_bot.setLayout(new GridLayout(5,5,5,5));
		
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
		p.setBorder(padding);
		setBackground(Color.GRAY);
		
		intitTop();
		intitButton();
		initErg();
		standards();
		
		lbl_welcome = new JLabel("Welcome to the people's list management interface ");
		lbl_welcome.setAlignmentX(Component.CENTER_ALIGNMENT);
		lbl_welcome.setAlignmentY(Component.CENTER_ALIGNMENT);
		bottomPanel.add(lbl_search_lname);
		bottomPanel.add(tf_search_lname);
		bottomPanel.add(new JLabel);
		
		p.setBorder(border);
		p.setBorder(padding);
		p.add(p_top);
		p.add(p_bot);
		c.add(p);
	}

	private void standards() {

		peopleMap.put(id, new String[] {"Kai", "Neldner"});
		id++;
		peopleMap.put(id, new String[] {"Fred", "Stiller"});
		id++;
		peopleMap.put(id, new String[] {"Willhelm", "Erkner"});
		id++;
	}

	private void intitButton() {

		p_bot.add(new JButton("Search"));
		//p_top.add(new JButton("Add"));
		JButton btn_add = new JButton("Add");
		btn_add.addActionListener(new ActionListener() {

	
	public void  actionPerformed(ActionEvent e) {
		
		peopleMap.put(id, new String[] {tf_frame.getText(), tf_lname.getText()});
		id++;
		for (Integer i : peopleMap.keySet()) {
			String[] a = peopleMap.get(i);
			System.out.println( a[0] + " " + a[1]);
		}
		
	}
		});

	private void initErg() {

		p_bot.add(new JLabel("Search a person"));
		p_bot.add(new JLabel("ID: "));
		p_bot.add(new JTextField());
		p_bot.add(new JLabel("Firstname: "));
		p_bot.add(new JTextField());
		p_bot.add(new JLabel("Lastname: "));
		p_bot.add(new JTextField());
		
		
	}

	private void intitTop() {

		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(0,5,5,5));
		topPanel.getBorder();
		p_top.add(new JLabel("Add a person"));
		p_top.add(new JLabel("Firstname:"));
		p_top.add(new JTextField());
		p_top.add(new JLabel("Lastname:"));
		p_top.add(new JTextField());
	}
	
	private void initErgpanel() {
		
		ergPanel = new JPanel();
		ergPanel.add(new JLabel("Test"));
		
		p.add(ergPanel);
		pack();
		repaint();
	}
}
