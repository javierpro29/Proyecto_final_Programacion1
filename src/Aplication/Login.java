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
	Usuario user = new Usuario();
	
	
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
		
		JPasswordField lblIngresarPassword = new JPasswordField("Micontrase�a");
		//JPasswordField lblIngresarPassword = new JPasswordField();
		lblIngresarPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngresarPassword.setForeground(new Color(103, 93, 93));
		lblIngresarPassword.setBounds(31, 482, 351, 39);
		lblIngresarPassword.setBorder(null);
		View.add(lblIngresarPassword);
		
		lblIngresarPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if("Micontrase�a".equals(String.valueOf(lblIngresarPassword.getPassword()))){
					lblIngresarPassword.setText(null);		
					lblIngresarPassword.setForeground(new Color(0, 0, 0));
				}
		
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
				String contrase�a = String.valueOf(lblIngresarPassword.getPassword());
				
				if(cambiacolor == true) {
					btnEnviar.setBackground(new Color(0, 0, 0));

					cambiacolor = false;
				}else {
					btnEnviar.setBackground(SystemColor.textHighlight);
					cambiacolor = true;
				}
				
				
				//validaci�n del usuario
				if(user.validarUsuario(usuario, contrase�a) == 1) {
					//Inicio inicio = new Inicio();
					Sistema sistema = new Sistema();
					mp.showpane(sistema, View);
				}else {
					JOptionPane.showMessageDialog(null, "Sus credenciales son incorrectas", "Error de inision de sesion", JOptionPane.WARNING_MESSAGE);
				}
								
				
				/*conexion = Conexion.conectar();
				
				try {
		
					preStatement = conexion.prepareStatement("select * from usuarios where username = ? and  userpassword = ?");
					
					preStatement.setString(1, usuario);
					preStatement.setString(2, contrase�a);
					
					resultSet = preStatement.executeQuery();
					
					int resultado = 0;
				
					
					if(resultSet.next()) {
						
						
						String username = resultSet.getString("username");
						String rol = resultSet.getString("permisos");
						
						System.out.println(username);
						System.out.println(rol);
						
						resultado = 1;
						
						if(resultado == 1) {
							Inicio inicio = new Inicio();
							mp.showpane(inicio, View);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Sus credenciales son incorrectas", "Error de inision de sesion", JOptionPane.WARNING_MESSAGE);
					}
					
					
						
				}catch(Exception i) {
					System.out.println(i);
					JOptionPane.showMessageDialog(null, "Sus credenciales son incorrectas", "Error de inision de sesion", JOptionPane.WARNING_MESSAGE);

				}*/
				
				
				
			}
		});
		
		
		JLabel label = new JLabel("Hola");
		label.setIcon(new ImageIcon(Main.class.getResource("/image/LoginBackground.jpg")));
		label.setBounds(542, 0, 538, 688);
		View.add(label);
		
	}
}
