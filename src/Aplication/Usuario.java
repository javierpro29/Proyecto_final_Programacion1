package Aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Usuario {
	
	static String username;
	static String rol;
	
	Connection conexion = null;
	PreparedStatement preStatement = null;
	ResultSet resultSet = null;
	
	public int validarUsuario(String user, String password) {
		
		conexion = Conexion.conectar();
		int resultado = 0;
		
		try{
		
			preStatement = conexion.prepareStatement("select * from usuarios where username = ? and  userpassword = ?");

			preStatement.setString(1, user);
			preStatement.setString(2, password);
			
			resultSet = preStatement.executeQuery();
			
			
			
			if(resultSet.next()) {
				
				
				Usuario.username = resultSet.getString("username");
				Usuario.rol = resultSet.getString("permisos");
				
				resultado = 1;
				
			}else {
				resultado = 0;
			}
			
			
			
			
		}catch(Exception i){
			System.out.println(i);
		}
		
		
		return resultado;
	}
	
	
}
