import javax.print.DocFlavor;
import java.util.Scanner;

public class Menu {

    static void menu(Banco contas[], int index) {

        contas = new Banco[100];
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("--- Olá, " +contas[index].name);
            System.out.println("1. Sacar.");
            System.out.println("2. Depositar.");
            System.out.println("3. Transferir.");
            System.out.println("4. Sair.");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    Banco.cashOut(contas, index);
                    break;

                case 2:
                    Banco.deposit(contas, index);
                    break;

                case 3:
                    Banco.transfer(contas, index);
                    break;

                case 4:
                    System.out.println("Voltando ao menu anterior...");
                    System.out.println();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        } while (userInput != 4);
    }

    static int login(Banco contas[]) {

        Scanner scanner = new Scanner(System.in);

        String acc;
        String accPass;

        System.out.print("Digite o numero da conta: ");
        acc = scanner.nextLine();

        for (int i = 0; i < contas.length; i++){
            if (acc.equals(contas[i].accNum)) {
                System.out.printf("Olá, " +contas[i].name+ ", digite a senha da conta: ");
                accPass = scanner.nextLine();
                if (accPass.equals(contas[i].password)) {
                    return i;
                }
            }
        }
        System.out.println("Conta não encontrada!");
        return -1;
    }
}
