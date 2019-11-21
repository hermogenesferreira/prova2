public class ProfessorTemporario extends Professor{
    private int horasTrabalhadas;

    public ProfessorTemporario(int horasTrabalhadas, String nome, Servidor coordenador) {
        super(nome, coordenador);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
