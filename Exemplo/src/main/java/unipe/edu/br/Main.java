package unipe.edu.br;
public class Main {


    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Fusca", 1970);
        Carro c1 = new Carro("Polo", 2025, 4);
        Moto m1 = new Moto("Hornet", 2026, 750);
        System.out.println(v1.imprimeDetalhes());
        System.out.println(c1.imprimeDetalhes());
        System.out.println(m1.imprimeDetalhes());
    }
}