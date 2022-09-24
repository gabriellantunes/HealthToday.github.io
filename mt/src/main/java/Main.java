import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner leitor = new Scanner(System.in);

        CalculadoraView.texto1();
        int opcao = leitor.nextInt();

        if (opcao == 1) {}
        if (opcao != 1) {

            CalculadoraView.texto2();

        }

        while (opcao == 1) {

            CalculadoraView.texto3();
            int opcao2 = leitor.nextInt();

            if (opcao2 == 1) {

                System.out.println("Digite um número para somar:");
                int num1 = leitor.nextInt();
                System.out.println("Digite outro número para somar:");
                int num2 = leitor.nextInt();
                System.out.println();
                System.out.println("Valores finais somados: " + Operacoes.somar(num1, num2));

            }

            if (opcao2 == 2) {

                System.out.println("Digite um número para subtrair:");
                int num3 = leitor.nextInt();
                System.out.println("Digite um número para ser subtraído:");
                int num4 = leitor.nextInt();
                System.out.println();
                System.out.println("Valor final subtraido: " + Operacoes.subtrair(num3, num4));

            }

            if (opcao2 == 3) {

                System.out.println("Digite um numero para multiplicar: ");
                int num5 = leitor.nextInt();
                System.out.println("Digite um numero para ser multiplicado: ");
                int num6 = leitor.nextInt();
                System.out.println();
                System.out.println("Valor final multiplicado: " + Operacoes.multiplica(num5, num6));

            }

            if (opcao2 == 4) {

                System.out.println("Digite um numero para dividir:");
                int num7 = leitor.nextInt();
                System.out.println("Digite um numero para ser dividido: ");
                int num8 = leitor.nextInt();
                System.out.println();
                System.out.println("Valor final dividido: " + Operacoes.dividir(num7, num8));

            }

            if (opcao2 == 0) {

                CalculadoraView.texto2();
                break;

            }
        }
    }
}