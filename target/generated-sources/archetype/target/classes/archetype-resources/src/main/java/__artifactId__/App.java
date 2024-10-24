#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

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
