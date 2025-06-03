package Questao1;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro", "1");
        Aluno aluno2 = new Aluno("Alice", "2");
        Aluno aluno3 = new Aluno("Carlos", "3");

        Turma minhaTurma = new Turma(30);
        minhaTurma.adicionarAluno(aluno1);
        minhaTurma.adicionarAluno(aluno2);
        minhaTurma.adicionarAluno(aluno3);

        aluno1.cadastrarNota(8.5);
        aluno1.cadastrarNota(6.0);
        aluno1.cadastrarNota(7.1);
        aluno1.cadastrarNota(9.0);

        aluno2.cadastrarNota(9.5);
        aluno2.cadastrarNota(7.8);
        aluno2.cadastrarNota(7.0);
        aluno2.cadastrarNota(8.2);

        aluno3.cadastrarNota(5.0);
        aluno3.cadastrarNota(6.0);
        aluno3.cadastrarNota(4.5);
        aluno3.cadastrarNota(6.2);

        minhaTurma.listarAprovados();
        minhaTurma.listarReprovados();

    }
}