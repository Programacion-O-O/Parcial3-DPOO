package Punto1;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Campos extends JPanel {
	
	private String nombreI;
	private String apellidoI;
	private String emailI;
	private String telefonoI;
	
	private JTextField nombre;
	private JTextField apellido;
	private JTextField email;
	private JTextField telefono;

	public Campos() {
			
		nombre = new JTextField(25);
		apellido = new JTextField(25);
		email = new JTextField(25);
		telefono = new JTextField(25);
			
		add(new JLabel("First Name:"));
		add(nombre);
			
		add(new JLabel("Last Name:"));
		add(apellido);
		
		add(new JLabel("Email ID:"));
		add(email);
			
		add(new JLabel("Phone No.:"));
		add(telefono);
		}

	public String getNombreI() {
		return nombre.getText();
	}

	public void setNombreI(String nombreI) {
		this.nombreI = nombreI;
	}

	public String getApellidoI() {
		return apellido.getText();
	}

	public void setApellidoI(String apellidoI) {
		this.apellidoI = apellidoI;
	}

	public String getEmailI() {
		return email.getText();
	}

	public void setEmailI(String emailI) {
		this.emailI = emailI;
	}

	public String getTelefonoI() {
		return telefono.getText();
	}

	public void setTelefonoI(String telefonoI) {
		this.telefonoI = telefonoI;
	}
	
	public void limpiar() {
		this.nombre.setText(null);
		this.apellido.setText(null);
		this.email.setText(null);
		this.telefono.setText(null);
	}
}
