public class Celular implements Precedencia<Celular>{

    private String numero;
    private String proprietario;

    public Celular(String numero, String proprietario) {
        this.numero = numero;
        this.proprietario = proprietario;
    }

    public String getNumero() {
        return numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.proprietario.compareToIgnoreCase(celular.getProprietario());
    }
}
