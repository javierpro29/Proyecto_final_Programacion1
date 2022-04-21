package Aplication;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.event.AncestorListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sistema extends JPanel{

	private final JSeparator separator = new JSeparator();
	
	MostrarPanel mp = new MostrarPanel();
	Usuario user = new Usuario();

	public Component panelFacturas;
	public Component panelUsuarios;
	public Component panelOrdenes;
	public Component panelOfertas;
	public Component panelMenu;
	
	
	public Sistema() {
		
		setForeground(Color.BLACK);
		setBackground(Color.LIGHT_GRAY);
		setSize(1080, 684);
		setLayout(null);
			
		JDesktopPane View = new JDesktopPane();
		View.setBounds(245, 0, 835, 685);
		add(View);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Sistema.class.getResource("/image/sysBacground.jpg")));
		lblNewLabel_1.setBounds(0, 0, 835, 685);
		View.add(lblNewLabel_1);
		
		JPanel LeftBar = new JPanel();
		LeftBar.setBounds(0, 0, 246, 685);
		LeftBar.setBackground(new Color(25, 29, 40));
		add(LeftBar);
		LeftBar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(17, 64, 41, 41);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/image/icons.png")));
		LeftBar.add(lblNewLabel);
		separator.setBounds(0, 130, 246, 31);
		LeftBar.add(separator);
		
		JLabel lblUserName = new JLabel("FriedFood");
		lblUserName.setText(user.username);
		lblUserName.setBounds(68, 64, 168, 41);
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setBackground(Color.WHITE);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 32));
		LeftBar.add(lblUserName);
		
	
		JPanel panelMenu = new JPanel();
		panelMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Menu menu = new Menu();
				mp.showpane(menu, View, 835, 685);
				
			}
		});
		panelMenu.setBounds(0, 195, 246, 29);
		panelMenu.setOpaque(true);
		//panelMenu.setBackground(new Color(233, 32, 4));
		panelMenu.setBackground(new Color(25, 29, 40));
		LeftBar.add(panelMenu);
		panelMenu.setLayout(null);
