import java.util.ArrayList;
import java.util.List;

public class SortUtil {

    public static <T> void sort(Precedencia<T> arr[]){

        for(int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                //se arr[i] vem antes de arr[j] retorna int neg
                //se arr[i] vem depois de arr[j] retorna int pos
                if(arr[i].precedeA((T) arr[j]) > 0){
                    Precedencia<T> aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
