package main;

import model.JogoCartas;

public class JogoCartasMain {

    public static void main(String[] args) {
        JogoCartas jogo = new JogoCartas();
        jogo.embaralhar();
        jogo.adicionarJogador("Jogador 1");

        System.out.println("Cartas distribuídas: " + jogo.distribuirCartas(5));
    }
}
