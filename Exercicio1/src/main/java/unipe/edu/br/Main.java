package unipe.edu.br;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DataAniversario data = new DataAniversario(15, 8);
        Aniversariante a1 = new Aniversariante("Carlos", 15, 8);
        Aniversariante a2 = new Aniversariante("Ana", data);
        Aniversariante a3 = new Aniversariante("Carlos", 15, 8);

        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a2));

        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

        agenda.adicionarAniversariante("João", 10, 5);
        agenda.adicionarAniversariante("Maria", 10, 5);
        agenda.adicionarAniversariante("Pedro", 20, 12);
        agenda.adicionarAniversariante("Marcos", 10, 5);

        ArrayList<String> aniversariantesDia10Mes5 = agenda.obterAniversariantesDoDia(10, 5);
        System.out.println(aniversariantesDia10Mes5);

        agenda.removerAniversariante("Maria");

        aniversariantesDia10Mes5 = agenda.obterAniversariantesDoDia(10, 5);
        System.out.println(aniversariantesDia10Mes5);
    }
}