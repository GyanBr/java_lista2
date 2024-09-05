package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Calendario {
    // Exibir calendário de um mês
    public void exibirCalendario(int mes, int ano) {
        LocalDate primeiroDia = LocalDate.of(ano, mes, 1);
        System.out.println("Calendário de " + primeiroDia.getMonth() + " " + ano);
        for (int i = 1; i <= primeiroDia.lengthOfMonth(); i++) {
            LocalDate data = primeiroDia.withDayOfMonth(i);
            System.out.print(data.getDayOfMonth() + " ");
            if (data.getDayOfWeek().getValue() % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Verificar se uma data é feriado (simulação)
    public boolean isFeriado(LocalDate data) {
        // Simulação simples: considerar 25 de dezembro como feriado
        return data.getMonthValue() == 12 && data.getDayOfMonth() == 25;
    }

    // Calcular diferença de dias entre duas datas
    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}
