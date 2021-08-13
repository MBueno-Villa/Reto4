package model.vo;

public class CompraPorProveedor {
    private Integer Id_Compra;
    private String Proveedor;
    private String Constructora;
    private String Banco_Vinculado;
    private String Ciudad;
    
    public CompraPorProveedor() {
    }

    public CompraPorProveedor(Integer id_Compra, String proveedor, String constructora, String banco_Vinculado,
            String ciudad) {
        Id_Compra = id_Compra;
        Proveedor = proveedor;
        Constructora = constructora;
        Banco_Vinculado = banco_Vinculado;
        Ciudad = ciudad;
    }

    public Integer getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(Integer id_Compra) {
        Id_Compra = id_Compra;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    
    
    
}
