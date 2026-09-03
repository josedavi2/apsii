package unipe.edu.br;

public class CD extends Produto implements InfoGerais {
    private int numFaixas;

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    // Implementação do método da interface InfoGerais
    @Override
    public void exibeInformacoes() {
        System.out.println("Nome do CD: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Número de faixas: " + numFaixas);
    }
}