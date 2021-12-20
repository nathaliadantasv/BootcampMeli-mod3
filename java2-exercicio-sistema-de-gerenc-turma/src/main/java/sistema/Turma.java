package sistema;

import java.util.List;

public class Turma {

    private String serie;
    private String codigoIdenticador;
    private List<Disciplina> disciplinas;
    private List<Estudante> estudantes;

    public Turma(String serie, String codigoIdenticador, List<Disciplina> disciplinas, List<Estudante> estudantes) {
        this.serie = serie;
        this.codigoIdenticador = codigoIdenticador;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public Turma(){

    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setCodigoIdenticador(String codigoIdenticador){
        this.codigoIdenticador = codigoIdenticador;
    }

    public String getCodigoIdenticador() {
        return codigoIdenticador;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void showTurma(){
        System.out.println(getSerie() + " série - " + getCodigoIdenticador());
        System.out.print("Alunos: ");
        for( Estudante e: estudantes){
            System.out.print(e.getNome() + "; ");
        }
        System.out.println("");
        System.out.print("Disciplinas: " );
        for( Disciplina d: disciplinas){
            System.out.print(d.getNome() + "; ");
        }
    }
}
