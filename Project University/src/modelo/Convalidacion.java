package modelo;

/**
 * Convalidacion extiende Nota y añade la entidad externa que certifica la equivalencia.
 */
public class Convalidacion extends Nota {
    private String entidadExterna;

    public Convalidacion(Curso curso, double valor, String entidadExterna) {
        super(curso, valor);
        this.entidadExterna = entidadExterna;
    }

    public String getEntidadExterna() { return entidadExterna; }

    @Override
    public String getEstado() {
        return "Convalidado desde " + entidadExterna;
    }
}
