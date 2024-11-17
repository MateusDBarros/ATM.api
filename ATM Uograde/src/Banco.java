import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static void menu(ArrayList<Banco> contas, int index) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("--- Olá, " + contas.get(index).name);
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

    static int login(ArrayList<Banco> contas) {

        Scanner scanner = new Scanner(System.in);

        String acc;
        String accPass;

        System.out.print("Digite o numero da conta: ");
        acc = scanner.nextLine();

        for (int i = 0; i < contas.size(); i++){
            if (acc.equals(contas.get(i).accNum)) {
                System.out.printf("Olá, " + contas.get(i).name+ ", digite a senha da conta: ");
                accPass = scanner.nextLine();
                if (accPass.equals(contas.get(i).password)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
