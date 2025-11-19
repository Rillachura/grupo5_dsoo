import java.util.*;

public class Carrera {
    private String nombre;
    private int duracion;
    private List<Curso> cursos;
    
    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public String getNombre() { return nombre; }
    public int getDuracion() { return duracion; }
    public List<Curso> getCursos() { return cursos; }

}
