import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Qual operação deseja realizar?");
        System.out.println("Operações válidas: + - * / %");
        String operacao = scanner.next();

        operacao.trim();

        int resultado = operacao.equals("+") ? num1 += num2 : operacao.equals("-") ? num1 -= num2 : operacao.equals("*") ? num1 *= num2 : operacao.equals("/") ? num1 /= num2 : operacao.equals("%") ? num1 %= num2 : 0;

        System.out.println(resultado);
    }
}
