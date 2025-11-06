import java.util.*;

public class Matricula {
    private String periodo;
    private Date fecha;
    private List<Curso> cursos;
    public Matricula(String periodo, Date fecha) {
        this.periodo = periodo;
        this.fecha = fecha;
        this.cursos = new ArrayList<>();
    }

    public void incluirCurso(Curso curso) {
        cursos.add(curso);
    }

    public void verificarCreditos() {
        int total = 0;
        for (int i=0; i<cursos.size(); i++){
            total += cursos.get(i).getCreditos();
        }
        System.out.println("Total de creditos matriculdos: " + total);
    }
    
    public String getPeriodo() { return periodo; }
    public Date getFecha() { return fecha; }
    public List<Curso> getCursos() { return cursos; }
}
