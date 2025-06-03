package Questao2;

public class App {
    public static void main(String[] args){
        MegaSena meuJogo = new MegaSena();

        meuJogo.adicionaNumero(5);
        meuJogo.adicionaNumero(60);
        meuJogo.adicionaNumero(1);
        meuJogo.adicionaNumero(34);
        meuJogo.adicionaNumero(43);
        meuJogo.adicionaNumero(32);

        meuJogo.exibeOrdenados();
    }
}
