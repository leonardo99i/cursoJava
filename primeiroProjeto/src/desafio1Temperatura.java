public class desafio1Temperatura {
    public static void main(String[] args) {
        //Entrada da variavel em celcius
        double tempCelsius = 25.2;
        //Entrada do caluclo para converção
        double converteFahrenheit = (tempCelsius * 1.8) + 32;

        //Impressão do resultado
        System.out.println("A temperatura " + tempCelsius + "°C convertida para Fahrenheit é " + converteFahrenheit);


        //Temperatura em Fahrenheit inteira

        int fahrenheitInteira = (int) converteFahrenheit;
        System.out.println(fahrenheitInteira);;

        
    }
    
}
