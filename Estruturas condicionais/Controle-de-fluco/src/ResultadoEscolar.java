public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        int nota = 6;

        if(nota >= 7){
            System.err.println("Aluno Aprovado!");
        }
        else if(nota >= 5 && nota <= 7){
            System.err.println("Recuperaçao!");
        }

        else{
            System.out.println("Aluno Reprovado");
        }
    }
}
