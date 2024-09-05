package model;

public class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        saldo -= valor;
        System.out.println("Saque realizado. Saldo atual: " + saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }
}
