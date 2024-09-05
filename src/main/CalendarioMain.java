package main;

import model.Calendario;

import java.time.LocalDate;

public class CalendarioMain {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        calendario.exibirCalendario(9, 2024);

        LocalDate data1 = LocalDate.of(2024, 9, 5);
        LocalDate data2 = LocalDate.of(2024, 9, 10);
        System.out.println("Diferença de dias: " + calendario.calcularDiferencaDias(data1, data2));
        System.out.println("25 de dezembro é feriado? " + calendario.isFeriado(LocalDate.of(2024, 12, 25)));
    }
}
