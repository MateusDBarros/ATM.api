import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Banco {

    String name;
    String accNum;
    String password;
    private double cash = 0;

    public Banco (String name, String accNum, String password, double cash){
        this.name = name;
        this.accNum = accNum;
        this.password = password;
        this.cash = cash;
    }

    public void showAll() {
        System.out.printf("Titular: %s, Número: %s, Saldo: R$ %.2f%n", name, accNum, cash);
    }

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    static void create(ArrayList<Banco> contas) {
        System.out.printf("Digite o nome da contas: ");
        String name = scanner.nextLine();
        System.out.printf("Digite a senha da sua conta: ");
        String password = scanner.nextLine();
        int AccInt = random.nextInt(0,10001);
        String accNum = Integer.toString(AccInt);
        System.out.println("Conta criada com sucesso!");
        contas.add(new Banco(name, accNum, password, 0));
        contas.get(contas.size() - 1).showAll();
    }

    static void cashOut(ArrayList<Banco> contas, int index) {

    }

    static void deposit(ArrayList<Banco> contas, int index) {

    }

    static void transfer(ArrayList<Banco> dados, int index) {

    }
}
