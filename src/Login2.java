import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Login2 {

	private JFrame frame;
	private JLabel panelImputs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 window = new Login2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setUndecorated(true);/*quita el marco de windows*/
		frame.getContentPane().setLayout(null);
		frame.setSize(1080, 720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Barrasuperior = new JLabel();
		Barrasuperior.setIcon(new ImageIcon(Login2.class.getResource("/image/Barrasuperior.jpg")));
		Barrasuperior.setBounds(0, 0, 1080, 35);
		Barrasuperior.setBackground(Color.BLACK);
		frame.getContentPane().add(Barrasuperior);
		Barrasuperior.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		Barrasuperior.setLayout(null);
		
		JLabel btncerrar = new JLabel("");
		btncerrar.setIcon(new ImageIcon(Login2.class.getResource("/image/btncerrar.png")));
		btncerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btncerrar.setBounds(29, 6, 24, 24);
		Barrasuperior.add(btncerrar);
		btncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JLabel btnminimizar = new JLabel("");
		btnminimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setExtendedState(JFrame.CROSSHAIR_CURSOR);
			}
		});
		btnminimizar.setIcon(new ImageIcon(Login2.class.getResource("/image/btnminimizar.png")));
		btnminimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnminimizar.setBounds(69, 6, 24, 24);
		Barrasuperior.add(btnminimizar);
		
		JLabel btnmaximizar = new JLabel("");
		btnmaximizar.setIcon(new ImageIcon(Login2.class.getResource("/image/btnmaximizar.png")));
		btnmaximizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnmaximizar.setBounds(109, 6, 24, 24);
		Barrasuperior.add(btnmaximizar);
		
		JLabel lblAppName = new JLabel("AppName");
		lblAppName.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblAppName.setBounds(31, 183, 254, 38);
		Barrasuperior.add(lblAppName);
		
		panelImputs = new JLabel();
		panelImputs.setBackground(Color.WHITE);
		panelImputs.setBounds(0, 0, 543, 720);
		frame.getContentPane().add(panelImputs);
		panelImputs.setLayout(null);
		
		JLabel lblIniciarSesio = new JLabel("INICIAR SESION");
		lblIniciarSesio.setFont(new Font("Roboto", Font.BOLD, 34));
		lblIniciarSesio.setBounds(31, 183, 293, 38);
		panelImputs.add(lblIniciarSesio);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Roboto", Font.BOLD, 20));
		lblUsuario.setBounds(31, 286, 263, 39);
		panelImputs.add(lblUsuario);
		
		JTextField lblIngresarUsuario = new JTextField("Ingrese su nobre de usuario");
		lblIngresarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngresarUsuario.setForeground(new Color(103, 93, 93));
		lblIngresarUsuario.setBounds(31, 343, 363, 39);
		lblIngresarUsuario.setBorder(null);
		panelImputs.add(lblIngresarUsuario);
		lblIngresarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if("Ingrese su nobre de usuario".equals(lblIngresarUsuario.getText())) {
					lblIngresarUsuario.setText(null);		
					lblIngresarUsuario.setForeground(new Color(0, 0, 0));
				}
			}
		});
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(31, 386, 351, 2);
		panelImputs.add(separator);
		
		JLabel lblUsuario_1 = new JLabel("Password");
		lblUsuario_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario_1.setBounds(31, 432, 263, 39);
		panelImputs.add(lblUsuario_1);
		
		JPasswordField lblIngresarPassword = new JPasswordField("Micontraseña");
		lblIngresarPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if("Micontraseña".equals(String.valueOf(lblIngresarPassword.getPassword()))){
					lblIngresarPassword.setText("");		
					lblIngresarPassword.setForeground(new Color(0, 0, 0));
				}
				//System.out.println(lblIngresarPassword.getPassword());
				//System.out.println(p);
			}
		});
		lblIngresarPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngresarPassword.setForeground(new Color(103, 93, 93));
		lblIngresarPassword.setBounds(31, 482, 351, 39);
		lblIngresarPassword.setBorder(null);
		panelImputs.add(lblIngresarPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(31, 521, 351, 2);
		panelImputs.add(separator_1);
		
		JPanel btnEnviar = new JPanel();
		btnEnviar.setBackground(SystemColor.textHighlight);
		btnEnviar.setBounds(30, 556, 150, 44);
		panelImputs.add(btnEnviar);
		btnEnviar.setLayout(null);
		
		JLabel lblbtnEntrar = new JLabel("ENTRAR", SwingConstants.CENTER );
		lblbtnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "Haz presionado el boton concha de tu madre");
			}
		});
		lblbtnEntrar.setBounds(0, 0, 150, 44);
		lblbtnEntrar.setFont(new Font("Roboto", Font.BOLD, 20));
		lblbtnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEnviar.add(lblbtnEntrar);
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(Login2.class.getResource("/image/BuergerBackgroun.jpg")));
		label.setBounds(546, 32, 538, 688);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("AppName");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 32));
		lblNewLabel.setBounds(458, 0, 164, 35) ;
		Barrasuperior.add(lblNewLabel);
		
		
		
	}
}
