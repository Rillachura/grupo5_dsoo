package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Alumno hereda de Persona. Mantiene su carrera y cursos matriculados.
 */
public class Alumno extends Persona {

    private Carrera carrera;
    private List<Curso> cursosMatriculados;
    private List<Nota> historial;

    public Alumno(String codigoAlumno, String nombre, Carrera carrera) {
        super(codigoAlumno, nombre);
        this.carrera = carrera;
        this.cursosMatriculados = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    /**
     * Matricula un curso (sin persistencia externa). 
     * Realiza una verificación básica: si ya está matriculado, no lo duplica.
     */
    public boolean matricularCurso(Curso curso) {
        if (curso == null) return false;
        // evitar duplicados
        for (Curso c : cursosMatriculados) {
            if (c.getCodigo().equalsIgnoreCase(curso.getCodigo())) {
                return false; // ya matriculado
            }
        }
        // Validar prerequisitos (si hay)
        for (Curso pre : curso.getPrerequisitos()) {
            boolean cumple = false;
            for (Nota n : historial) {
                if (n.getCurso().getCodigo().equals(pre.getCodigo()) && n.getValor() >= 10.5) {
                    cumple = true;
                    break;
                }
            }
            if (!cumple) {
                // no cumple prerequisito
                return false;
            }
        }
        cursosMatriculados.add(curso);
        return true;
    }

    public void agregarNota(Nota nota) {
        if (nota != null) historial.add(nota);
    }

    public String getCodigoAlumno() { return getId(); }
    public Carrera getCarrera() { return carrera; }
    public List<Curso> getCursosMatriculados() { return cursosMatriculados; }
    public List<Nota> getHistorial() { return historial; }
}
