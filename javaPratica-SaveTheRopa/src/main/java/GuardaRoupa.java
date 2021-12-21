import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Map<Integer, List<Vestuario>> dicionario = new HashMap<>();
    private static Integer contador = 0;

    public Integer guardarVestuario(List<Vestuario> listaDeVestuario){
        contador++;
        dicionario.put(contador, listaDeVestuario);
        return contador;
    }

    public void mostrarVestuario(){
        for(Integer i=1; i<=dicionario.size(); i++){
            List<Vestuario> lista = dicionario.get(i);
            System.out.println("Identificador " + i);
            for (Vestuario v : lista){
                System.out.println(v.getModelo() + " - " + v.getMarca());
            }
            System.out.println("---------");
        }
    }

    public List<Vestuario> devolveVestuario(Integer id){
        List<Vestuario> lista = dicionario.get(id);
        return lista;
    }
}
