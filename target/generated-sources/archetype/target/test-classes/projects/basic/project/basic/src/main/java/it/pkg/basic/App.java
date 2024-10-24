package it.pkg.basic;

import java.sql.Connection;

import servicios.ConexionBDImplementacion;
import servicios.ConexionBDIntrerfaz;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) {
    	
    	
    	ConexionBDIntrerfaz cpi = new ConexionBDImplementacion();
		
    	Connection conexion = cpi.generaConexion();
		
	
		
    }
}
