package view;

import controller.ControladorRequerimientosReto4;
import model.vo.AsesorPorCiudad;
import model.vo.CompraPorProveedor;
import model.vo.ProyectoCasaCampestre;


import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void asesorPorCiudad(){
    
        System.out.println("*** Asesor por Ciudad ***");
        try{
            ArrayList<AsesorPorCiudad> rankingAsesorPorCiudad = controlador.consultarAsesorPorCiudad();
            for(AsesorPorCiudad asesorPorCiudad : rankingAsesorPorCiudad){
                System.out.printf("El asesor con Id %d se llama %s %s y reside en %s %n", 
                    asesorPorCiudad.getID_Lider(),
                    asesorPorCiudad.getNombre(),
                    asesorPorCiudad.getPrimer_Apellido(),
                    asesorPorCiudad.getCiudad_Residencia()
                );
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void compraPorProveedor(){     

        System.out.println("*** Compras por Proveedor ***");
        try{
            ArrayList<CompraPorProveedor> rankingCompraPorProveedor = controlador.consultarCompraPorProveedor();
            for(CompraPorProveedor compraPorProveedor : rankingCompraPorProveedor){
                System.out.printf("La compra %d del proveedor %s para la construtora %s del banco %s ubicado en %s %n", 
                    compraPorProveedor.getId_Compra(),
                    compraPorProveedor.getProveedor(),
                    compraPorProveedor.getConstructora(),
                    compraPorProveedor.getBanco_Vinculado(),
                    compraPorProveedor.getCiudad()
                );
            }

        }catch(SQLException e){
            System.err.println(e);
        }
    }

    public static void proyectosCasaCampestre(){

        System.out.println("*** Proyectos Casa Campestre ***");
        try{
            ArrayList<ProyectoCasaCampestre> rankingProyectoCasaCampestre = controlador.consultarProyectoCasaCampestre();
            for(ProyectoCasaCampestre proyectoCasaCampestre : rankingProyectoCasaCampestre){
                System.out.printf("El proyecto con ID %d de la constructora: %s tiene %.0f habitaciones y esta ubicado en %s %n", 
                proyectoCasaCampestre.getID_Proyecto(),
                proyectoCasaCampestre.getConstructora(),
                proyectoCasaCampestre.getNumero_Habitaciones(),
                proyectoCasaCampestre.getCiudad()
                );
            }

        }catch(SQLException e){
            System.err.println(e);
        }
    }

}
