import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OperacoesBasicas basica = new OperacoesBasicas();
        OperacoesAvancadas avancada = new OperacoesAvancadas();
        OperacoesExtras extras = new OperacoesExtras();

        System.out.println("===== CALCULADORA JAVA =====");

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\nEscolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        System.out.println("6 - Raiz Quadrada");

        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Resultado: " +
                        basica.somar(num1, num2));
                break;

            case 2:
                System.out.println("Resultado: " +
                        basica.subtrair(num1, num2));
                break;

            case 3:
                System.out.println("Resultado: " +
                        avancada.multiplicar(num1, num2));
                break;

            case 4:
                System.out.println("Resultado: " +
                        avancada.dividir(num1, num2));
                break;

            case 5:
                System.out.println("Resultado: " +
                        extras.potencia(num1, num2));
                break;

            case 6:
                System.out.println("Resultado: " +
                        extras.raizQuadrada(num1));
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}