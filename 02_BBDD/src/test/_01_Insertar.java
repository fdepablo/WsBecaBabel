package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_Insertar {

	public static void main(String[] args) {
		// Paso 1: Establecemos los parametros de conexión con la base de datos
		String cadenaConexion = "jdbc:mysql://localhost:3306/bbdd";
		String user = "root";
		String pass = "";
		
		 Connection con = null;
		// Paso 2: Interactuar con la BD 
		try{
			con = DriverManager.getConnection(cadenaConexion, user, pass);
			String nombre = "Ernion Güesley";
			int edad = 19;
			double peso = 44.5;
			
			//Esta menera NO se debe usar nunca, se debe usar SIEMPRE
			//preparedStatement, lo vemos solo para fines didacticos
			String sql = "INSERT INTO PERSONAS " +
				"(NOMBRE, EDAD, PESO) " +
				"VALUES ('" + nombre + "', '" + edad + "', '" + peso +  "');";
			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);
			
			//siguiente paso es mandar la query a traves de la conexión
			Statement sentencia;//esta clase NO se debe usar, el que la use en las practicas esta suspenso
			sentencia = con.createStatement();
			//Ejecutamos la query, y nos devuelve las filas afectadas (dadas de alta)
			int filasAfectadas = sentencia.executeUpdate(sql);
			
			System.out.println("Sentencia SQL ejecutada con éxito");
			System.out.println("Registros afectados: " + filasAfectadas);
		} catch (SQLException e) {
			System.out.println("Error al añadir una nueva persona");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}