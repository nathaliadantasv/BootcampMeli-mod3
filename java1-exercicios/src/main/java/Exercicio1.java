import java.util.Arrays;
import java.util.Collections;

public class Exercicio1 {

    public static void main(String[] args) {

        Integer[] array =  {52, 10, 85, 1354, 01, 13, 62, 30, 12, 127};

        Arrays.sort(array);
        System.out.println("ordem crescente: "+ Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("ordem decrescente: "+ Arrays.toString(array));
    }
}
