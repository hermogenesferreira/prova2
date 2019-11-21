
public class Professor extends Servidor{
    private Servidor coordenador;

    public Professor(String nome,Servidor coordenador) {
        super(nome);
        this.coordenador = coordenador;
    }
    

    public Servidor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Servidor coordenador) {
        this.coordenador = coordenador;
    }
}
