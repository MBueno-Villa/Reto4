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
import model.vo.ProyectoCasaCampestre;

public class ProyectoCasaCampestreDao {
    //Obtener los proyectos por Tipo en la ciudad de Salento
    public ArrayList<ProyectoCasaCampestre> rankingProyectoCasaCampestre() throws SQLException {

        ArrayList<ProyectoCasaCampestre> respuesta = new ArrayList<ProyectoCasaCampestre>();
        Connection conexion = JDBCUtilities.getConnection();

        try{       

            String consulta =   "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla')";


            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while(resultSet.next()){
                ProyectoCasaCampestre proyectoCasaCampestre = new ProyectoCasaCampestre();
                proyectoCasaCampestre.setID_Proyecto(resultSet.getInt("ID_Proyecto"));
                proyectoCasaCampestre.setConstructora(resultSet.getString("Constructora"));
                proyectoCasaCampestre.setNumero_Habitaciones(resultSet.getDouble("Numero_Habitaciones"));
                proyectoCasaCampestre.setCiudad(resultSet.getString("Ciudad"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(proyectoCasaCampestre);
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

        //Retornar la colección de vo's
        return respuesta;
    }     
}
