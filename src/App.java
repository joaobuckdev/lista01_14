import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double peso;
        double multa;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o peso de peixes: ");
        peso = teclado.nextDouble();
        teclado.close();

        multa = peso-50;

        if (peso > 50) {
            System.out.println("O peso de peixes excedeu o regulamento de pesca do estado de SP, a multa a ser aplicada será de: R$" + multa*4);
        }
        
        else {
            System.out.println("O peso de peixes não excedeu o regulamento de pesca o estado de SP");
        }



    }
}
