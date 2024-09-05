package main;

import model.Biblioteca;

public class BibliotecaMain {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro("1984");
        biblioteca.cadastrarLivro("Admirável Mundo Novo");

        System.out.println("Disponível '1984': " + biblioteca.verificarDisponibilidade("1984"));
        biblioteca.emprestarLivro("1984");
        System.out.println("Disponível '1984' após emprestar: " + biblioteca.verificarDisponibilidade("1984"));
        biblioteca.devolverLivro("1984");
        System.out.println("Disponível '1984' após devolver: " + biblioteca.verificarDisponibilidade("1984"));
    }
}
