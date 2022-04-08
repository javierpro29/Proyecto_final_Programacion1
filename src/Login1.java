import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login1 {

	private JFrame frame;
	private JTextField txtUsername;
	private JLabel Username;
	private JLabel Password;
	private JTextField txtusername;
	private JTextField txtPassword;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 window = new Login1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login1() {
		initialize();
	}

	
	
	
	public class RoundJTextField extends JTextField {
	    private Shape shape;
	    public RoundJTextField(int size) {
	        super(size);
	        setOpaque(false);
	    }
	    protected void paintComponent(Graphics g) {
	         g.setColor(getBackground());
	         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	         super.paintComponent(g);
	    }
	    protected void paintBorder(Graphics g) {
	         g.setColor(getForeground());
	         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	    }
	    public boolean contains(int x, int y) {
	         if (shape == null || !shape.getBounds().equals(getBounds())) {
	             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	         }
	         return shape.contains(x, y);
	    }
	}
	
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1130, 681);
		background.setIcon(new ImageIcon(Login1.class.getResource("/image/background.png")));
		frame.getContentPane().add(background);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(4, 45, 82));
		panel.setBounds(243, 171, 594, 448);
		background.add(panel);
		panel.setLayout(null);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Login1.class.getResource("/image/logoT.png")));
		Logo.setBounds(15, 35, 565, 136);
		panel.add(Logo);
		
		
		/*TextField con icon para la entrada del Username*/
		Username = new JLabel();
		Username.setOpaque(true);
		Username.setBackground(Color.WHITE);
		Username.setBounds(181, 230, 233, 36);
		panel.add(Username);
		
		
		JLabel lblUsernameIcon = new JLabel("");
		lblUsernameIcon.setIcon(new ImageIcon(Login1.class.getResource("/image/UsernameIcon.png")));
		lblUsernameIcon.setBounds(10, 5, 29, 26);
		Username.add(lblUsernameIcon);
		lblUsernameIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtusername.setText(null);
			}
		});
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtusername.setText("Username");
		txtusername.setBackground(Color.WHITE);
		txtusername.setBounds(43, 1, 184, 35);
		Username.add(txtusername);
		txtusername.setColumns(10);
		txtusername.setBorder(null);
		/*Dectectar eventos*/
		txtusername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtusername.setText(null);
			}
		});
		
		
		
		
		/*TextField con icon para la entrada del Password*/
		Password = new JLabel();
		Password.setOpaque(true);
		Password.setBounds(181,  289, 233, 36);
		panel.add(Password);
		
		JLabel lblPasswordIcon = new JLabel("");
		lblPasswordIcon.setIcon(new ImageIcon(Login1.class.getResource("/image/PasswordIcon.jpg")));
		lblPasswordIcon.setBounds(10, 2, 26, 30);
		Password.add(lblPasswordIcon);
		lblPasswordIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPassword.setText("");
			}
		});
		
		txtPassword = new JPasswordField();
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.WHITE);
		txtPassword.setBounds(43, 0, 184, 35);
		Password.add(txtPassword);
		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPassword.setText(null);
			}
		});

	
		
		/*Boton del login*/
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(224, 349, 146, 42);
		panel.add(btnLogin);
		
	}
}


