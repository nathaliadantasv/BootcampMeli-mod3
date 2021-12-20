import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        System.out.println("Digite um valor m: ");
        Scanner input1 = new Scanner(System.in);
        int m = input1.nextInt();

        for (int i = 1; i <= m; i++) {
            int restoDiv1 = i % 1;
            int restoDiv2 = i % 2;
            int restoDivN = i % i;

            if ((restoDiv1 == 0 & restoDiv2 != 0 & restoDivN == 0 & i != 2) || (i == 2)) {
                System.out.println(i);
            }
        }
    }
}
