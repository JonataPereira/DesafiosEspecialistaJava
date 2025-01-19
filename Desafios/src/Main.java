import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        FolhaPagamento julius = new FolhaPagamento();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do Salario");
        julius.salario = sc.nextDouble();

        System.out.println("Digite a Quantidade de horas normais trabalhadas");
        julius.horasTrabalhadas = sc.nextInt();

        System.out.println("Digite a Quantidade de horas extras trabalhadas");
        julius.horasExtrastrabalhadas = sc.nextInt();

        System.out.printf("O salario devido é %.2f", julius.calcularSalario());

        sc.close();

        }
    }