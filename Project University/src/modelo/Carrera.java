package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Carrera que contiene una lista de cursos.
 */
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
        if (curso != null) cursos.add(curso);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo == null) return null;
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public String getNombre() { return nombre; }
    public int getDuracion() { return duracion; }
    public List<Curso> getCursos() { return cursos; }
}
