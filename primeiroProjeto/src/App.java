public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");

        String nomeFilme = "Top Gun - Maverick";
        int anoLancamento = 2022;
        //boolean incluso = false;
        //double notaFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) /3;
        String sinopse = "Filme de aventura com galã dos anos 80";
        int classificacao = (int) (media / 2);

        System.out.println("Filme: " + nomeFilme + " " + anoLancamento + " Nota: " + media);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Estrelas: " + classificacao);
    }
}