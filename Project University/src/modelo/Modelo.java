package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase auxiliar que actúa como "repositorio" en memoria.
 * Sirve para que el controlador obtenga listas y realice búsquedas.
 */
public class Modelo {

    private List<Alumno> alumnos;
    private List<Carrera> carreras;
    private List<Curso> cursos;
    private List<Docente> docentes;

    public Modelo() {
        this.alumnos = new ArrayList<>();
        this.carreras = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.docentes = new ArrayList<>();

        // Datos de ejemplo (seed)
        seedDatosDemo();
    }

    // --- CRUD básico (solo lo necesario para el controlador) ---
    public void agregarAlumno(Alumno a) {
        if (a == null) return;
        alumnos.add(a);
    }

    public List<Alumno> getAlumnos() { return alumnos; }

    public void agregarCarrera(Carrera c) {
        if (c == null) return;
        carreras.add(c);
    }

    public List<Carrera> getCarreras() { return carreras; }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        cursos.add(c);
    }

    public List<Curso> getCursos() { return cursos; }

    public void agregarDocente(Docente d) {
        if (d == null) return;
        docentes.add(d);
    }

    public List<Docente> getDocentes() { return docentes; }

    // --- Métodos de búsqueda útiles para el controlador ---
    public Carrera buscarCarrera(String nombreCarrera) {
        if (nombreCarrera == null) return null;
        for (Carrera c : carreras) {
            if (c.getNombre().equalsIgnoreCase(nombreCarrera)) return c;
        }
        return null;
    }

    public Alumno buscarAlumno(String codigo) {
        if (codigo == null) return null;
        for (Alumno a : alumnos) {
            if (a.getCodigoAlumno().equalsIgnoreCase(codigo)) return a;
        }
        return null;
    }

    public Curso buscarCurso(String codigo) {
        if (codigo == null) return null;
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    // --- Datos de ejemplo para que al ejecutar haya contenido ---
    private void seedDatosDemo() {
        // Carreras
        Carrera ing = new Carrera("Ingeniería de Sistemas", 5);
        Carrera emp = new Carrera("Administración", 5);
        agregarCarrera(ing);
        agregarCarrera(emp);

        // Cursos
        Curso p1 = new Curso("CS101", "Programación I", 4);
        Curso p2 = new Curso("CS102", "Programación II", 4);
        p2.agregarPreRequisito(p1);

        agregarCurso(p1);
        agregarCurso(p2);

        ing.agregarCurso(p1);
        ing.agregarCurso(p2);

        // Alumnos demo
        Alumno a1 = new Alumno("A001", "Mateo López", ing);
        Alumno a2 = new Alumno("A002", "Ana Torres", emp);

        agregarAlumno(a1);
        agregarAlumno(a2);

        // Docente demo
        Docente d = new Docente("D001", "Dr. Pérez", "Ciencias de la Computación");
        agregarDocente(d);
    }
}
