package Aplication;

import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class Usuarios extends JPanel {
	private JTextField txtUsuario;
	private JTextField txtPassword;

	private JTable table;
	private DefaultTableModel modelo;
	
	String user;

	
	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet rs = null;
	
	public Usuarios() {
		setForeground(Color.BLACK);
		setBackground(Color.LIGHT_GRAY);
		setSize(835, 685);
		setLayout(null);
		
		
		JDesktopPane View = new JDesktopPane();
		View.setBackground(Color.WHITE);
		View.setBounds(0, 0, 835, 685);
		add(View);
		View.setLayout(null);
		
		JLabel lblBacground = new JLabel("New label");
		lblBacground.setBackground(Color.RED);
		lblBacground.setBounds(0, 0, 835, 685);
		lblBacground.setIcon(new ImageIcon(Usuarios.class.getResource("/image/Inicio Background.jpg")));
		View.add(lblBacground);
		
		JPanel panel = new JPanel();
		panel.setBounds(7, 10, 820, 660);
		panel.setBackground(new Color(25, 29, 40));
		lblBacground.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Usuarios.class.getResource("/image/\u00D3rdenes (1).png")));
		lblNewLabel.setBounds(291, 0, 216, 62);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Agregar Usuarios");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(49, 59, 216, 39);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuarios:");
		lblNewLabel_2.setIcon(new ImageIcon(Usuarios.class.getResource("/image/13912137661548233623 1.png")));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 136, 142, 47);
		panel.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(140, 141, 127, 44);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password:");
		lblNewLabel_2_1.setIcon(new ImageIcon(Usuarios.class.getResource("/image/18613023211610061664 1 (1).png")));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(277, 138, 142, 47);
		panel.add(lblNewLabel_2_1);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(708, 136, 102, 47);
		comboBox.addItem("dbwriter");
		comboBox.addItem("sysadmin");
		panel.add(comboBox);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Password:");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Usuarios.class.getResource("/image/permisos.png")));
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(566, 136, 142, 47);
		panel.add(lblNewLabel_2_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(122, 363, 529, 211);
		panel.add(scrollPane);
		
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		
		modelo.addColumn("ID");
		modelo.addColumn("Username");
		modelo.addColumn("Password");
		modelo.addColumn("Permisos");
		
		//TableColumnModel columnModel = table.getColumnModel();
		
		table.setRowHeight(40);
	    
		scrollPane.setViewportView(table);
		
		conexion = Conexion.conectar();
	
		
		try {
			preStatement = conexion.prepareStatement("select * from mostrarusuarios");
			
			rs = preStatement.executeQuery();
			
			while(rs.next()) {
				
				Object[] fila = new Object[4];
				 fila[0] = rs.getString("iduser");
				 fila[1] = rs.getString("username");
				 fila[2] = rs.getString("userpassword");
				 fila[3] = rs.getString("permisos");
				 modelo.addRow(fila);
				
			}
				
				
			}catch(Exception i) {
				System.out.println(i);
				
			}
		
		
		
		
		
		
		
		
		JLabel lblNewLabel_2_2 = new JLabel("Usuarios Registrados en el sistema:");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(196, 328, 385, 31);
		panel.add(lblNewLabel_2_2);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(414, 141, 142, 44);
		panel.add(txtPassword);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				
				String usuario = txtUsuario.getText();
				String password = txtPassword.getText();
				String rol = String.valueOf(comboBox.getSelectedItem());
				String idrol = "2";
				
				if(rol == "sysadmin") {
					idrol = "1";
				}else if(rol == "dbwriter") {
					idrol = "2";
				}
				
				

				if(usuario.length() > 0) {
					
					if(password.length() > 0) {
						
						
						System.out.println(usuario);
						System.out.println(password);
						System.out.println(rol);
						System.out.println(idrol);
						
						conexion = Conexion.conectar();
						
						
						try {
							preStatement = conexion.prepareStatement("select * from usuarios where username = ?");
							preStatement.setString(1, usuario);
							rs = preStatement.executeQuery();
							
							if(rs.next()) {
								JOptionPane.showMessageDialog(null, "El usuario ya existe en la base de datos");
								txtUsuario.setText(null);
								txtPassword.setText(null);
							}else {
								
								preStatement = conexion.prepareStatement("insert into usuario(username, userpassword, rol) values(?,?,?)");
								preStatement.setString(1, usuario);
								preStatement.setString(2, password);
								preStatement.setString(3, idrol);
								
								
								int resultado = preStatement.executeUpdate();
								
								if(resultado > 0) {
									
									JOptionPane.showMessageDialog(null, "El usuario se ha agregado a la base de datos");
									
								}else {
									JOptionPane.showMessageDialog(null, "Error al agregar el usuario, revise sus datos");
								}
							}
								
								
							}catch(Exception i) {
								System.out.println(i);
								
							}
						
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios");
				}
				
		
				
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Usuarios.class.getResource("/image/Group 75 (1).png")));
		lblNewLabel_3.setBounds(307, 243, 150, 44);
		panel.add(lblNewLabel_3);
		
		
		JLabel btnEliminar = new JLabel("New label");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				int fila = table.getSelectedRow();
				user = table.getValueAt(fila, 0).toString();
				
				Usuario usuarioA = new Usuario();
				
				System.out.println("userr: "+user);
				System.out.println("usuario.username: "+usuarioA.username);
				
				conexion = Conexion.conectar();
				
				if(user.equals(usuarioA.username)) {
					JOptionPane.showMessageDialog(null, "No puede borrar el usuario logeado");
				}else {
			
					try {
						preStatement = conexion.prepareStatement("delete from usuario where username = ?");
							
						preStatement.setString(1, user);
							
						int resultado = preStatement.executeUpdate();
						if(resultado > 0) {
							JOptionPane.showMessageDialog(null, "El usuarios ha sido eliminado de la base de datos");
							conexion.close();
						}else{
							System.out.println("Error al eliminar el Usuario");
						}
							
					}catch(Exception i) {
							System.out.println(i);
					}
				}
				
				
			}
		});
		btnEliminar.setIcon(new ImageIcon(Usuarios.class.getResource("/image/Boton eliminar.png")));
		btnEliminar.setBounds(391, 585, 173, 44);
		panel.add(btnEliminar);
		
		
		
	
		JLabel btnActualizar = new JLabel("New label");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				int fila2 = table.getSelectedRow();
				String iduser = table.getValueAt(fila2, 0).toString();
				String username = table.getValueAt(fila2, 1).toString();
				String userpassword = table.getValueAt(fila2, 2).toString();
				String rol = table.getValueAt(fila2, 3).toString();
				String idrol = "2";
				
				if(rol == "sysadmin") {
					idrol = "1";
				}else {
					idrol = "2";
				}
				
				
				System.out.println("usarname: "+username);
				System.out.println("userpassword: "+userpassword);
				System.out.println("usarname: "+idrol);

				
				
				System.out.println("usarname: "+username);
				System.out.println("userpassword: "+userpassword);
				System.out.println("usarname: "+idrol);
				
				
				conexion = Conexion.conectar();
				
				
				try {
					preStatement = conexion
							.prepareStatement("update usuario set username = ?, userpassword = ?, rol = ? where iduser = ?");
					preStatement.setString(1, username);
					preStatement.setString(2, userpassword);
					preStatement.setString(3, idrol);
					preStatement.setString(4, iduser);
					
					int resultado = preStatement.executeUpdate();
					
					System.out.println(resultado);
					
					if(resultado > 0) {
						JOptionPane.showMessageDialog(null, "Se ha actualizado el usuario");
						conexion.close();
					}else{
						JOptionPane.showMessageDialog(null, "Error: no se ha podido actualizar el registro");
					}	
				}catch(Exception i){
					System.out.println(i);
				}
				
				
				
				
			}
		});
		btnActualizar.setIcon(new ImageIcon(Usuarios.class.getResource("/image/Btn recargar (1).png")));
		btnActualizar.setBounds(200, 583, 173, 44);
		panel.add(btnActualizar);

	}
}
