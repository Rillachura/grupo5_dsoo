public class Secretaria {
    private String nombre;

    public Secretaria(String nombre) {
        this.nombre = nombre;
    }

    public void registrarMatricula(Alumno alumno, Matricula matricula) {
        System.out.println("Secretaria " + nombre + " registró la matrícula de " + alumno.getNombre() +
                " en el periodo " + matricula.getPeriodo());
    }

    public void registrarConvalidacion(Alumno alumno, Convalidacion convalidacion) {
        System.out.println("Secretaria " + nombre + " registró una convalidación del curso " +
                convalidacion.getCurso().getNombre() + " desde " + convalidacion.getEntidadExterna());
    }

    public String getNombre() { 
        return nombre; 
    }
}