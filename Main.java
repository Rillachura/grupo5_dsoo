import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear universidad y sucursal
        Universidad univ = new Universidad("Universidad XYZ", "Lima");
        Sucursal sucArequipa = new Sucursal("Arequipa", "Av. Independencia 123");
        univ.agregarSucursal(sucArequipa);

        // Crear carrera
        Carrera ingSistemas = new Carrera("Ingeniería de Sistemas", 5);
        sucArequipa.registrarCarrera(ingSistemas);

        // Crear cursos
        Curso progra1 = new Curso("CS101", "Programación I", 4);
        Curso progra2 = new Curso("CS102", "Programación II", 4);
        progra2.agregarPreRequisito(progra1);
        ingSistemas.agregarCurso(progra1);
        ingSistemas.agregarCurso(progra2);

        // Crear alumno
        Alumno alumno1 = new Alumno("A001", "Mateo López", ingSistemas);

        // Crear matrícula
        Matricula matricula2025 = new Matricula("2025-I", new Date());
        matricula2025.incluirCurso(progra1);
        matricula2025.verificarCreditos();

        // Secretaria
        Secretaria sec = new Secretaria("María Pérez");
        sec.registrarMatricula(alumno1, matricula2025);

        // Crear convalidación
        Convalidacion conv = new Convalidacion(progra2, 18, "Universidad Nacional del Sur");
        sec.registrarConvalidacion(alumno1, conv);

        // Mostrar nota y convalidación
        Nota nota = new Nota(progra1, 15);
        System.out.println("Nota: " + nota.getValor() + " - " + nota.getEstado());
        System.out.println("Convalidación: " + conv.getEstado());
    }
}
