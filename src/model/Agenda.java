package model;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, String> contatos;

    public Agenda() {
        contatos = new HashMap<>();
    }

    // Adicionar contato
    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    // Editar contato
    public void editarContato(String nome, String novoTelefone) {
        if (contatos.containsKey(nome)) {
            contatos.put(nome, novoTelefone);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    // Remover contato
    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    // Buscar contato
    public String buscarContato(String nome) {
        return contatos.getOrDefault(nome, "Contato não encontrado.");
    }
}
