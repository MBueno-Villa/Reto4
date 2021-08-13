package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.AsesorPorCiudadDao;
import model.dao.CompraPorProveedorDao;
import model.dao.ProyectoCasaCampestreDao;
import model.vo.AsesorPorCiudad;
import model.vo.CompraPorProveedor;
import model.vo.ProyectoCasaCampestre;


//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {       
    public final AsesorPorCiudadDao asesorPorCiudadDao;
    public final CompraPorProveedorDao compraPorProveedorDao;
    public final ProyectoCasaCampestreDao proyectoCasaCampestreDao;
    
    public ControladorRequerimientosReto4(){
        this.asesorPorCiudadDao = new AsesorPorCiudadDao();
        this.compraPorProveedorDao = new CompraPorProveedorDao();
        this.proyectoCasaCampestreDao = new ProyectoCasaCampestreDao();

    }

    public ArrayList<AsesorPorCiudad> consultarAsesorPorCiudad() throws SQLException {
        return asesorPorCiudadDao.rankingAsesorPorCiudad();
    }
    
    public ArrayList<CompraPorProveedor> consultarCompraPorProveedor() throws SQLException {
        return compraPorProveedorDao.rankingCompraPorProveedor();
    }

    public ArrayList<ProyectoCasaCampestre> consultarProyectoCasaCampestre() throws SQLException {
        return proyectoCasaCampestreDao.rankingProyectoCasaCampestre();
    }

}
