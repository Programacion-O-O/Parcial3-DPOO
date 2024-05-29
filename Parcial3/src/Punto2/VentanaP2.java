package Punto2;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaP2 extends JFrame {
	
	
	public VentanaP2 () {
		setTitle ("Student Registration");
		setSize (400, 350);
		Campos campos = new Campos();
		add(campos, BorderLayout.CENTER);

	}
	
	public static void main(String[] args) {
		VentanaP2 ventana = new VentanaP2();
		ventana.setVisible(true);
	}

}
