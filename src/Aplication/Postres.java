package Aplication;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Postres extends JPanel {

	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet rs = null;
	
	
	public Postres() {
		setForeground(Color.BLACK);
		setBackground(Color.LIGHT_GRAY);
		setSize(835, 622);
		setLayout(null);
		
		JDesktopPane View = new JDesktopPane();
		View.setBackground(Color.WHITE);
		View.setBounds(0, 0, 835, 622);
		add(View);
		View.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 835, 622);
		panel.setBackground(Color.WHITE);
		View.add(panel);
		panel.setLayout(null);
		
		JLabel Img1 = new JLabel("New label");
		Img1.setIcon(new ImageIcon(Postres.class.getResource("/image/coffee-brownies-with-dulce-de-leche-and-pecans 1.png")));
		Img1.setBounds(52, 36, 160, 136);
		panel.add(Img1);
		
		JLabel lblTituloItem1 = new JLabel("Brownie", SwingConstants.CENTER);
		lblTituloItem1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTituloItem1.setBounds(62, 183, 160, 37);
		panel.add(lblTituloItem1);
		
		JLabel lblPrecio1 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio1.setBounds(68, 209, 80, 37);
		panel.add(lblPrecio1);
		
		JLabel txtPrecio1 = new JLabel("50 RD$", SwingConstants.CENTER);
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio1.setBounds(142, 209, 80, 37);
		panel.add(txtPrecio1);
		
		JLabel cantItem1 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem1.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem1.setBounds(52, 241, 80, 37);
		panel.add(cantItem1);
		
		SpinnerModel value1 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner1 = new JSpinner(value1);
		spinner1.setBounds(142, 241, 70, 37);
		panel.add(spinner1);
		
		
		JLabel Img2 = new JLabel("New label");
		Img2.setIcon(new ImageIcon(Postres.class.getResource("/image/38990 1.png")));
		Img2.setBounds(321, 26, 191, 151);
		panel.add(Img2);
		
		JLabel lblTitulo2 = new JLabel("Galletas", SwingConstants.CENTER);
		lblTitulo2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo2.setBounds(325, 183, 160, 37);
		panel.add(lblTitulo2);
		
		JLabel lblPrecio2 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio2.setBounds(325, 209, 80, 37);
		panel.add(lblPrecio2);
		
		JLabel txtPrecio2 = new JLabel("70 RD$", SwingConstants.CENTER);
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio2.setBounds(405, 209, 80, 37);
		panel.add(txtPrecio2);
		
		JLabel cantItem2 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem2.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem2.setBounds(325, 241, 80, 37);
		panel.add(cantItem2);
		
		SpinnerModel value2 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner2 = new JSpinner(value2);
		spinner2.setBounds(405, 241, 70, 37);
		panel.add(spinner2);
		
		JLabel Img3 = new JLabel("");
		Img3.setIcon(new ImageIcon(Postres.class.getResource("/image/2017b5b6ae4.png")));
		Img3.setBounds(592, 26, 191, 151);
		panel.add(Img3);
		
		JLabel lblTitulo3 = new JLabel("Chesscake", SwingConstants.CENTER);
		lblTitulo3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo3.setBounds(592, 183, 160, 37);
		panel.add(lblTitulo3);
		
		JLabel lblPrecio3 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio3.setBounds(592, 209, 80, 37);
		panel.add(lblPrecio3);
		
		JLabel txtPrecio3 = new JLabel("220 RD$", SwingConstants.CENTER);
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio3.setBounds(672, 209, 95, 37);
		panel.add(txtPrecio3);
		
		JLabel cantItem3 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem3.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem3.setBounds(592, 241, 80, 37);
		panel.add(cantItem3);
		
		SpinnerModel value3 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner3 = new JSpinner(value3);
		spinner3.setBounds(672, 241, 70, 37);
		panel.add(spinner3);
		
		JLabel Img4 = new JLabel("New label");
		Img4.setIcon(new ImageIcon(Postres.class.getResource("/image/banana-split-566x440 1.png")));
		Img4.setBounds(29, 301, 198, 151);
		panel.add(Img4);
		
		JLabel lblTitulo4 = new JLabel("Helado", SwingConstants.CENTER);
		lblTitulo4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo4.setBounds(41, 452, 160, 37);
		panel.add(lblTitulo4);
		
		JLabel lblPrecio4 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio4.setBounds(52, 482, 80, 37);
		panel.add(lblPrecio4);
		
		JLabel txtPrecio4 = new JLabel("150 RD$", SwingConstants.CENTER);
		txtPrecio4.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio4.setBounds(132, 482, 90, 37);
		panel.add(txtPrecio4);
		
		JLabel cantItem4 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem4.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem4.setBounds(52, 517, 80, 37);
		panel.add(cantItem4);
		
		SpinnerModel value4 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner4 = new JSpinner(value4);
		spinner4.setBounds(142, 517, 70, 37);
		panel.add(spinner4);
		
		JLabel Img5 = new JLabel("");
		Img5.setIcon(new ImageIcon(Postres.class.getResource("/image/Best-Ever-Apple-Pie-SQ 1.png")));
		Img5.setBounds(340, 301, 145, 151);
		panel.add(Img5);
		
		JLabel lblTitulo5 = new JLabel("Applepie", SwingConstants.CENTER);
		lblTitulo5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo5.setBounds(325, 452, 160, 37);
		panel.add(lblTitulo5);
		
		JLabel lblPrecio5 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio5.setBounds(325, 482, 80, 37);
		panel.add(lblPrecio5);
		
		JLabel txtPrecio5 = new JLabel("250 RD$", SwingConstants.CENTER);
		txtPrecio5.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio5.setBounds(405, 482, 95, 37);
		panel.add(txtPrecio5);
		
		JLabel cantItem5 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem5.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem5.setBounds(325, 517, 80, 37);
		panel.add(cantItem5);
		
		SpinnerModel value5 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner5 = new JSpinner(value5);
		spinner5.setBounds(405, 517, 70, 37);
		panel.add(spinner5);
		
		JLabel Img6 = new JLabel("");
		Img6.setIcon(new ImageIcon(Postres.class.getResource("/image/Churros-con-canela-y-salsa-de-chocolate 1.png")));
		Img6.setBounds(614, 301, 168, 151);
		panel.add(Img6);
		
		JLabel lblTitulo6 = new JLabel("Churros", SwingConstants.CENTER);
		lblTitulo6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo6.setBounds(592, 452, 160, 37);
		panel.add(lblTitulo6);
		
		JLabel lblPrecio6 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio6.setBounds(592, 482, 80, 37);
		panel.add(lblPrecio6);
		
		JLabel txtPrecio6 = new JLabel("100 RD$", SwingConstants.CENTER);
		txtPrecio6.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio6.setBounds(672, 482, 95, 37);
		panel.add(txtPrecio6);
		
		JLabel cantItem6 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem6.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem6.setBounds(592, 517, 80, 37);
		panel.add(cantItem6);
		
		SpinnerModel value6 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner6 = new JSpinner(value6);
		spinner6.setBounds(672, 517, 70, 37);
		panel.add(spinner6);
		
		
		
		JPanel buttombar = new JPanel();
		buttombar.setBounds(0, 559, 835, 63);
		buttombar.setBackground(new Color(25,29,40));
		panel.add(buttombar);
		buttombar.setLayout(null);
		
		JLabel btnAgregarOrden = new JLabel("");
		btnAgregarOrden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String cantbrownie = String.valueOf(spinner1.getValue().toString());
				String cantgalletas = String.valueOf(spinner2.getValue().toString());
				String cantcheescake = String.valueOf(spinner3.getValue().toString());
				String canthelado = String.valueOf(spinner4.getValue().toString());
				String cantapplepie = String.valueOf(spinner5.getValue().toString());
				String cantchurros = String.valueOf(spinner6.getValue().toString());
				

				String cliente = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: "));
				//JOptionPane.showMessageDialog(null, cliente + "\n" + cantham+ "\n" + cantpiz+ "\n" + canttac+ "\n" + cantali+ "\n" + cantemp+ "\n" + cantpap   );
				conexion = Conexion.conectar();
				String idcliente; 
				
				
				try {
					preStatement = conexion.prepareStatement("select * from cliente where nombre_cliente = ?");
					preStatement.setString(1, cliente);
					
					rs = preStatement.executeQuery();
					
					
					if(rs.next()) {
						
						idcliente = rs.getString("id");
						System.out.println(idcliente);
						
						
						
						
						preStatement = conexion.prepareStatement("select * from ordenbebida where idcliente = ?");
						preStatement.setString(1, idcliente);
						
						rs = preStatement.executeQuery();
						
						if(rs.next()) {
							
							try {
								preStatement = conexion
										.prepareStatement("update ordenpostres set brownie = ?, galletas = ?, cheescake = ?, helado = ?, applepie = ?, churros = ? where idcliente = ?");
								
								preStatement.setString(1, cantbrownie);
								preStatement.setString(2, cantgalletas);
								preStatement.setString(3, cantcheescake);
								preStatement.setString(4, canthelado);
								preStatement.setString(5, cantapplepie);
								preStatement.setString(6, cantchurros);
								preStatement.setString(7, idcliente);
								int resultado = preStatement.executeUpdate();
								
								if(resultado > 0) {
									JOptionPane.showMessageDialog(null, "Orden de postre actualizada");
									conexion.close();
									conexion.close();
								}else{
									JOptionPane.showMessageDialog(null, "error");
								}	
							}catch(Exception u) {
								System.out.println(u);
							}
							
							
						}else {
							preStatement = conexion
									.prepareStatement("insert into ordenpostres(brownie, galletas, cheescake, helado, applepie, churros, idcliente) values (?,?,?,?,?,?,?)");
							
							
							preStatement.setString(1, cantbrownie);
							preStatement.setString(2, cantgalletas);
							preStatement.setString(3, cantcheescake);
							preStatement.setString(4, canthelado);
							preStatement.setString(5, cantapplepie);
							preStatement.setString(6, cantchurros);
							preStatement.setString(7, idcliente);
							
							int resultado = preStatement.executeUpdate();
							
							
							if(resultado > 0) {
								JOptionPane.showMessageDialog(null, "Orden de postre agregada");
								conexion.close();
								
							}else{
								JOptionPane.showMessageDialog(null, "error");
							}	
						}
						
						
						
	
						
					}else {
						preStatement = conexion
								.prepareStatement("insert into cliente(nombre_cliente) values(?)");
						preStatement.setString(1, cliente);

						int res = preStatement.executeUpdate();
						
						if(res > 0) {
							
							preStatement = conexion.prepareStatement("select * from cliente where nombre_cliente = ?");
							preStatement.setString(1, cliente);
							
							rs = preStatement.executeQuery();
							
							if(rs.next()) {
								idcliente = rs.getString("id");
								System.out.println("Id del cliente recien creado: "+idcliente);	
								
								try {
									
									preStatement = conexion
											.prepareStatement("insert into ordenpostres(brownie, galletas, cheescake, helado, applepie, churros, idcliente) values (?,?,?,?,?,?,?)");
									

									preStatement.setString(1, cantbrownie);
									preStatement.setString(2, cantgalletas);
									preStatement.setString(3, cantcheescake);
									preStatement.setString(4, canthelado);
									preStatement.setString(5, cantapplepie);
									preStatement.setString(6, cantchurros);
									preStatement.setString(7, idcliente);

									int rl = preStatement.executeUpdate();
									
									if(rl > 0) {
										conexion.close();
									}else{
										JOptionPane.showMessageDialog(null, "error");
									}
									
								}catch(Exception n){
									System.out.println(n);
								}
								
								
							}
							
							
						}else{
							
						}
					}
					
				}catch(Exception o){
					System.out.println();
				}
				
				
				
				
				
			}
		});
		btnAgregarOrden.setIcon(new ImageIcon(Postres.class.getResource("/image/Agregar Orden.png")));
		btnAgregarOrden.setBounds(345, 12, 162, 41);
		buttombar.add(btnAgregarOrden);
		
	}

}
