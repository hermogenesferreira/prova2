public class ProfessorEfetivo extends Professor{
    private int tempoServico;

    public ProfessorEfetivo(int tempoServico, String nome, Servidor coordenador) {
        super(nome, coordenador);
        this.tempoServico = tempoServico;
    }
    

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
}
