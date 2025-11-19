public class Nota {
    private Curso curso;
    private double valor;

    public Nota(Curso curso, double valor) {
        this.curso = curso;
        this.valor = valor;
    }

    public Curso getCurso() { return curso; }
    public double getValor() { return valor; }

    public String getEstado() {
        return valor >= 10.5 ? "Aprobado" : "Desaprobado";
    }
}