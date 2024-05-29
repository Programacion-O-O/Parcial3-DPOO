package Punto1;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaP1 extends JFrame {
	
	private Campos campos;
	private Botones botones;
	
	public VentanaP1 () {
		setTitle ("Student Registration");
		setSize (400, 350);
		
		campos = new Campos();
		add(campos, BorderLayout.CENTER);
		
		botones = new Botones(this);
		add(botones, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		VentanaP1 ventana = new VentanaP1();
		ventana.setVisible(true);
	}

	public Campos getCampos() {
		return campos;
	}

	public void setCampos(Campos campos) {
		this.campos = campos;
	}

	public void resgistrar() {
		
		if (campos.getNombreI().isBlank()) {
			this.add(new JLabel("Campos Vacios"));
		}

		if (campos.getApellidoI().isBlank()) {
			this.add(new JLabel("Campos Vacios"));
		}
		
		boolean valido;
		if (campos.getEmailI().contains("@")) {
			if (campos.getEmailI().contains("gmail.com"))
				valido = true;
			if (campos.getEmailI().contains("yahoo.com"))
				valido = true;
			if (campos.getEmailI().contains("uniandes.edu.co"))
				valido = true;
		else
			valido = false;
		}

	}
	
	public void clear() {
		campos.limpiar();
	}

}
