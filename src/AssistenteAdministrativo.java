public class AssistenteAdministrativo extends Servidor{
    private String setor;

    
     
    public AssistenteAdministrativo( String nome,String setor) {
        super(nome);
        this.setor = setor;
    }
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
