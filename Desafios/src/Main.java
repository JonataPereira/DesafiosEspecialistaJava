


public class Main {
    public static void main(String[] args) {

        FolhaPagamento julius = new FolhaPagamento();
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Julius";
        funcionario.quantidadeFilhos = 0;


        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.valorHora = 45.45;
        contrato.valorHorasExtra = 68;

        double salarioDevido = julius.calcularSalario(220,36,contrato);

        System.out.printf("Salario devido: %.2f\n",salarioDevido);

        }
    }