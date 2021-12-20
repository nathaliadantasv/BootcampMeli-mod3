package sistema;

public class Estudante {

    private String nome;
    private String dataNascimento;
    private String numeroMatricula;
    private String serie;


    public Estudante(String nome, String dataNascimento, String numeroMatricula, String serie) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroMatricula = numeroMatricula;
        this.serie = serie;
    }

    public Estudante(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }
}
