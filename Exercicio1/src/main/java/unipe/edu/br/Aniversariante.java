package unipe.edu.br;

public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aniversariante) {
            Aniversariante outro = (Aniversariante) obj;
            boolean mesmoNome = (this.nome != null && this.nome.equals(outro.nome)) || (this.nome == null && outro.nome == null);
            boolean mesmaData = (this.dataAniversario != null && this.dataAniversario.equals(outro.dataAniversario)) || (this.dataAniversario == null && outro.dataAniversario == null);
            return mesmoNome && mesmaData;
        }
        return false;
    }
}