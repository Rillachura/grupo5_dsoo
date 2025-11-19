package modelo;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private String sedePrincipal;
    private List<Sucursal> sucursales;

    public Universidad(String nombre, String sedePrincipal) {
        this.nombre = nombre;
        this.sedePrincipal = sedePrincipal;
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        if (sucursal != null) sucursales.add(sucursal);
    }

    public String getNombre() { return nombre; }
    public String getSedePrincipal() { return sedePrincipal; }
    public List<Sucursal> getSucursales() { return sucursales; }
}
