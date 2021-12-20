import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        System.out.println("Digite um valor: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int restoDiv1 = n % 1;
        int restoDiv2 = n % 2;
        int restoDivN = n % n;

        if ((restoDiv1 == 0 & restoDiv2 != 0 & restoDivN == 0 & n != 2) || (n == 2)) {
            System.out.println("É um número primo.");
        } else {
            System.out.println("Não é um primo.");
        }
    }
}
