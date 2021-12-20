import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println("Exercício 2");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor n (quantidade de múltiplos desejados): ");

        int n = input.nextInt();

        System.out.println("Digite um valor m (o múltiplo desejado): ");
        int m = input.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(m * i);
        }
    }
}
