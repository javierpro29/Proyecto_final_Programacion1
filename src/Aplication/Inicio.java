package Aplication;

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
		Background.setIcon(new ImageIcon(Inicio.class.getResource("/image/Inicio Background.jpg")));
		add(Background);
		
		JLabel cordel = new JLabel("New label");
		cordel.setIcon(new ImageIcon(Inicio.class.getResource("/image/Cordel.png")));
		cordel.setBounds(408, 0, 261, 83);
		Background.add(cordel);
		
		JLabel footer = new JLabel("New label");
		footer.setIcon(new ImageIcon(Inicio.class.getResource("/image/Footer.jpg")));
		footer.setBounds(0, 612, 1080, 72);
		Background.add(footer);

		JLabel lblCopyright = new JLabel("\u00A9 FriedFood todos los derechos reservados");
		lblCopyright.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCopyright.setForeground(Color.WHITE);
		lblCopyright.setBounds(329, 13, 437, 47);
		footer.add(lblCopyright);
		
		
	}
}
