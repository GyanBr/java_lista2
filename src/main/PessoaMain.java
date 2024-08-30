package main;

// main/PessoaMain.java

import model.Pessoa;

public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 30, "Engenheira");
        pessoa.exibirInformacoes();
        System.out.println("Anos bissextos vividos: " + pessoa.calcularIdadeEmAnosBissextos());
        System.out.println(pessoa.calcularIdadeEmAnosBissextos());
    }
}

