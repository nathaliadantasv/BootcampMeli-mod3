package sistema;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Estudante est1 = new Estudante("João Silva", "01/01/1991", "00001", "1º");
        Estudante est2 = new Estudante("Maria Souza", "02/02/1992", "00002", "1º");

        Disciplina disc1T1 = new Disciplina("Java 1", 60);
        Disciplina disc2T1 = new Disciplina("POO", 40);
        Disciplina disc3T1 = new Disciplina("Banco de dados", 60);


        List<Estudante> estudantesT1 = new ArrayList<Estudante>();
        estudantesT1.add(est1);
        estudantesT1.add(est2);

        List<Disciplina> disciplinasT1 = new ArrayList<Disciplina>();
        disciplinasT1.add(disc1T1);
        disciplinasT1.add(disc2T1);
        disciplinasT1.add(disc3T1);

        Turma turma1 = new Turma("1º", "1A", disciplinasT1, estudantesT1);

        turma1.showTurma();



    }
}
