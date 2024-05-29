package Punto1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Botones extends JPanel {
	
	private VentanaP1 ventana;
	
	Botones(VentanaP1 ventana){
		this.ventana = ventana;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JButton registrar = new JButton("Registrar");
        JButton clear = new JButton("Clear");
		
        registrar.setBackground(new Color(178, 218, 250));
		clear.setBackground(new Color(178, 218, 250));
			
        add(registrar);
        add(clear);
        
        registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.resgistrar();
			}
		});
        
        clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.clear();
			}
		});
	}

}
