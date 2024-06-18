public class ExemploForArray {
    
    public static void main(String[] args) {
        
        String alunos [] = {"Fernando", "Felipe", "Samara", "Jose"};
        /*
         * for (int x = 0; x < alunos.length; x++) {
         *  System.out.println("Aluno " + x + " : " + alunos[x]);            
         * }
         * 
         */
        
         for (String alunoNew : alunos){
            System.err.println("O nome do aluno é : " + alunoNew);
         }


    }
}
