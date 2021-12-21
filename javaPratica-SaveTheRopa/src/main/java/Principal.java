import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){

        List<Vestuario> listaDeRoupas1= new ArrayList<Vestuario>();

        Vestuario vestuario1 = new Vestuario("Farm", "Vestido Longo");
        Vestuario vestuario2 = new Vestuario("Dress To", "Calça Flare");
        Vestuario vestuario3 = new Vestuario("Open", "Macacão Longo");

        listaDeRoupas1.add(vestuario1);
        listaDeRoupas1.add(vestuario2);
        listaDeRoupas1.add(vestuario3);

        List<Vestuario> listaDeRoupas2= new ArrayList<Vestuario>();

        Vestuario vestuario4 = new Vestuario("Reserva", "Camisa Basic");
        Vestuario vestuario5 = new Vestuario("Armadillo", "Bermuda Cargo");
        Vestuario vestuario6 = new Vestuario("Lacoste", "Camisa Polo");

        listaDeRoupas2.add(vestuario4);
        listaDeRoupas2.add(vestuario5);
        listaDeRoupas2.add(vestuario6);

        GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarVestuario(listaDeRoupas1);
        guardaRoupa.guardarVestuario(listaDeRoupas2);

        guardaRoupa.mostrarVestuario();

        System.out.println(guardaRoupa.devolveVestuario(2));
    }
}
