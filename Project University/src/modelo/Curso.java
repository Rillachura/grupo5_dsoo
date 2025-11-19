package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Curso con código, nombre, créditos y lista de prerequisitos.
 */
public class Curso {
    private String codigo;
    private String nombre;
    private int creditos;
    private List<Curso> prerequisitos;

    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.prerequisitos = new ArrayList<>();
    }

    public void agregarPreRequisito(Curso curso) {
        if (curso != null && !prerequisitos.contains(curso)) {
            prerequisitos.add(curso);
        }
    }

    /**
     * Verifica que la lista de cursos aprobados contenga todos los prerequisitos.
     */
    public boolean validarPrerequisitos(List<Nota> notasAlumno) {
        for (Curso pre : prerequisitos) {
            boolean encontrado = false;
            if (notasAlumno != null) {
                for (Nota n : notasAlumno) {
                    if (n.getCurso().getCodigo().equals(pre.getCodigo()) && n.getValor() >= 10.5) {
                        encontrado = true;
                        break;
                    }
                }
            }
            if (!encontrado) return false;
        }
        return true;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public List<Curso> getPrerequisitos() { return prerequisitos; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
