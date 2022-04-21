package Aplication;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarProducto extends JPanel {
	
	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet rs = null;
	
	
	private JTextField txtID;
	
	private JTable table;
	
	private JTable columnModel;
	private DefaultTableModel modelo;

		
	public EliminarProducto() {
		setForeground(Color.BLACK);
		setBackground(Color.LIGHT_GRAY);
		setSize(835, 685);
		setLayout(null);
		
		JDesktopPane View = new JDesktopPane();
		View.setBackground(Color.WHITE);
		View.setBounds(0, 0, 835, 685);
		add(View);
		View.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 13, 777, 658);
		panel.setBackground(new Color(25, 29, 40));
		View.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AgregarProducto.class.getResource("/image/Inicio Background.jpg")));
		lblNewLabel_1.setBounds(0, 0, 835, 685);
		View.add(lblNewLabel_1);
		
		
		JLabel lblEliminarProductosDel = new JLabel("Eliminar Productos Del Menu", SwingConstants.CENTER);
		lblEliminarProductosDel.setForeground(Color.WHITE);
		lblEliminarProductosDel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEliminarProductosDel.setBackground(Color.WHITE);
		lblEliminarProductosDel.setBounds(10, 48, 768, 40);
		panel.add(lblEliminarProductosDel);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(110, 166, 55, 34);
		panel.add(lblNewLabel);
		
		txtID = new JTextField();
		txtID.setBounds(153, 166, 195, 30);
		panel.add(txtID);
		txtID.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				conexion = Conexion.conectar();
				String id =  txtID.getText();	
				
				try{
											
					preStatement = conexion
								.prepareStatement("delete from Producto where id = ?");
						
					preStatement.setString(1, id);
						
					int resultado = preStatement.executeUpdate();
					if(resultado > 0) {
						table.setModel(modelo);
						modelo.fireTableDataChanged();
						JOptionPane.showMessageDialog(null, "Producto Eliminado correctamente");
						conexion.close();
					}else{
						JOptionPane.showMessageDialog(null, "Error: El producto no se ha podido eliminar correctamente. Revise el dato ingresado");
					}
					
				}catch(Exception o){
					JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");  
				}
				
				
			}
		});
		btnEliminar.setOpaque(true);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.setBounds(378, 166, 120, 30);
		panel.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 260, 718, 325);
		panel.add(scrollPane);
		
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("Image");
		modelo.addColumn("Descripcion");
		modelo.addColumn("Precio");
		
		TableColumnModel columnModel = table.getColumnModel();

	    columnModel.getColumn(0).setPreferredWidth(1);
	    columnModel.getColumn(1).setPreferredWidth(100);
	    columnModel.getColumn(2).setPreferredWidth(1);
	    columnModel.getColumn(3).setPreferredWidth(1);
	    columnModel.getColumn(4).setPreferredWidth(1);
		scrollPane.setViewportView(table);
			
		
	
		conexion = Conexion.conectar();
		
		try {
			preStatement = conexion.prepareStatement("select * from producto");
			
			rs = preStatement.executeQuery();
			
			while(rs.next()) {
				
				Object[] fila = new Object[5];
				 fila[0] = rs.getString("id");
				 fila[1] = rs.getString("nombre");
				 fila[2] = rs.getString("image");
				 fila[3] = rs.getString("descripcion");
				 fila[4] = rs.getString("Precio");
				 modelo.addRow(fila);
				
			}
				
				
			}catch(Exception i) {
				System.out.println(i);
				
			}

		
	}

}
