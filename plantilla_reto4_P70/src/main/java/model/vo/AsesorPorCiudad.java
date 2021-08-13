package model.vo;

public class AsesorPorCiudad {
    
    private Integer ID_Lider;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;
    
    public AsesorPorCiudad() {
    }

    public AsesorPorCiudad(Integer iD_Lider, String nombre, String primer_Apellido, String ciudad_Residencia) {
        ID_Lider = iD_Lider;
        Nombre = nombre;
        Primer_Apellido = primer_Apellido;
        Ciudad_Residencia = ciudad_Residencia;
    }

    public Integer getID_Lider() {
        return ID_Lider;
    }

    public void setID_Lider(Integer iD_Lider) {
        ID_Lider = iD_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }
    
}
