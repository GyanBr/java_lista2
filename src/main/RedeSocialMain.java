package main;

import model.RedeSocial;

public class RedeSocialMain {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();
        redeSocial.adicionarAmigo("Alice", "Bob");
        redeSocial.publicarMensagem("Alice", "Olá, mundo!");
        redeSocial.comentarEmPost("Bob", "Muito bom, Alice!");

        System.out.println("Amigos de Alice: " + redeSocial.buscarUsuarios("Alice"));
    }
}
