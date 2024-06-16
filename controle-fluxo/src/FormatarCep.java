public class FormatarCep {
    
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("04468040");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException ex) {
            System.out.println("Cep nao corrresponde as regras de negocio");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
