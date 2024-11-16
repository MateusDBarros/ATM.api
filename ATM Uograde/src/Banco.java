import java.util.Scanner;
import java.util.Random;

public class Banco {


    String name;
    String accNum;
    String password;
    public static int Accounts = 0;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static void create(Banco contas[]) {
        contas[Accounts] = new Banco();
        System.out.printf("Digite o nome da contas: ");
        contas[Accounts].name = scanner.nextLine();
        System.out.printf("Digite a senha da sua conta");
        contas[Accounts].password = scanner.nextLine();
        int AccInt = random.nextInt(0,10001);
        String AccString  = Integer.toString(AccInt);
        contas[Accounts].accNum = AccString;
        Accounts++;

        System.out.println("Conta criada com sucesso!\nO numero da sua conta é: " + contas[Accounts].accNum);
    }

    static void cashOut(Banco contas[], int index) {

    }

    static void deposit(Banco contas[], int index) {

    }

    static void transfer(Banco dados[], int index) {

    }
}
