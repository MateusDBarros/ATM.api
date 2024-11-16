import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Banco {


    static String name;
    static String accNum;
    static String password;
    static double cash = 0;

    Banco (String name, String accNum, String password, double cash){
        this.name = name;
        this.accNum = accNum;
        this.password = password;
        this.cash = cash;
    }

    public static void showAll() {
        System.out.printf("Titular: %s, Número: %s, Saldo: R$ %.2f%n", name, accNum, cash);
    }

    public static int Accounts = 0;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    ArrayList<Banco> contas = new ArrayList<Banco>();

    static void create(Banco contas[]) {

        System.out.printf("Digite o nome da contas: ");
        String name = scanner.nextLine();
        System.out.printf("Digite a senha da sua conta: ");
        String password = scanner.nextLine();
        int AccInt = random.nextInt(0,10001);
        String accNum = Integer.toString(AccInt);
        System.out.println("Conta criada com sucesso!");
        contas[Accounts] = new Banco(name, accNum, password, 0);
        showAll();
        Accounts++;
    }

    static void cashOut(Banco contas[], int index) {

    }

    static void deposit(Banco contas[], int index) {

    }

    static void transfer(Banco dados[], int index) {

    }
}
