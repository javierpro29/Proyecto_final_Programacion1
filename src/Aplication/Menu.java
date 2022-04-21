package Aplication;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

import java.awt.Font;
import java.awt.Scrollbar;

import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;

public class Menu extends JPanel {
	private final JSeparator separator = new JSeparator();

	MostrarPanel mp = new MostrarPanel();
	Usuario user = new Usuario();
	
	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet rs = null;
	private JTextField textField;
	private JTextField textField_1;
	
	
	public Menu() {
		setForeground(Color.BLACK);
		setBackground(Color.LIGHT_GRAY);
		setSize(835, 685);
		setLayout(null);
		
		JDesktopPane View = new JDesktopPane();
		View.setBackground(Color.GRAY);
		View.setBounds(0, 63, 835, 622);
		add(View);
		View.setLayout(null);
		
		JPanel topbar = new JPanel();
		topbar.setBounds(0, 0, 835, 63);
		topbar.setOpaque(true);
		topbar.setBackground(new Color(25, 29, 40));
		add(topbar);
		topbar.setLayout(null);
		
		JPanel PanelComida = new JPanel();
		PanelComida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Comida comida = new Comida();
				mp.showpane(comida, View);	
			}
		});
		PanelComida.setOpaque(true);
		PanelComida.setBounds(11, 12, 140, 42);
		PanelComida.setBackground(new Color(25, 29, 40));
		topbar.add(PanelComida);
		PanelComida.setLayout(null);
		
		JLabel lblComida = new JLabel("New label");
		lblComida.setIcon(new ImageIcon(Menu.class.getResource("/image/Grupo comida.png")));
		lblComida.setBounds(0, 0, 140, 42);
		PanelComida.add(lblComida);
		
		JPanel PanelBebida = new JPanel();
		PanelBebida.setLayout(null);
		PanelBebida.setOpaque(true);
		PanelBebida.setBackground(new Color(25, 29, 40));
		PanelBebida.setBounds(170, 12, 140, 42);
		topbar.add(PanelBebida);
		
		JLabel lblBebida = new JLabel("New label");
		lblBebida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Bebida bebida = new Bebida();
				mp.showpane(bebida, View);
			}
		});
		lblBebida.setIcon(new ImageIcon(Menu.class.getResource("/image/Grupo bebida.png")));
		lblBebida.setBounds(0, 0, 140, 42);
		PanelBebida.add(lblBebida);
		
		JPanel PanelPostres = new JPanel();
		PanelPostres.setLayout(null);
		PanelPostres.setOpaque(true);
		PanelPostres.setBackground(new Color(25, 29, 40));
		PanelPostres.setBounds(329, 12, 140, 42);
		topbar.add(PanelPostres);
		
		JLabel lblPostres = new JLabel("New label");
		lblPostres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Postres postres = new Postres();
				mp.showpane(postres, View);
			}
		});
		lblPostres.setIcon(new ImageIcon(Menu.class.getResource("/image/Grupo Postre.png")));
		lblPostres.setBounds(0, 0, 140, 42);
		PanelPostres.add(lblPostres);
		
		textField = new JTextField();
		textField.setBounds(156, 12, 4, 40);
		topbar.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(315, 14, 4, 40);
		topbar.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/image/BackgroundMENU.jpg")));
		lblNewLabel.setBounds(0, 0, 835, 622);
		View.add(lblNewLabel);
		
		
	}
}
