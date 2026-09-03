import unipe.edu.br.*;
public class TesteFuncionarios {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500.00, "01/03/2020");


        FuncionarioCLT f2 = new FuncionarioCLT("Bruno Reis", "C001", 3000.00, "10/06/2021", 220.00, 400.00);

        Gerente f3 = new Gerente("Carla Mendes", "G001", 8000.00, "15/01/2018", 300.00, 500.00, 12, 0.20);


        Estagiario f4 = new Estagiario("Diego Alves", "E001", 0.00, "05/08/2024", 1500.00, 20);


        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());


        Diretor diretor = new Diretor("Elena Silva", "D001", 15000.00, "01/01/2015", 0, 0, 50, 0.30, 5000.00);
        System.out.println("\n-- Teste Desafio Diretor --");
        System.out.println(diretor.toString());
    }
}