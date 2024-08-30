//1. Pessoa
//Crie uma classe que armazene nome, idade e profissão.
//Implemente métodos para calcular a idade em anos bissextos e exibir informações.

package model;

//inicializar classe
public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    //criar construtores
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    //criar metodos
    public int calcularIdadeEmAnosBissextos() {
        int anosBissextos = 0;
        for (int i = 1; i <= idade; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                anosBissextos++;
            }
        }
        return anosBissextos;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
    }
}
