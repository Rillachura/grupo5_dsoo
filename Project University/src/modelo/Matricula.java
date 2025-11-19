package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Matricula que agrupa cursos para un periodo.
 */
public class Matricula {
    private String periodo;
    private Date fecha;
    private List<Curso> cursos;

    public Matricula(String periodo, Date fecha) {
        this.periodo = periodo;
        this.fecha = (fecha != null) ? fecha : new Date();
        this.cursos = new ArrayList<>();
    }

    public void incluirCurso(Curso curso) {
        if (curso != null) cursos.add(curso);
    }

    public int verificarCreditos() {
        int total = 0;
        for (Curso c : cursos) total += c.getCreditos();
        System.out.println("Total de créditos matriculados: " + total);
        return total;
    }

    public String getPeriodo() { return periodo; }
    public Date getFecha() { return fecha; }
    public List<Curso> getCursos() { return cursos; }
}
