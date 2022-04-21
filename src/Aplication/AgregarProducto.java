package Aplication;

import java.awt.Color;

import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AgregarProducto extends JPanel {
	private JTextField txtProducto;
	private JTextField txtImagen;
	private JTextField txtPrecio;
	private int getfile;
	
	
	JFileChooser sar = new JFileChooser();
	private File file;

	

	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet rs = null;
	private DefaultTableModel modelo;
	private Object scrollPane;
	private JTextArea txtDescripcion;
	
	
	
	
	
	public File browser() {
		JFileChooser fc = new JFileChooser();

		getfile = fc.showOpenDialog(null);
	
		if(getfile == JFileChooser.APPROVE_OPTION) {
			file = new File(fc.getSelectedFile().getAbsolutePath());
			System.out.println(file);
		}
		
		return file;
	}
	
	
	
	public AgregarProducto() {
		
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
		
		JLabel lblProducto = new JLabel("PRODUCTO:");
		lblProducto.setForeground(new Color(255, 255, 255));
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProducto.setBounds(91, 156, 130, 30);
		panel.add(lblProducto);
		
		txtProducto = new JTextField();
		txtProducto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtProducto.setBounds(212, 156, 375, 30);
		panel.add(txtProducto);
		txtProducto.setColumns(10);
		
		JLabel lblImagen = new JLabel("IMAGEN:");
		lblImagen.setForeground(Color.WHITE);
		lblImagen.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblImagen.setBounds(72, 227, 130, 30);
		panel.add(lblImagen);
		
		txtImagen = new JTextField();
		txtImagen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtImagen.setColumns(10);
		txtImagen.setEditable(false);
		txtImagen.setBounds(172, 227, 375, 30);
		panel.add(txtImagen);
		
		JButton btnBrowser = new JButton("Browser");
		btnBrowser.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				browser();
				
				txtImagen.setText(String.valueOf(file));
			}
		});
		btnBrowser.setOpaque(true);
		btnBrowser.setBackground(Color.white);
		btnBrowser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBrowser.setBounds(554, 227, 105, 30);
		panel.add(btnBrowser);
		
		JLabel lblDescripcin = new JLabel("DESCRIPCI\u00D3N:");
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDescripcin.setBounds(83, 301, 165, 30);
		panel.add(lblDescripcin);
		
		JTextArea txtDescripcion = new JTextArea();
		txtDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDescripcion.setBounds(243, 304, 486, 91);
		panel.add(txtDescripcion);
		
		
		
		JLabel lblNewLabel = new JLabel("Agregar Productos Al Menu", SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(0, 41, 768, 40);
		panel.add(lblNewLabel);
		

		JLabel lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecio.setBounds(83, 456, 130, 30);
		panel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(173, 453, 130, 30);
		panel.add(txtPrecio);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String name = txtProducto.getText();
				String img = txtImagen.getText();
				String desc = txtDescripcion.getText();
				String precio = txtPrecio.getText();
				
				
				System.out.println(name);
				System.out.println(img);
				System.out.println(desc);
				System.out.println(precio);
				
				
				conexion = Conexion.conectar();
				
				try {
					
					preStatement = conexion
							.prepareStatement("insert into producto(nombre, image, descripcion, precio) values(?,?,?,?)");
					
					preStatement.setString(1, name);
					preStatement.setString(2, img);
					preStatement.setString(3, desc);
					preStatement.setString(4, precio);
					
					int resultado = preStatement.executeUpdate();
					if(resultado > 0) {
						JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
						
						conexion.close();
						
						
						txtProducto.setText(null);
						txtImagen.setText(null);
						txtDescripcion.setText(null);
						txtPrecio.setText(null);
						
						
					}else{
						JOptionPane.showMessageDialog(null, "Error: el Producto no se ha podido registrar correctamente. Revise los datos");
					}
					
				
					
				}catch(Exception i){
					System.out.println(i);
				}
				
				
				
				
				
			}
		});
		btnAgregar.setOpaque(true);
		btnAgregar.setBackground(Color.white);
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAgregar.setBounds(332, 554, 120, 30);
		panel.add(btnAgregar);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AgregarProducto.class.getResource("/image/Inicio Background.jpg")));
		lblNewLabel_1.setBounds(0, 0, 835, 685);
		View.add(lblNewLabel_1);
		

		
	}
		
}
