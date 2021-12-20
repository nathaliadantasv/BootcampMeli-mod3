import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

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

        String arrayBD[][] = ordenaArray(iArrConv, tamanho, 1);

        String[] arrayStr = new String[iArrConv.length];

        for(String []strArray : arrayBD){

            for(String str : strArray){
                arrayStr[arrayStr.length] = str;
            }
        }

        arrayBD = ordenaArray(iArrConv, tamanho, 2);

        int[] arrayInt = new int[iArrConv.length];

        for(String []strArray : arrayBD){

            for(String str : strArray){
                arrayInt[arrayInt.length] = Integer.valueOf(str);
            }
        }

        return  arrayInt;
    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        iArr = radixSort(iArr);

        for (int i : iArr) {
            System.out.print(i + "");
        }
    }


    public static String[][] ordenaArray(String[] iArrConv, int tamanho, int posicao){

        String arrayBD[][] = new String[10][];

        for (String str : iArrConv) {
            switch (str.charAt(tamanho - posicao)) {
                case '0':
                    arrayBD[0][arrayBD[0].length] = str;
                    break;
                case '1':
                    arrayBD[1][arrayBD[0].length] = str;
                    break;
                case '2':
                    arrayBD[2][arrayBD[0].length] = str;
                    break;
                case '3':
                    arrayBD[3][arrayBD[0].length] = str;
                    break;
                case '4':
                    arrayBD[4][arrayBD[0].length] = str;
                    break;
                case '5':
                    arrayBD[5][arrayBD[0].length] = str;
                    break;
                case '6':
                    arrayBD[6][arrayBD[0].length] = str;
                    break;
                case '7':
                    arrayBD[7][arrayBD[0].length] = str;
                    break;
                case '8':
                    arrayBD[8][arrayBD[0].length] = str;
                    break;
                case '9':
                    arrayBD[9][arrayBD[0].length] = str;
                    break;
            }
        }

        return arrayBD;
    }
}