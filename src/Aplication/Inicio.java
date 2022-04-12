package Aplication;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setBackground(Color.DARK_GRAY);
		setSize(1080, 684);
		setLayout(null);
		
		
		JLabel Background = new JLabel("");
		Background.setBounds(0, 0, 1078, 684);
		Background.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Inicio Background.jpg")));
		add(Background);
		
		JLabel cordel = new JLabel("New label");
		cordel.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Cordel.png")));
		cordel.setBounds(408, 0, 261, 83);
		Background.add(cordel);
		
		JLabel footer = new JLabel("New label");
		footer.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Footer.jpg")));
		footer.setBounds(0, 612, 1080, 72);
		Background.add(footer);

		JLabel lblCopyright = new JLabel("\u00A9 FriedFood todos los derechos reservados");
		lblCopyright.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCopyright.setForeground(Color.WHITE);
		lblCopyright.setBounds(329, 13, 437, 47);
		footer.add(lblCopyright);
		
		JLabel Menu = new JLabel("New label");
		Menu.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/GrupoMen\u00FA.png")));
		Menu.setBounds(165, 149, 177, 199);
		Background.add(Menu);
		
		JLabel Ofertas = new JLabel("New label");
		Ofertas.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/GrupoOfertas.png")));
		Ofertas.setBounds(445, 146, 177, 199);
		Background.add(Ofertas);
		
		JLabel Órdenes = new JLabel("New label");
		Órdenes.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/Grupo\u00D3rdenes.png")));
		Órdenes.setBounds(705, 146, 177, 199);
		Background.add(Órdenes);
		
		JLabel Inventario = new JLabel("New label");
		Inventario.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/GrupoInventario.png")));
		Inventario.setBounds(165, 379, 177, 199);
		Background.add(Inventario);
		
		JLabel Facturas = new JLabel("New label");
		Facturas.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/GrupoFacturas.png")));
		Facturas.setBounds(445, 391, 177, 199);
		Background.add(Facturas);
		
		JLabel Usuarios = new JLabel("New label");
		Usuarios.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/GrupoUsuarios.png")));
		Usuarios.setBounds(705, 391, 177, 199);
		Background.add(Usuarios);
		
		
	}
}