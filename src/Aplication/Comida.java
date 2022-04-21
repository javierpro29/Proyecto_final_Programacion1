package Aplication;

import java.awt.Color;

import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Comida extends JPanel {
	
	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet rs = null;
	
	
	public Comida() {
		setForeground(Color.BLACK);
		setBackground(Color.LIGHT_GRAY);
		setSize(835, 622);
		setLayout(null);
		
		JDesktopPane View = new JDesktopPane();
		View.setBackground(Color.WHITE);
		View.setBounds(0, 0, 835, 622);
		add(View);
		View.setLayout(null);
		
		JPanel paneldeOpciones = new JPanel();
		paneldeOpciones.setBounds(0, 11, 835, 622);
		paneldeOpciones.setBackground(Color.WHITE);
		View.add(paneldeOpciones);
		paneldeOpciones.setLayout(null);
		
		/////////////////////////////////////////////////////////////////////////////
		JLabel Img1 = new JLabel("New label");
		Img1.setIcon(new ImageIcon(Comida.class.getResource("/image/Hamburguesa.jpg")));
		Img1.setBounds(52, 0, 160, 151);
		paneldeOpciones.add(Img1);
		
		JLabel lblTituloItem1 = new JLabel("Hamburguesa", SwingConstants.CENTER);
		lblTituloItem1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTituloItem1.setBounds(52, 155, 160, 37);
		paneldeOpciones.add(lblTituloItem1);
		
		JLabel lblPrecio1 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio1.setBounds(52, 220, 80, 37);
		paneldeOpciones.add(lblPrecio1);
		
		
		JLabel txtPrecio1 = new JLabel("350 RD$", SwingConstants.CENTER);
		txtPrecio1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio1.setBounds(132, 185, 94, 37);
		paneldeOpciones.add(txtPrecio1);
		
	
		JLabel cantItem1 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem1.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem1.setBounds(52, 185, 80, 37);
		paneldeOpciones.add(cantItem1);
		
		SpinnerModel value1 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner1 = new JSpinner(value1);
		spinner1.setBounds(142, 220, 70, 37);
		paneldeOpciones.add(spinner1);
		
		
		
		/////////////////////////////////////////////////////////////////////////////
		JLabel Img2 = new JLabel("New label");
		Img2.setIcon(new ImageIcon(Comida.class.getResource("/image/origen-de-la-pizza-1 1.png")));
		Img2.setBounds(325, 0, 160, 151);
		paneldeOpciones.add(Img2);
		
		JLabel lblTitulo2 = new JLabel("Pizza", SwingConstants.CENTER);
		lblTitulo2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo2.setBounds(325, 155, 160, 37);
		paneldeOpciones.add(lblTitulo2);
		
		JLabel lblPrecio2 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio2.setBounds(325, 185, 80, 37);
		paneldeOpciones.add(lblPrecio2);
		
		JLabel txtPrecio2 = new JLabel("500 RD$", SwingConstants.CENTER);
		txtPrecio2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio2.setBounds(405, 185, 94, 37);
		paneldeOpciones.add(txtPrecio2);
		
		JLabel cantItem2 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem2.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem2.setBounds(325, 220, 80, 37);
		paneldeOpciones.add(cantItem2);
		
		SpinnerModel value2 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner2 = new JSpinner(value2);
		spinner2.setBounds(405, 220, 70, 37);
		paneldeOpciones.add(spinner2);
		
		
		
		/////////////////////////////////////////////////////////////////////////////
		JLabel Img3 = new JLabel("New label");
		Img3.setIcon(new ImageIcon(Comida.class.getResource("/image/tacos-mexicanos 1.png")));
		Img3.setBounds(592, 0, 160, 151);
		paneldeOpciones.add(Img3);
		
		JLabel lblTitulo3 = new JLabel("Tacos", SwingConstants.CENTER);
		lblTitulo3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo3.setBounds(592, 155, 160, 37);
		paneldeOpciones.add(lblTitulo3);
		
		JLabel lblPrecio3 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio3.setBounds(592, 185, 80, 37);
		paneldeOpciones.add(lblPrecio3);
		
		JLabel txtPrecio3 = new JLabel("250 RD$", SwingConstants.CENTER);
		txtPrecio3.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio3.setBounds(672, 185, 94, 37);
		paneldeOpciones.add(txtPrecio3);
		
		JLabel cantItem3 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem3.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem3.setBounds(592, 220, 80, 37);
		paneldeOpciones.add(cantItem3);
		
		SpinnerModel value3 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner3 = new JSpinner(value3);
		spinner3.setBounds(672, 220, 70, 37);
		paneldeOpciones.add(spinner3);
		
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		JLabel Img4 = new JLabel("New label");
		Img4.setIcon(new ImageIcon(Comida.class.getResource("/image/Alitas-de-Pollo-Picante-Buffalo-Wings 1.png")));
		Img4.setBounds(52, 270, 160, 151);
		paneldeOpciones.add(Img4);
		
		JLabel lblTitulo4 = new JLabel("Alitas Picantes", SwingConstants.CENTER);
		lblTitulo4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo4.setBounds(52, 419, 160, 37);
		paneldeOpciones.add(lblTitulo4);
		
		JLabel lblPrecio4 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio4.setBounds(52, 460, 80, 37);
		paneldeOpciones.add(lblPrecio4);
		
		JLabel txtPrecio4 = new JLabel("300 RD$", SwingConstants.CENTER);
		txtPrecio4.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio4.setBounds(132, 460, 94, 37);
		paneldeOpciones.add(txtPrecio4);
		
		JLabel cantItem4 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem4.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem4.setBounds(52, 500, 80, 37);
		paneldeOpciones.add(cantItem4);
		
		SpinnerModel value4 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner4 = new JSpinner(value4);
		spinner4.setBounds(142, 500, 70, 37);
		paneldeOpciones.add(spinner4);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////
		JLabel Img5 = new JLabel("New label");
		Img5.setIcon(new ImageIcon(Comida.class.getResource("/image/chipotle-chicken-mini-empanadas 1.png")));
		Img5.setBounds(325, 270, 160, 151);
		paneldeOpciones.add(Img5);
		
		JLabel lblTitulo5 = new JLabel("Empanadas", SwingConstants.CENTER);
		lblTitulo5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo5.setBounds(325, 419, 160, 37);
		paneldeOpciones.add(lblTitulo5);
		
		JLabel lblPrecio5 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio5.setBounds(325, 500, 80, 37);
		paneldeOpciones.add(lblPrecio5);
		
		JLabel txtPrecio5 = new JLabel("200 RD$", SwingConstants.CENTER);
		txtPrecio5.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio5.setBounds(405, 460, 94, 37);
		paneldeOpciones.add(txtPrecio5);
		
		JLabel cantItem5 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem5.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem5.setBounds(325, 460, 80, 37);
		paneldeOpciones.add(cantItem5);
		
		SpinnerModel value5 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner5 = new JSpinner(value5);
		spinner5.setBounds(405, 500, 70, 37);
		paneldeOpciones.add(spinner5);
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////////
		JLabel Img6 = new JLabel("New label");
		Img6.setIcon(new ImageIcon(Comida.class.getResource("/image/images (2) 1.png")));
		Img6.setBounds(592, 270, 160, 151);
		paneldeOpciones.add(Img6);
		
		JLabel lblTitulo6 = new JLabel("Papas Fritas", SwingConstants.CENTER);
		lblTitulo6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo6.setBounds(592, 419, 160, 37);
		paneldeOpciones.add(lblTitulo6);
		
		JLabel lblPrecio6 = new JLabel("Precio:", SwingConstants.CENTER);
		lblPrecio6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio6.setBounds(592, 460, 80, 37);
		paneldeOpciones.add(lblPrecio6);
		
		JLabel txtPrecio6 = new JLabel("100 RD$ ", SwingConstants.CENTER);
		txtPrecio6.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPrecio6.setBounds(672, 460, 94, 37);
		paneldeOpciones.add(txtPrecio6);
		
		JLabel cantItem6 = new JLabel("Cant:", SwingConstants.CENTER);
		cantItem6.setFont(new Font("Tahoma", Font.BOLD, 20));
		cantItem6.setBounds(592, 500, 80, 37);
		paneldeOpciones.add(cantItem6);
		
		SpinnerModel value6 = new SpinnerNumberModel(0, 0, 20, 1);
		JSpinner spinner6 = new JSpinner(value6);
		spinner6.setBounds(672, 500, 70, 37);
		paneldeOpciones.add(spinner6);
		
		
		

		
		JPanel buttombar = new JPanel();
		buttombar.setLayout(null);
		buttombar.setBackground(new Color(25, 29, 40));
		buttombar.setBounds(0, 548, 835, 63);
		paneldeOpciones.add(buttombar);
		
		JLabel btnAgregarOrden = new JLabel("");
		btnAgregarOrden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String cantham = String.valueOf(spinner1.getValue().toString());
				String cantpiz= String.valueOf(spinner2.getValue().toString());
				String canttac= String.valueOf(spinner3.getValue().toString());
				String cantali = String.valueOf(spinner4.getValue().toString());
				String cantemp = String.valueOf(spinner5.getValue().toString());
				String cantpap = String.valueOf(spinner6.getValue().toString());
				
				
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
						
						
						
						preStatement = conexion.prepareStatement("select * from ordencomida where idcliente = ?");
						preStatement.setString(1, idcliente);
						
						rs = preStatement.executeQuery();
						
						if(rs.next()) {
							
							try {
								preStatement = conexion
										.prepareStatement("update ordencomida set hamburguesa = ?, pizza = ?, tacos = ?, alitas = ?, empanadas = ?, papas = ? where idcliente = ?");
								preStatement.setString(1, cantham);
								preStatement.setString(2, cantpiz);
								preStatement.setString(3, canttac);
								preStatement.setString(4, cantali);
								preStatement.setString(5, cantemp);
								preStatement.setString(6, cantpap);
								preStatement.setString(7, idcliente);
								int resultado = preStatement.executeUpdate();
								if(resultado > 0) {
									JOptionPane.showMessageDialog(null, "Orden de comida actualizada");
									conexion.close();
								}else{
									JOptionPane.showMessageDialog(null, "error");
								}	
							}catch(Exception u) {
								System.out.println(u);
							}
							
							
							
						}else {
							preStatement = conexion
									.prepareStatement("insert into ordencomida(hamburguesa, pizza, tacos, alitas, empanadas, papas, idcliente) values (?,?,?,?,?,?,?)");
							
							
							preStatement.setString(1, cantham);
							preStatement.setString(2, cantpiz);
							preStatement.setString(3, canttac);
							preStatement.setString(4, cantali);
							preStatement.setString(5, cantemp);
							preStatement.setString(6, cantpap);
							preStatement.setString(7, idcliente);
							
							int resultado = preStatement.executeUpdate();
							
							
							if(resultado > 0) {
								JOptionPane.showMessageDialog(null, "Orden de comida agregada");
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
											.prepareStatement("insert into ordencomida(hamburguesa, pizza, tacos, alitas, empanadas, papas, idcliente) values (?,?,?,?,?,?,?)");
									

									preStatement.setString(1, cantham);
									preStatement.setString(2, cantpiz);
									preStatement.setString(3, canttac);
									preStatement.setString(4, cantali);
									preStatement.setString(5, cantemp);
									preStatement.setString(6, cantpap);
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
		btnAgregarOrden.setIcon(new ImageIcon(Comida.class.getResource("/image/Agregar Orden.png")));
		btnAgregarOrden.setBounds(345, 12, 162, 41);
		buttombar.add(btnAgregarOrden);
		
		
				
	}
}
