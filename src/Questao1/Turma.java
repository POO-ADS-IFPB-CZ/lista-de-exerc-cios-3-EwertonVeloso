package Questao1;

public class Turma {
    private Aluno[] alunos;
    private int quantidadeDeAlunos;


    public Turma(int tamanhoTurma){
        this.alunos = new Aluno[tamanhoTurma];
        this.quantidadeDeAlunos = 0;
    }

    public boolean adicionarAluno(Aluno aluno){
        if(quantidadeDeAlunos < alunos.length){
            alunos[quantidadeDeAlunos] = aluno;
            quantidadeDeAlunos++;
            return true;
        }
        return false;
    }

    public void listarAprovados() {
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < quantidadeDeAlunos; i++) {
            if (alunos[i].estaAprovado()) {
                System.out.println("Aluno: "+ alunos[i].getNome() + " Matrícula: " + alunos[i].getMatricula());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("Alunos reprovados:");
        for (int i = 0; i < quantidadeDeAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.println("Aluno: "+ alunos[i].getNome() + " Matrícula: " + alunos[i].getMatricula());
            }
        }
    }









}
