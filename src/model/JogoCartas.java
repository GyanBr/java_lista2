package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoCartas {
    private List<String> cartas;
    private List<String> jogadores;

    public JogoCartas() {
        cartas = new ArrayList<>();
        jogadores = new ArrayList<>();
        inicializarBaralho();
    }

    private void inicializarBaralho() {
        String[] naipes = {"Espadas", "Ouros", "Copas", "Paus"};
        String[] valores = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        for (String naipe : naipes) {
            for (String valor : valores) {
                cartas.add(valor + " de " + naipe);
            }
        }
    }

    // Embaralhar cartas
    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    // Distribuir cartas
    public List<String> distribuirCartas(int quantidade) {
        List<String> cartasDistribuidas = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            if (!cartas.isEmpty()) {
                cartasDistribuidas.add(cartas.remove(0));
            }
        }
        return cartasDistribuidas;
    }

    // Adicionar jogador
    public void adicionarJogador(String nome) {
        jogadores.add(nome);
    }
}
