package modelo;

/**
 * Nota simple que enlaza curso y valor.
 * Campos protegidos para permitir subclases (Convalidacion) acceso si lo requieren.
 */
public class Nota {
    protected Curso curso;
    protected double valor;

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
