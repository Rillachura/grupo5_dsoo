package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Docente extiende Persona. Puede tener departamento y cursos a cargo.
 */
public class Docente extends Persona {

    private String departamento;
    private List<Curso> cursosAsignados;

    public Docente(String id, String nombre, String departamento) {
        super(id, nombre);
        this.departamento = departamento;
        this.cursosAsignados = new ArrayList<>();
    }

    public void asignarCurso(Curso curso) {
        if (curso != null && !cursosAsignados.contains(curso)) {
            cursosAsignados.add(curso);
        }
    }

    public String getDepartamento() { return departamento; }
    public List<Curso> getCursosAsignados() { return cursosAsignados; }
}
