package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.CompraPorProveedor;

public class CompraPorProveedorDao {
   
    public ArrayList<CompraPorProveedor> rankingCompraPorProveedor() throws SQLException {
        ArrayList<CompraPorProveedor> respuesta = new ArrayList<CompraPorProveedor>();
        Connection conexion = JDBCUtilities.getConnection();

        try{ 
            String consulta =   "SELECT Id_Compra, Proveedor, Constructora, Banco_Vinculado,  Ciudad FROM Compra c INNER JOIN Proyecto p ON  c.ID_Proyecto = p.ID_Proyecto WHERE Ciudad = 'Salento' AND Proveedor = 'Homecenter'";


            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while(resultSet.next()){
                CompraPorProveedor compraPorProveedor = new CompraPorProveedor();
                    compraPorProveedor.setId_Compra(resultSet.getInt("ID_Compra"));
                    compraPorProveedor.setProveedor(resultSet.getString("Proveedor"));
                    compraPorProveedor.setConstructora(resultSet.getString("Constructora"));
                    compraPorProveedor.setBanco_Vinculado(resultSet.getString("Banco_Vinculado"));
                    compraPorProveedor.setCiudad(resultSet.getString("Ciudad"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(compraPorProveedor);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando los proyectos de tipo Apartaestudio en Quibdo: "+e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }

        return respuesta;
    }
        
}