;
		
		JLabel MenuOption = new JLabel("Menu");
		MenuOption.setBounds(33, 0, 88, 28);
		MenuOption.setIcon(new ImageIcon(Menu.class.getResource("/image/Menu ICON.png")));
		MenuOption.setForeground(Color.WHITE);
		MenuOption.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelMenu.add(MenuOption);
		
		JPanel panelOfertas = new JPanel();
		panelOfertas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ofertas ofertas = new Ofertas();
				mp.showpane(ofertas, View, 835, 685);
			}
		});
		panelOfertas.setLayout(null);
		panelOfertas.setOpaque(true);
		//panelOfertas.setBackground(new Color(233, 32, 4));
		panelOfertas.setBackground(new Color(25, 29, 40));
		panelOfertas.setBounds(0, 242, 246, 29);
		LeftBar.add(panelOfertas);

		
		JLabel OfertasOption = new JLabel("Ofertas");
		OfertasOption.setIcon(new ImageIcon(Menu.class.getResource("/image/Oferta ICON.png")));
		OfertasOption.setForeground(Color.WHITE);
		OfertasOption.setFont(new Font("Tahoma", Font.BOLD, 20));
		OfertasOption.setBounds(33, 0, 200, 28);
		panelOfertas.add(OfertasOption);
		
		JPanel panelOrdenes = new JPanel();
		panelOrdenes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Ordenes ordenes = new Ordenes();
				mp.showpane(ordenes, View, 835, 685);
				
			}
		});
		panelOrdenes.setLayout(null);
		panelOrdenes.setOpaque(true);
		//panelOrdenes.setBackground(new Color(233, 32, 4));
		panelOrdenes.setBackground(new Color(25, 29, 40));
		panelOrdenes.setBounds(0, 296, 246, 29);
		LeftBar.add(panelOrdenes);
		
		JLabel lblOrdenes = new JLabel("Ordenes");
		lblOrdenes.setIcon(new ImageIcon(Menu.class.getResource("/image/Ordenes Icon.png")));
		lblOrdenes.setForeground(Color.WHITE);
		lblOrdenes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOrdenes.setBounds(33, 0, 200, 28);
		panelOrdenes.add(lblOrdenes);
		
		JPanel panelFacturas = new JPanel();
		panelFacturas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Facturas facturas = new Facturas();
				mp.showpane(facturas, View, 835, 685);
				
			}
		});
		panelFacturas.setLayout(null);
		panelFacturas.setOpaque(true);
		panelFacturas.setBackground(new Color(25, 29, 40));
		panelFacturas.setBounds(0, 343, 246, 29);
		LeftBar.add(panelFacturas);
		
		JLabel OfertasOption_1_1 = new JLabel("Facturas");
		OfertasOption_1_1.setIcon(new ImageIcon(Menu.class.getResource("/image/factura 1.png")));
		OfertasOption_1_1.setForeground(Color.WHITE);
		OfertasOption_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		OfertasOption_1_1.setBounds(33, 0, 200, 28);
		panelFacturas.add(OfertasOption_1_1);
		
		JPanel panelUsuarios = new JPanel();
		panelUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if ("sysadmin".equals(Usuario.rol)) {
					Usuarios usuarios = new Usuarios();
					mp.showpane(usuarios, View, 835, 685);					
				}else {
					JOptionPane.showMessageDialog(null, "No cuenta con los permisos necesarios");
				}
				
			}
		});
		panelUsuarios.setOpaque(true);
		//panelUsuarios.setBackground(new Color(233, 32, 4));
		panelUsuarios.setBackground(new Color(25, 29, 40));
		panelUsuarios.setBounds(0, 603, 246, 48);
		LeftBar.add(panelUsuarios);
		panelUsuarios.setLayout(null);
		
		JLabel lblUsuarioOption_1 = new JLabel("Usuarios");
		lblUsuarioOption_1.setIcon(new ImageIcon(Sistema.class.getResource("/image/add.png")));
		lblUsuarioOption_1.setForeground(Color.WHITE);
		lblUsuarioOption_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuarioOption_1.setBounds(17, 8, 224, 31);
		panelUsuarios.add(lblUsuarioOption_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(0, 0, 246, 10);
		panelUsuarios.add(separator_1_2);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(0, 45, 246, 10);
		panelUsuarios.add(separator_1_1_1);
		
		
		panelMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelMenu.setBackground(new Color(233, 32, 4));
				panelOfertas.setBackground(new Color(25, 29, 40));
				panelOrdenes.setBackground(new Color(25, 29, 40));
				panelFacturas.setBackground(new Color(25, 29, 40));
				panelUsuarios.setBackground(new Color(25, 29, 40));
				
			}
		});
		
		panelOfertas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelOfertas.setBackground(new Color(233, 32, 4));
				panelMenu.setBackground(new Color(25, 29, 40));
				panelOrdenes.setBackground(new Color(25, 29, 40));
				panelFacturas.setBackground(new Color(25, 29, 40));
				panelUsuarios.setBackground(new Color(25, 29, 40));
				
			}
		});
		
		panelOrdenes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelOrdenes.setBackground(new Color(233, 32, 4));
				panelOfertas.setBackground(new Color(25, 29, 40));
				panelMenu.setBackground(new Color(25, 29, 40));
				panelFacturas.setBackground(new Color(25, 29, 40));
				panelUsuarios.setBackground(new Color(25, 29, 40));
				
			}
		});
		
		panelFacturas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelFacturas.setBackground(new Color(233, 32, 4));
				panelOfertas.setBackground(new Color(25, 29, 40));
				panelOrdenes.setBackground(new Color(25, 29, 40));
				panelMenu.setBackground(new Color(25, 29, 40));
				panelUsuarios.setBackground(new Color(25, 29, 40));
			}
		});
		
		panelUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panelUsuarios.setBackground(new Color(233, 32, 4));
				panelOfertas.setBackground(new Color(25, 29, 40));
				panelOrdenes.setBackground(new Color(25, 29, 40));
				panelFacturas.setBackground(new Color(25, 29, 40));
				panelMenu.setBackground(new Color(25, 29, 40));
				
			}
		});
		
		
		
	}

}
