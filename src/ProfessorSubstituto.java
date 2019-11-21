
public class ProfessorSubstituto extends Professor {
    private String dataTerminoContrato;

    public ProfessorSubstituto(String dataTerminoContrato, String nome, Servidor coordenador) {
        super(nome, coordenador);
        this.dataTerminoContrato = dataTerminoContrato;
    }
    

    public String getDataTerminoContrato() {
        return dataTerminoContrato;
    }

    public void setDataTerminoContrato(String dataTerminoContrato) {
        this.dataTerminoContrato = dataTerminoContrato;
    }
    
}
