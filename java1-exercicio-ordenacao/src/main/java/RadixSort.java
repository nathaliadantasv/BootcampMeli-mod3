import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {


    public static int[] radixSort(int iArr[]) {

        int maior = iArr[0];
        int tamanho = Integer.toString(iArr[0]).length();
        String iArrConv[] = new String[iArr.length];

        for (int j = 0; j < iArr.length; j++) {
            if (iArr[j] > maior) {
                maior = iArr[j];
                tamanho = Integer.toString(iArr[j]).length();
            }

            iArrConv[j] = Integer.toString(iArr[j]);
        }

        for (int j = 0; j < iArrConv.length; j++) {

            while (iArrConv[j].length() < tamanho) {
                iArrConv[j] = "0" + iArrConv[j];
            }
        }

        List<String>[] resultado = ordenaArray(iArrConv, tamanho);

        List<String> aux = new ArrayList<>();


        for (int j = 0; j < resultado.length; j++){
           List<String> l = resultado[j];
           for (int i = 0; i < l.size(); i++){
               aux.add(l.get(i));
           }
        }

        //System.out.println(aux.toString());

        int[] teste = new int[aux.size()];
        for(int i=0; i< aux.size(); i++){
            teste[i] = Integer.parseInt(aux.get(i));
        }

        return teste;

    }

    public static List<String>[] ordenaArray(String[] iArrConv, int tamanho){

        List<String>[] res = new List[10];
        ArrayList<String> aux = new ArrayList<String>();

        List<String> lista0 = new ArrayList<String>();
        List<String> lista1 = new ArrayList<String>();
        List<String> lista2 = new ArrayList<String>();
        List<String> lista3 = new ArrayList<String>();
        List<String> lista4 = new ArrayList<String>();
        List<String> lista5 = new ArrayList<String>();
        List<String> lista6 = new ArrayList<String>();
        List<String> lista7 = new ArrayList<String>();
        List<String> lista8 = new ArrayList<String>();
        List<String> lista9 = new ArrayList<String>();

        for (int i = 1; i <= tamanho; i++) {
           lista0.clear();
           lista1.clear();
           lista2.clear();
           lista3.clear();
           lista4.clear();
           lista5.clear();
           lista6.clear();
           lista7.clear();
           lista8.clear();
           lista9.clear();

           if(i == 1){
               aux = new ArrayList<>(Arrays.asList(iArrConv));
           }

            for (String str : aux) {
                char digito = str.charAt(str.length() - i);
                switch (digito) {
                    case '0':
                        lista0.add(str);
                        break;
                    case '1':
                        lista1.add(str);
                        break;
                    case '2':
                        lista2.add(str);
                        break;
                    case '3':
                        lista3.add(str);
                        break;
                    case '4':
                        lista4.add(str);
                        break;
                    case '5':
                        lista5.add(str);
                        break;
                    case '6':
                        lista6.add(str);
                        break;
                    case '7':
                        lista7.add(str);
                        break;
                    case '8':
                        lista8.add(str);
                        break;
                    case '9':
                        lista9.add(str);
                        break;
                }
            }

            aux.clear();

            if(lista0.size() > 0){
                for(String s: lista0){
                    aux.add(s);
                }
            }
            if(lista1.size() > 0){
                for(String s: lista1){
                    aux.add(s);
                }
            }
            if(lista2.size() > 0){
                for(String s: lista2){
                    aux.add(s);
                }
            }
            if(lista3.size() > 0){
                for(String s: lista3){
                    aux.add(s);
                }
            }
            if(lista4.size() > 0){
                for(String s: lista4){
                    aux.add(s);
                }
            }
            if(lista5.size() > 0){
                for(String s: lista5){
                    aux.add(s);
                }
            }
            if(lista6.size() > 0){
                for(String s: lista6){
                    aux.add(s);
                }
            }
            if(lista7.size() > 0){
                for(String s: lista7){
                    aux.add(s);
                }
            }
            if(lista8.size() > 0){
                for(String s: lista8){
                    aux.add(s);
                }
            }
            if(lista9.size() > 0){
                for(String s: lista9){
                    aux.add(s);
                }
            }
        }

        res[0]=(lista0);
        res[1]=(lista1);
        res[2]=(lista2);
        res[3]=(lista3);
        res[4]=(lista4);
        res[5]=(lista5);
        res[6]=(lista6);
        res[7]=(lista7);
        res[8]=(lista8);
        res[9]=(lista9);

        return res;
    }


    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        iArr = radixSort(iArr);

        for (int i : iArr) {
            System.out.print(i + " ");
        }
    }
}