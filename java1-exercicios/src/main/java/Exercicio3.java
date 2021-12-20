import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        double valorTotal = 0;

        for(int i=1; i<=3; i++){

            Scanner input = new Scanner(System.in);
            System.out.println("Informe o nome do produto: ");
            String nome = input.nextLine();
            nomes.add(nome);
            System.out.println("Informe o preço do produto: ");
            Double preco = input.nextDouble();
            precos.add(preco);
            System.out.println("Informe a quantidade do produto: ");
            int quantidade = input.nextInt();
            quantidades.add(quantidade);
        }

        for(int i=0; i<=2; i++){
            System.out.println("Produto " + i+1);
            System.out.println(nomes.get(i));
            System.out.println(precos.get(i));
            System.out.println(quantidades.get(i));
            System.out.println("");

            valorTotal += precos.get(i) * quantidades.get(i);
        }

        System.out.println("Valor total: R$" + valorTotal);
    }
}
