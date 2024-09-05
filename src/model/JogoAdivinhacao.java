package model;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    private int numeroAleatorio;

    public JogoAdivinhacao() {
        gerarNumeroAleatorio();
    }

    // Gerar número aleatório entre 1 e 100
    private void gerarNumeroAleatorio() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1;
    }

    // Permitir palpites do jogador
    public void adivinharNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivinhe o número entre 1 e 100:");

        while (true) {
            int palpite = scanner.nextInt();
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            }
        }
    }
}
