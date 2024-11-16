import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Banco contas[] = new Banco[100];
        Scanner scanner = new Scanner(System.in);

        int userInput;
        int index;

        do {

            System.out.println("1. Criar uma conta.");
            System.out.println("2. Entrar...");
            System.out.println("3. Sair.");
            userInput = scanner.nextInt();


            switch (userInput) {
                case 1:
                    Banco.create(contas);
                    break;
                case 2:
                    index = Menu.login(contas);
                    Menu.menu(contas, index);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    return;
            }



        } while (userInput != 3);
    }
}
