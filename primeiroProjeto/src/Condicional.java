public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluso = false;
        double notaFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoLancamento >= 2022){
            System.out.println("Lançamento!!");
        }else{
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if(incluso || tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
        
    }
    
}
