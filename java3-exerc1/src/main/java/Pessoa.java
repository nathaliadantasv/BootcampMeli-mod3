public class Pessoa implements Precedencia<Pessoa>{

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.nome.compareToIgnoreCase(pessoa.nome);
    }
}
