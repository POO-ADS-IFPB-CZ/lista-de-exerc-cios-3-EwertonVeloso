package Questao1;

public class Aluno {
    private String nome;
    private String matricula;
    private double notas[];
    private int quantidadeDeNotas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
        this.quantidadeDeNotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean cadastrarNota(double nota){
        if(quantidadeDeNotas < 4){
            notas[quantidadeDeNotas] = nota;
            quantidadeDeNotas++;
            return true;
        }
        return false;
    }

    public double calcularMedia(){
        if(quantidadeDeNotas == 0){
            return 0;
        }

        double soma = 0;
        for(int i = 0; i < quantidadeDeNotas; i++){
            soma += notas[i];
        }

        return soma/quantidadeDeNotas;
    }

    public boolean estaAprovado(){
        return calcularMedia() >= 7;
    }


}
