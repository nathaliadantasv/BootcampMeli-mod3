import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("Nathalia", "12312312312");
        Pessoa pessoa2 = new Pessoa("Gabriel", "32132132132");
        Pessoa pessoa3 = new Pessoa("Aderson", "12341234123");
        Pessoa pessoa4 = new Pessoa("Matheus", "43214321432");
        Pessoa pessoa5 = new Pessoa("Rodrigo", "54321543215");
        Pessoa pessoa6 = new Pessoa("Luan", "65432165432");

        Pessoa arrayPessoas[] = {pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6};

        SortUtil.sort(arrayPessoas);

        for(int i=0; i < arrayPessoas.length; i++) {
            System.out.println(arrayPessoas[i].getNome());
        }

        System.out.println("----------------------------");

        Celular celular1 = new Celular("999999999", "Nathalia");
        Celular celular2 = new Celular("988889999", "Gabriel");
        Celular celular3 = new Celular("987779999", "Aderson");

        Celular arrayCelulares[] = {celular1, celular2, celular3};

        SortUtil.sort(arrayCelulares);

        for(int i=0; i < arrayCelulares.length; i++) {
            System.out.println(arrayCelulares[i].getProprietario());
        }
    }
}
