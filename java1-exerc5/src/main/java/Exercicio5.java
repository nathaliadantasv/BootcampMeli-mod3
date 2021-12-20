import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor n para definir os n primeiros: ");
        int n = input.nextInt();

        System.out.println("Digite um valor m para definir quantidade de dígitos iguais: ");
        int m = input.nextInt();

        System.out.println("Digite um valor d para definir o valor do dígito: ");
        int d = input.nextInt();

        int contador = 0;

        for (int i = 0; i < n; ) {

            int aux = Integer.toString(contador).length() - Integer.toString(contador).replaceAll(Integer.toString(d), "").length();

            if (aux == m) {
                System.out.println(contador);
                i++;
            }
            contador++;
        }
    }
}
