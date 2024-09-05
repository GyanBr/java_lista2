package model;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Boolean> livros;

    public Biblioteca() {
        livros = new HashMap<>();
    }

    // Cadastrar livro
    public void cadastrarLivro(String titulo) {
        livros.put(titulo, true); // true significa que o livro está disponível
    }

    // Emprestar livro
    public boolean emprestarLivro(String titulo) {
        if (livros.getOrDefault(titulo, false)) {
            livros.put(titulo, false);
            return true;
        }
        return false;
    }

    // Devolver livro
    public void devolverLivro(String titulo) {
        livros.put(titulo, true);
    }

    // Verificar disponibilidade
    public boolean verificarDisponibilidade(String titulo) {
        return livros.getOrDefault(titulo, false);
    }
}
