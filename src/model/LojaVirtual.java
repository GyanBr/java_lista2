package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LojaVirtual {
    private List<Produto> produtos;
    private Map<Produto, Integer> carrinho;
    private double desconto;

    public LojaVirtual() {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>();
        desconto = 0.0;
    }

    // Adicionar produto à loja
    public void cadastrarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));
    }

    // Adicionar produto ao carrinho
    public void adicionarAoCarrinho(String nome, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                carrinho.put(produto, quantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Aplicar desconto
    public void aplicarDesconto(double percentual) {
        desconto = percentual;
    }

    // Calcular valor total
    public double calcularTotal() {
        double total = 0.0;
        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            total += produto.getPreco() * quantidade;
        }
        return total * (1 - desconto / 100);
    }

    // Classe interna Produto
    private class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }
}