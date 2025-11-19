package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String ciudad;
    private String direccion;
    private List<Carrera> carreras;

    public Sucursal(String ciudad, String direccion) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.carreras = new ArrayList<>();
    }

    public void registrarCarrera(Carrera carrera) {
        if (carrera != null) carreras.add(carrera);
    }

    public String getCiudad() { return ciudad; }
    public String getDireccion() { return direccion; }
    public List<Carrera> getCarreras() { return carreras; }
}
