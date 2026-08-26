package unipe.edu.br;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        this.aniversariantes.add(new Aniversariante(nome, dia, mes));
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> aniversariantesDoDia = new ArrayList<>();
        DataAniversario dataDesejada = new DataAniversario(dia, mes);

        for (Aniversariante a : aniversariantes) {
            if (a.getDataAniversario() != null && a.getDataAniversario().equals(dataDesejada)) {
                aniversariantesDoDia.add(a.getNome());
            }
        }
        return aniversariantesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = aniversariantes.size() - 1; i >= 0; i--) {
            Aniversariante a = aniversariantes.get(i);
            if (a.getNome() != null && a.getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
            }
        }
    }
}