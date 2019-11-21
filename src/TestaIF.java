public class TestaIF {
    public static void main(String[] args){
        AssistenteAdministrativo A1 = new AssistenteAdministrativo("Marcos","RH");
        Servidor S1 = new Servidor("Jorge");
        ProfessorEfetivo P2 = new ProfessorEfetivo(100,"Jose",S1);
        ProfessorSubstituto P1 = new ProfessorSubstituto("10/10/2019","Carlos",S1);
        ProfessorTemporario P3 = new ProfessorTemporario(500,"Bruno",S1);
      
    }
}