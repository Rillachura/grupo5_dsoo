package modelo;

/**
 * Superclase base para entidades humanas del sistema.
 * Se mantiene simple, con identificador y nombre.
 */
public abstract class Persona {
    private String id;
    private String nombre;

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }
}
