public class PlanoOperadora {
  
    public static void main(String[] args) {
        /*
         * Nao e usado o Breake pois o Switch reaproveita o abaixo se necessario
         */
        String sigla = "M";

        switch (sigla) {
            case "T":{
                System.out.println("5Gb Youtube!");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram de graca!");
            }
            case "B":{
                System.out.println("100 Minutos de licacao!");
                break;
            }
            default:{
            System.out.println("INDEFINIDO");
            }
        }
    }
}
