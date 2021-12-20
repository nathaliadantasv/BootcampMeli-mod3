import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        System.out.println("Exercício 1");

        System.out.println("Digite um valor n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int count = 0;
        int valor = 1;

        while (count != n){
            if (valor % 2 == 0){
                System.out.println(valor);
                count++;
            }
            valor++;
        }

    }
}


