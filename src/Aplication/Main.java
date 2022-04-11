package Aplication;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;
	private JDesktopPane Vista;

	MostrarPanel mp = new MostrarPanel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(0, 0, 1080, 720);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JLabel Barrasuperior = new JLabel();
		Barrasuperior.setIcon(new ImageIcon(Main.class.getResource("/image/Barrasuperior.jpg")));
		Barrasuperior.setBounds(0, 0, 1084, 35);
		Barrasuperior.setBackground(Color.BLACK);
		//Barrasuperior.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		Barrasuperior.setLayout(null);
		frame.add(Barrasuperior);
		
		JLabel btncerrar = new JLabel();
		btncerrar.setIcon(new ImageIcon(Main.class.getResource("/image/btncerrar.png")));
		btncerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btncerrar.setBounds(29, 6, 24, 24);
		Barrasuperior.add(btncerrar);
		btncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		JLabel btnminimizar = new JLabel();
		btnminimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnminimizar.setIcon(new ImageIcon(Main.class.getResource("/image/btnminimizar.png")));
		btnminimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnminimizar.setBounds(69, 6, 24, 24);
		Barrasuperior.add(btnminimizar);
		
		JLabel btnmaximizar = new JLabel();
		btnmaximizar.setIcon(new ImageIcon(Main.class.getResource("/image/btnmaximizar.png")));
		btnmaximizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnmaximizar.setBounds(109, 6, 24, 24);
		Barrasuperior.add(btnmaximizar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/image/FryFood.png")));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 32));
		lblNewLabel.setBounds(458, 0, 164, 35) ;
		Barrasuperior.add(lblNewLabel);
		
		Vista = new JDesktopPane();
		Vista.setBackground(Color.WHITE);
		Vista.setBounds(0, 35, 1080, 685);
		frame.add(Vista);
		
		Login login= new Login();
		mp.showpane(login, Vista);
	}

}
