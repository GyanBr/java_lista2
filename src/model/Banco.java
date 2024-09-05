package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }


    public void cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado: " + cliente);
    }


    public void abrirConta(String cpf) {
        Cliente cliente = encontrarCliente(cpf);
        if (cliente != null) {
            Conta conta = new Conta(cliente);
            contas.add(conta);
            System.out.println("Conta aberta para: " + cliente);
        }
    }


    private Cliente encontrarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }


    private Conta encontrarConta(String cpf) {
        for (Conta conta : contas) {
            if (conta.getCliente().getCpf().equals(cpf)) {
                return conta;
            }
        }
        return null;
    }


    public void realizarDeposito(String cpf, double valor) {
        Conta conta = encontrarConta(cpf);
        if (conta != null) {
            conta.depositar(valor);
        }
    }

    public void realizarSaque(String cpf, double valor) {
        Conta conta = encontrarConta(cpf);
        if (conta != null) {
            conta.sacar(valor);
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

