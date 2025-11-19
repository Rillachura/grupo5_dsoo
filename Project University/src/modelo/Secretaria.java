package modelo;

/**
 * Secretaria extiende Persona y maneja funciones administrativas.
 */
public class Secretaria extends Persona {

    public Secretaria(String id, String nombre) {
        super(id, nombre);
    }

    public void registrarMatricula(Alumno alumno, Matricula matricula) {
        if (alumno == null || matricula == null) return;
        // registrar cursos en el alumno (simulación de registro)
        for (Curso c : matricula.getCursos()) {
           alumno.matricularCurso(c);
            // opción: guardar un registro, lanzar excepción, o notificar
        }
        System.out.println("Secretaria " + getNombre() + " registró la matrícula de "
                + alumno.getNombre() + " en el periodo " + matricula.getPeriodo());
    }

    public void registrarConvalidacion(Alumno alumno, Convalidacion convalidacion) {
        if (alumno == null || convalidacion == null) return;
        // agregar la nota convalidada al historial del alumno
        alumno.agregarNota(convalidacion);
        System.out.println("Secretaria " + getNombre() + " registró una convalidación del curso "
                + convalidacion.getCurso().getNombre() + " desde " + convalidacion.getEntidadExterna());
    }
}
