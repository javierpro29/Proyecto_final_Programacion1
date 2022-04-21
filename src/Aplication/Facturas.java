package Aplication;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Facturas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Facturas() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facturas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(97, 101, 184, 54);
		add(lblNewLabel);

	}

}
