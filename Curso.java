import java.util.*;

public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;
    private List<Curso> prerequisitos;

    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.prerequisitos = new ArrayList<>();
    }
    
    public void agregarPreRequisito(Curso curso) {
        prerequisitos.add(curso);
    }
    
    public void validarPrerequisitos() {

    }
    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public List<Curso> getPrerequisitos() { return prerequisitos; }
}