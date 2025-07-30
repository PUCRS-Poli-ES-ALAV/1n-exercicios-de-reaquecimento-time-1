import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int selection;
        while (true) {
            printMenu();
            selection = sc.nextInt();
            handleSelection(selection);
        }
    }

    private static void printMenu() {
        System.out.println("""
                \nSelecione a operação:
                1. Multiplicar
                2. Somar
                3. Fracionais
                4. Inversão de string
                5. Sequência F
                6. Sequência de Ackermann
                0. Encerrar""");
    }

    private static void handleSelection(int selection) {
        switch(selection) {
            case (0) : {
                System.out.println("Encerrando...");
                sc.close();
                System.exit(0);
            }

            case (1) : { // Multiplicar
                System.out.print("Forneca o primeiro número:\n> ");
                int a = sc.nextInt();
                System.out.print("Forneça o segundo número:\n> ");
                int b = sc.nextInt();
                int result = Lib.multiply(a, b);
                System.out.printf("%d * %d = %d\n", a, b, result);
                break;
            }

            case (2) : { // Somar
                System.out.print("Forneca o primeiro número:\n> ");
                int a = sc.nextInt();
                System.out.print("Forneça o segundo número:\n> ");
                int b = sc.nextInt();
                int result = Lib.sum(a, b);
                System.out.printf("%d + %d = %d\n", a, b, result);
                break;
            }

            case (3) : { // Fracionais
                System.out.print("Forneca um número:\n> ");
                int a = sc.nextInt();
                float result = Lib.fractionalSum(a);
                System.out.printf("1 + 1/2 + 1/3 + ... + 1/%d = %.5f\n", a, result);
                break;
            }

            case (4) : { // Inversão de string
                System.out.print("Forneça uma string:\n> ");
                sc.nextLine();
                String s = sc.nextLine();
                String result = Lib.invertString(s);
                System.out.println(s + " -> " + result);
                break;
            }

            case (5) : { // Sequência F
                System.out.print("Forneça um número:\n> ");
                int a = sc.nextInt();
                int result = Lib.weirdSequence(a);
                System.out.printf("F(%d) = %d\n", a, result);
                break;
            }

            case (6) : { // Sequência de Ackermann
                System.out.print("Forneca o primeiro número:\n> ");
                int a = sc.nextInt();
                System.out.print("Forneça o segundo número:\n> ");
                int b = sc.nextInt();
                int result = Lib.ackermann(a,b);
                System.out.printf("A(%d, %d) = %d\n", a, b, result);
            }
            
            default : {
                System.out.println("Opção inválida.");
                break;
            }
        }
    }
}
