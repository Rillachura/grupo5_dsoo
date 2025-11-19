
public class Alumno {
    private String codigoAlumno;
    private String nombre;
    private Carrera carrera;

    public Alumno(String codigoAlumno, String nombre, Carrera carrera) {
        this.codigoAlumno = codigoAlumno;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public void matricularCurso(Curso curso) {
        System.out.println(nombre + " se ha matriculado en el curso: " + curso.getNombre());
    }

    public String getCodigoAlumno() { return codigoAlumno; }
    public String getNombre() { return nombre; }
    public Carrera getCarrera() { return carrera; }
}