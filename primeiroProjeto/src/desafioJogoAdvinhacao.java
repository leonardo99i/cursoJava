import java.util.Random;
import java.util.Scanner;

public class desafioJogoAdvinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);//Isso ira gerar um numero aleatorio entre 0 e 100
        int tentativas = 0;

        while(tentativas < 8){
            System.out.println("Digite um numero entre 0 a 100: ");
            int numeroDigitado = leitura.nextInt();
            tentativas++;

            if(numeroDigitado == numeroGerado){
                System.out.println("Parabens você acertou!!!");
                break;
            }else if(numeroDigitado < numeroGerado){
                System.out.println("Precisa ser maior");   
            }else{
                System.out.println("Precisa ser menor");
            }
        }

        if(tentativas == 5){
            System.out.println("Você usou todas as suas tentativas de acertar, o numero correto era: " + numeroGerado);
        }
    }
    
}
