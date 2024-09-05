package model;

import java.util.HashMap;
import java.util.Map;

public class MaquinaDeVendas {
    private Map<String, Double> estoque;
    private double saldo;

    public MaquinaDeVendas() {
        estoque = new HashMap<>();
        saldo = 0.0;
    }

    // Cadastrar produto
    public void cadastrarProduto(String nome, double preco) {
        estoque.put(nome, preco);
    }

    // Selecionar produto
    public boolean selecionarProduto(String nome) {
        return estoque.containsKey(nome);
    }

    // Inserir dinheiro
    public void inserirDinheiro(double valor) {
        saldo += valor;
    }

    // Retornar troco
    public double retornarTroco() {
        double troco = saldo;
        saldo = 0.0;
        return troco;
    }

    // Exibir estoque
    public void exibirEstoque() {
        for (Map.Entry<String, Double> entry : estoque.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + ", Preço: " + entry.getValue());
        }
    }
}
