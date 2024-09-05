package main;

import model.LojaVirtual;

public class LojaMain {

    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();
        loja.cadastrarProduto("Produto A", 100.0);
        loja.cadastrarProduto("Produto B", 200.0);

        loja.adicionarAoCarrinho("Produto A", 2);
        loja.adicionarAoCarrinho("Produto B", 1);

        loja.aplicarDesconto(10.0); // 10% de desconto
        System.out.println("Total da compra: " + loja.calcularTotal());
    }
}

