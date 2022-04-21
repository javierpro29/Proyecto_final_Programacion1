package Aplication;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ordenes extends JPanel {
	
	private JTable table;
	private DefaultTableModel modelo;
	
	
	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet rs = null;
	
	String nombre_cliente;
	String idcliente;
	
	
	//Precio
	int Hamburguesa = 350;
	int Pizza = 500;
	int Tacos = 250;
	int Alitas = 300; 
	int Empanadas = 200; 
	int Papas = 100;
	
	/* Bebidas */
	int Coca = 40;
	int Pepsi = 35;
	int Sprite = 35;
	int Fanta = 35; 
	int MTN = 60; 
	int Pepper = 65;
	
	/* Postres */
	int Brownie = 50;
	int Galleta = 70;
	int Cheesecake = 220;
	int Helado = 150; 
	int Pie = 250; 
	int Churros = 100;
	
	
	public Ordenes() {
		setForeground(Color.BLACK);
		setBackground(Color.GRAY);
		setSize(835, 685);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 835, 685);
		panel.setBackground(new Color(25, 29, 40));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Ordenes.class.getResource("/image/\u00D3rdenes.png")));
		lblNewLabel_1.setBounds(277, 47, 209, 54);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccionar una orden:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(29, 176, 368, 33);
		panel.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("\u00BFQu\u00E9 desea hacer con la orden?");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(29, 550, 368, 33);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Ordenes.class.getResource("/image/Inicio Background.jpg")));
		lblNewLabel.setBounds(0, 0, 835, 685);
		add(lblNewLabel);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 220, 815, 316);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		
		modelo.addColumn("id");
		modelo.addColumn("Cliente");
		modelo.addColumn("Hamburguesa");
		modelo.addColumn("Pizza");
		modelo.addColumn("Taco");
		modelo.addColumn("Alitas Picantes");
		modelo.addColumn("Empanada");
		modelo.addColumn("Papas Fritas");
		modelo.addColumn("Coca cola");
		modelo.addColumn("pepsi");
		modelo.addColumn("Sprite");
		modelo.addColumn("Fanta");
		modelo.addColumn("Mtn Dew Zero");
		modelo.addColumn("Dr Pepper");
		modelo.addColumn("Brownie");
		modelo.addColumn("Galletas");
		modelo.addColumn("Cheescake");
		modelo.addColumn("Helado");
		modelo.addColumn("Apple Pie");
		modelo.addColumn("Churros");
		
		
		
		TableColumnModel columnModel = table.getColumnModel();

		
	    columnModel.getColumn(0).setPreferredWidth(1);
	    columnModel.getColumn(1).setPreferredWidth(150);
	    columnModel.getColumn(2).setPreferredWidth(1);
	    columnModel.getColumn(3).setPreferredWidth(1);
	    columnModel.getColumn(4).setPreferredWidth(1);
	    columnModel.getColumn(5).setPreferredWidth(1);
	    columnModel.getColumn(6).setPreferredWidth(1);
	    columnModel.getColumn(7).setPreferredWidth(1);
	    columnModel.getColumn(8).setPreferredWidth(1);
	    columnModel.getColumn(9).setPreferredWidth(1);
	    columnModel.getColumn(10).setPreferredWidth(1);
	    columnModel.getColumn(11).setPreferredWidth(1);
	    columnModel.getColumn(12).setPreferredWidth(1);
	    columnModel.getColumn(13).setPreferredWidth(1);
	    columnModel.getColumn(14).setPreferredWidth(1);
	    columnModel.getColumn(15).setPreferredWidth(1);
	    columnModel.getColumn(16).setPreferredWidth(1);
	    columnModel.getColumn(17).setPreferredWidth(1);
	    columnModel.getColumn(18).setPreferredWidth(1);
	    columnModel.getColumn(19).setPreferredWidth(1);
	    
	    
	    
	    table.setRowHeight(40);
	    
		scrollPane.setViewportView(table);


		conexion = Conexion.conectar();
		
	
		
		try {
			preStatement = conexion.prepareStatement("select * from ordenes");
			
			rs = preStatement.executeQuery();
			
			while(rs.next()) {
				
				Object[] fila = new Object[20];
				fila[0] = rs.getString("id");
				 fila[1] = rs.getString("nombre_cliente");
				 
				 fila[2] = rs.getString("hamburguesa");
				 fila[3] = rs.getString("pizza");
				 fila[4] = rs.getString("tacos");
				 fila[5] = rs.getString("alitas");
				 fila[6] = rs.getString("empanadas");
				 fila[7] = rs.getString("papas");
				 
				 fila[8] = rs.getString("coca");
				 fila[9] = rs.getString("pepsi");
				 fila[10] = rs.getString("sprite");
				 fila[11] = rs.getString("fanta");
				 fila[12] = rs.getString("mtn");
				 fila[13] = rs.getString("drpepper");
				 
				 fila[14] = rs.getString("brownie");
				 fila[15] = rs.getString("galletas");
				 fila[16] = rs.getString("cheescake");
				 fila[17] = rs.getString("helado");
				 fila[18] = rs.getString("applepie");
				 fila[19] = rs.getString("churros");
				 
				 modelo.addRow(fila);
				
			}
				
				
			}catch(Exception i) {
				System.out.println(i);
				
			}
		
		
		
		JLabel BtnEntregar = new JLabel("New label");
		BtnEntregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int fila = table.getSelectedRow();
				idcliente = table.getValueAt(fila, 0).toString();
				nombre_cliente = table.getValueAt(fila, 1).toString();
				
				
				conexion = Conexion.conectar();
				
	
				try {
					preStatement = conexion.prepareStatement("select * from ordenes");
					
					rs = preStatement.executeQuery();
					
					if(rs.next()) {
						
					}else {
						
					}
					
				}catch(Exception i) {
					System.out.println(i);
				}
				
				
				
				int fila2 = table.getSelectedRow();
				String idcliente = table.getValueAt(fila2, 0).toString();
				String nombrecliente = table.getValueAt(fila2, 1).toString();
				String cantham = table.getValueAt(fila2, 2).toString();
				String cantpiz = table.getValueAt(fila2, 3).toString();
				String canttac = table.getValueAt(fila2, 4).toString();
				String cantali = table.getValueAt(fila2, 5).toString();
				String cantemp = table.getValueAt(fila2, 6).toString();
				String cantpapas = table.getValueAt(fila2, 7).toString();
				
				String cantcoca = table.getValueAt(fila2, 8).toString();
				String cantpep = table.getValueAt(fila2, 9).toString();
				String cantspr = table.getValueAt(fila2, 10).toString();
				String cantfan = table.getValueAt(fila2, 11).toString();
				String cantmtn = table.getValueAt(fila2, 12).toString();
				String cantdr = table.getValueAt(fila2, 13).toString();
				
				String cantbr = table.getValueAt(fila2, 14).toString();
				String cantga = table.getValueAt(fila2, 15).toString();
				String cantch = table.getValueAt(fila2, 16).toString();
				String canthe = table.getValueAt(fila2, 17).toString();
				String cantap = table.getValueAt(fila2, 18).toString();
				String cantchu = table.getValueAt(fila2, 19).toString();
				
				
				int montoham = Hamburguesa * Integer.parseInt(cantham); 
				int montopiz = Pizza * Integer.parseInt(cantpiz);
				int montotac = Tacos * Integer.parseInt(canttac);
				int montoali = Alitas * Integer.parseInt(cantali);
				int montoemp = Empanadas * Integer.parseInt(cantemp);
				int montopapas = Alitas * Integer.parseInt(cantpapas);
				
				int montococa = Coca * Integer.parseInt(cantcoca); 
				int montopep = Pepsi * Integer.parseInt(cantpep);
				int montospr = Sprite * Integer.parseInt(cantspr);
				int montofan = Fanta * Integer.parseInt(cantfan);
				int montomtn = MTN * Integer.parseInt(cantmtn);
				int montodr = Pepper * Integer.parseInt(cantdr);
				
				
				int montobr = Brownie * Integer.parseInt(cantbr); 
				int montoga = Galleta * Integer.parseInt(cantga);
				int montoch = Cheesecake * Integer.parseInt(cantch);
				int montohe = Helado * Integer.parseInt(canthe);
				int montoap = Pie * Integer.parseInt(cantap);
				int montoche = Churros * Integer.parseInt(cantchu);
				
				
				
				int total = montoham + montopiz + montotac + montoali + montoemp + montopapas + 
						montococa + montopep + montospr + montofan + montomtn + montodr+
						montobr + montoga + montoch + montohe + montoap + montoche ; 
				
				
				
				Plantilla plantilla = new Plantilla(nombrecliente, cantham, montoham, cantpiz , montopiz, canttac, montotac, cantali, montoali, cantemp, montoemp, cantpapas, montopapas, 
				cantcoca, montococa, cantpep, montopep, cantspr, montospr, cantfan, montofan, cantmtn, montomtn, cantdr, montodr,
				cantbr, montobr, cantga, montoga, cantch, montoch, canthe, montohe, cantap, montoap, cantchu, montodr, +
				total, "20/092003/");
				plantilla.crearPlantilla();
				
				
				

				
				/* Postres */
				int Brownie = 50;
				int Galleta = 70;
				int Cheesecake = 220;
				int Helado = 150; 
				int Pie = 250; 
				int Churros = 100;
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		BtnEntregar.setIcon(new ImageIcon(Ordenes.class.getResource("/image/Boton entregar.png")));
		BtnEntregar.setBounds(379, 550, 170, 48);
		panel.add(BtnEntregar);
		
		
		
		JLabel BtnEliminar = new JLabel("New label");
		BtnEliminar.addMouseListener(new MouseAdapter() {


			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int fila = table.getSelectedRow();
				String valor = table.getValueAt(fila, 0).toString();
				
				System.out.println("El cliente que se va a eleminar el: "+valor);
				
				
				try {
					
					preStatement = conexion
							.prepareStatement("delete from ordenpostres where idcliente = ?");
					
					preStatement.setString(1, valor);
					
					int resultado = preStatement.executeUpdate();
					if(resultado > 0) {
						//conexion.close();
					}else{
						System.out.println("Error al eliminar la ordenpostre");
					}
					
					
					
				}catch(Exception t){
					System.out.println(t);
				}
				
				
				try {
					
					preStatement = conexion
							.prepareStatement("delete from ordenbebida where idcliente = ?");
					
					preStatement.setString(1, valor);
					
					int resultado = preStatement.executeUpdate();
					if(resultado > 0) {
						//conexion.close();
					}else{
						System.out.println("Error al eliminar la ordenbebida");
					}
					
					
					
				}catch(Exception t){
					System.out.println(t);
				}
				
				
				
				
				
				try {
					
					preStatement = conexion
							.prepareStatement("delete from ordencomida where idcliente = ?");
					
					preStatement.setString(1, valor);
					
					int resultado = preStatement.executeUpdate();
					if(resultado > 0) {
						//conexion.close();
					}else{
						System.out.println("Error al eliminar la ordencomida");
					}
					
					
					
				}catch(Exception t){
					System.out.println(t);
				}
				
				
				
				
				
				
				
				try {
					
					preStatement = conexion
							.prepareStatement("delete from cliente where id = ?");
					
					preStatement.setString(1, valor);
					
					int resultado = preStatement.executeUpdate();
					if(resultado > 0) {
						//conexion.close();
					}else{
						System.out.println("Error al eliminar el cliente");
					}
					
					
					
				}catch(Exception t){
					System.out.println(t);
				}
				
				
				
				
			}
		});
		BtnEliminar.setIcon(new ImageIcon(Ordenes.class.getResource("/image/Boton eliminar.png")));
		BtnEliminar.setBounds(559, 546, 170, 48);
		panel.add(BtnEliminar);

	}
}


