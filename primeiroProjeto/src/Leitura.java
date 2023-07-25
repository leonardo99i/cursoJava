import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Qual o ano de Lançamento? ");
        int anoLancamento = leitura.nextInt();
        System.out.println(String.format("O seu filme favorito é %s e seu lançamento foi em %d", filmeFavorito, anoLancamento));
        
    }
}
