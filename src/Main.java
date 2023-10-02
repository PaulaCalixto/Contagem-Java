import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            System.out.println("Contagem regressiva a partir de " + numero + ":");
            for (int i = numero; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }
}
