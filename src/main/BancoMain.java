////2. Banco
////Implemente uma classe que represente uma instituição financeira,
////com métodos para cadastrar clientes, abrir contas e realizar operações financeiras.

package main;

import model.Banco;
import model.Cliente;

public class BancoMain {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        // Cadastrar clientes
        banco.cadastrarCliente("João", "12345678900");
        banco.cadastrarCliente("Maria", "09876543211");

        // Abrir contas
        banco.abrirConta("12345678900");
        banco.abrirConta("09876543211");

        // Realizar operações financeiras
        banco.realizarDeposito("12345678900", 500); // Depósito
        banco.realizarSaque("12345678900", 200); // Saque
        banco.realizarDeposito("09876543211", 1000); // Depósito
        banco.realizarSaque("09876543211", 500); // Saque
    }
}


