package Aplication;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Login extends JPanel {

	private JDesktopPane Vista;
	
	MostrarPanel mp = new MostrarPanel();
	
	
	/*Variables de coneccion con la base de datos*/
	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet resultSet = null;

	private boolean cambiacolor;
	
	
	public Login() {
		setSize(1080, 685);
		setLayout(null);
		
		JDesktopPane View = new JDesktopPane();
		View.setBackground(Color.WHITE);
		View.setBounds(0, 0, 1080, 685);
		add(View);
		
		
		JLabel lblIniciarSesio = new JLabel("INICIAR SESION");
		lblIniciarSesio.setFont(new Font("Roboto", Font.BOLD, 34));
		lblIniciarSesio.setBounds(31, 183, 293, 38);
		View.add(lblIniciarSesio);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Roboto", Font.BOLD, 20));
		lblUsuario.setBounds(31, 286, 263, 39);
		View.add(lblUsuario);

		
		JTextField lblIngresarUsuario = new JTextField("Ingrese su nombre de usuario");
		//JTextField lblIngresarUsuario = new JTextField();
		lblIngresarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngresarUsuario.setForeground(new Color(103, 93, 93));
		lblIngresarUsuario.setBounds(31, 343, 363, 39);
		lblIngresarUsuario.setBorder(null);
		View.add(lblIngresarUsuario);
		
		
		
		lblIngresarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if("Ingrese su nombre de usuario".equals(lblIngresarUsuario.getText())) {
					lblIngresarUsuario.setText(null);		
					lblIngresarUsuario.setForeground(new Color(0, 0, 0));
				}
				System.out.println("El valor del campo usuario es:  "+lblIngresarUsuario.getText());
			}
		});
		
		
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(31, 386, 351, 2);
		View.add(separator);
		
		
		JLabel lblUsuario_1 = new JLabel("Password");
		lblUsuario_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario_1.setBounds(31, 432, 263, 39);
		View.add(lblUsuario_1);
		
		JPasswordField lblIngresarPassword = new JPasswordField("Micontraseña");
		//JPasswordField lblIngresarPassword = new JPasswordField();
		lblIngresarPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngresarPassword.setForeground(new Color(103, 93, 93));
		lblIngresarPassword.setBounds(31, 482, 351, 39);
		lblIngresarPassword.setBorder(null);
		View.add(lblIngresarPassword);
		
		lblIngresarPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if("Micontraseña".equals(String.valueOf(lblIngresarPassword.getPassword()))){
					lblIngresarPassword.setText(null);		
					lblIngresarPassword.setForeground(new Color(0, 0, 0));
				}
				System.out.println("El valor del campo password es: "+lblIngresarPassword.getPassword());
				
			}
		});
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(31, 521, 351, 2);
		View.add(separator_1);
		
		
		JPanel btnEnviar = new JPanel();
		btnEnviar.setBackground(SystemColor.textHighlight);
		cambiacolor = true;
		btnEnviar.setBounds(30, 556, 150, 44);
		btnEnviar.setLayout(null);
		View.add(btnEnviar);
		
		
		JLabel lblbtnEntrar = new JLabel("ENTRAR", SwingConstants.CENTER );
		lblbtnEntrar.setBounds(0, 0, 150, 44);
		lblbtnEntrar.setFont(new Font("Roboto", Font.BOLD, 20));
		lblbtnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEnviar.add(lblbtnEntrar);

		
		lblbtnEntrar.addMouseListener(new MouseAdapter() {			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String usuario = lblIngresarUsuario.getText();
				String contraseña = String.valueOf(lblIngresarPassword.getPassword());
				
				if(cambiacolor == true) {
					btnEnviar.setBackground(new Color(0, 0, 0));

					cambiacolor = false;
				}else {
					btnEnviar.setBackground(SystemColor.textHighlight);
					cambiacolor = true;
				}
				
				System.out.println(usuario);
				System.out.println(contraseña);
				
				conexion = Conexion.conectar();
				
				/*try {
		
					preStatement = conexion.prepareStatement("select * from usuario");
					
					//preStatement.setString(1, id);
					
					resultSet = preStatement.executeQuery();
					
					while(resultSet.next()) {
						   for (int x=1;x<=resultSet.getMetaData().getColumnCount();x++)
						     System.out.println(resultSet.getString(x)+ "\t");
						   
						   //System.out.println(resultSet.getString("nombre")); 
						   
						  
					}
								
				}catch(Exception i) {
					System.out.println(i);
					
				}*/
				
				
				
				//Inicio inicio = new Inicio();
				//mp.showpane(inicio, View);
				
			}
		});
		
		
		JLabel label = new JLabel("Hola");
		label.setIcon(new ImageIcon(Main.class.getResource("/image/LoginBackground.jpg")));
		label.setBounds(542, 0, 538, 688);
		View.add(label);
		
	}
}
