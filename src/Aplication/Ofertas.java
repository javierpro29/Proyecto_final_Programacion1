package Aplication;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Ofertas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Ofertas() {
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setSize(835, 685);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ofertas.class.getResource("/image/Group 73.png")));
		lblNewLabel.setBounds(140, 131, 555, 401);
		add(lblNewLabel);

	}

}
