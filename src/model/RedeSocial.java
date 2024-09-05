package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedeSocial {
    private Map<String, List<String>> amigos;
    private Map<String, List<String>> posts;

    public RedeSocial() {
        amigos = new HashMap<>();
        posts = new HashMap<>();
    }

    // Adicionar amigo
    public void adicionarAmigo(String usuario, String amigo) {
        amigos.computeIfAbsent(usuario, k -> new ArrayList<>()).add(amigo);
    }

    // Publicar mensagem
    public void publicarMensagem(String usuario, String mensagem) {
        posts.computeIfAbsent(usuario, k -> new ArrayList<>()).add(mensagem);
    }

    // Comentar em post
    public void comentarEmPost(String usuario, String mensagem) {
        // Simples simulação de comentário
        System.out.println(usuario + " comentou: " + mensagem);
    }

    // Buscar usuários
    public List<String> buscarUsuarios(String usuario) {
        return amigos.getOrDefault(usuario, new ArrayList<>());
    }
}
