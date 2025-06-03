package Questao3;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor:");
        n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

