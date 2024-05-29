package Punto2;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Campos extends JPanel {

	public Campos() {
			
		JTextField nombre = new JTextField(25);
		JTextField apellido = new JTextField(25);
		JTextField email = new JTextField(25);
		JTextField telefono = new JTextField(25);
			
		add(new JLabel("First Name:"));
		add(nombre);
			
		add(new JLabel("Last Name:"));
		add(apellido);
		
		add(new JLabel("Title:"));
		add(email);
			
		add(new JLabel("Nickname:"));
		add(telefono);
		
		add(new JLabel("Nickname:"));
		JComboBox<String> nick = new JComboBox<String>();
		nick.addItem("Item 1");
		add(nick);
		
		add(new JLabel("E-mail Addresss:"));
		add(nombre);
		
		add(new JLabel("Item 1"
				+ "Item 2"
				+ "Item 3"
				+ "Item 4"
				+ "Item 5"));
		
		add(new JLabel("Mail Format:"));
		
		JRadioButton HTML = new JRadioButton("HTML");
		JRadioButton PlainText = new JRadioButton("Plain Text");
		JRadioButton Custom = new JRadioButton("Custom");
		
		ButtonGroup botones = new ButtonGroup();
		botones.add(HTML);
		botones.add(PlainText);
		botones.add(Custom);
		
		JButton add = new JButton("add");
        JButton edit = new JButton("edit");
			
        add(add);
        add(edit);
		}
		
}
