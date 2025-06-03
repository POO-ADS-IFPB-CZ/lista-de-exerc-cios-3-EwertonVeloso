package Questao2;

import java.util.Arrays;

public class MegaSena {
    private int numeros[];
    private int quantidadeDeNum;

    public MegaSena() {
        this.numeros = new int[6];
        this.quantidadeDeNum = 0;
    }

    public boolean adicionaNumero(int num){
        if(num < 1 || num > 60){
            System.out.println("Numéro inválido. (Informe número entre 1 e 60)");
            return false;
        }
        for(int i=0; i<6; i++){
            if(numeros[i]==num){
                System.out.println("Esse número já existe.");
                return false;
            }
        }
        if(quantidadeDeNum < 6){
            numeros[quantidadeDeNum] = num;
            quantidadeDeNum++;
            return true;
        }
        return false;
    }

    public void exibeOrdenados(){
        Arrays.sort(numeros);
        System.out.println("Números ordenados:");
        for (int i=0; i<6; i++){
            System.out.println(numeros[i]);
        }
    }

}

