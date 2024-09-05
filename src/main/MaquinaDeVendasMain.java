package main;

import model.MaquinaDeVendas;

public class MaquinaDeVendasMain {

    public static void main(String[] args) {
        MaquinaDeVendas maquina = new MaquinaDeVendas();
        maquina.cadastrarProduto("Refrigerante", 3.0);
        maquina.cadastrarProduto("Chips", 2.5);

        maquina.exibirEstoque();

        maquina.inserirDinheiro(5.0);
        if (maquina.selecionarProduto("Refrigerante")) {
            System.out.println("Produto selecionado. Troco: " + maquina.retornarTroco());
        } else {
            System.out.println("Produto não disponível.");
        }
    }
}