package Aplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
	public static Connection conectar() {
		Connection conexion = null;
		try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/friedfood","root","2909");
            System.out.println("conectado");
        }catch(Exception i){
        	System.out.println(i);
        }
		return conexion;
	}
}