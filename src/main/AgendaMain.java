package main;

import model.Agenda;

public class AgendaMain {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("João", "123456789");
        agenda.adicionarContato("Maria", "987654321");

        System.out.println("Telefone de João: " + agenda.buscarContato("João"));
        agenda.editarContato("João", "111222333");
        System.out.println("Novo telefone de João: " + agenda.buscarContato("João"));
        agenda.removerContato("Maria");
        System.out.println("Telefone de Maria: " + agenda.buscarContato("Maria"));
    }
}
