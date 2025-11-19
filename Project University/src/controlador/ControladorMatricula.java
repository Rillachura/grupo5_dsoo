package controlador;

import modelo.*;

import java.util.List;

public class ControladorMatricula {

    private Modelo modelo;
    private Secretaria secretaria;

    public ControladorMatricula(Modelo modelo) {
        this.modelo = modelo;
        this.secretaria = new Secretaria("S001", "María Pérez"); // Puede ser inyectado también
    }

    // Obtener lista de alumnos para la GUI
    public List<Alumno> obtenerAlumnos() {
        return modelo.getAlumnos();
    }

    // Obtener lista de cursos
    public List<Curso> obtenerCursos() {
        return modelo.getCursos();
    }

    // Registrar matrícula de un alumno en un curso o lista de cursos
    public boolean registrarMatricula(Alumno alumno, List<Curso> cursos) {
        if (alumno == null || cursos == null || cursos.isEmpty()) return false;

        Matricula matricula = new Matricula("2025-I", null);
        for (Curso c : cursos) {
            matricula.incluirCurso(c);
        }
        secretaria.registrarMatricula(alumno, matricula);
        return true;
    }

    // Registrar convalidación
    public boolean registrarConvalidacion(Alumno alumno, Curso curso, double nota, String entidad) {
        if (alumno == null || curso == null || entidad == null || entidad.isEmpty()) return false;

        Convalidacion con = new Convalidacion(curso, nota, entidad);
        secretaria.registrarConvalidacion(alumno, con);
        return true;
    }

    // Obtener historial de un alumno (notas y convalidaciones)
    public List<Nota> obtenerHistorial(Alumno alumno) {
        if (alumno == null) return null;
        return alumno.getHistorial();
    }
}
