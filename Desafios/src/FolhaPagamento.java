public class FolhaPagamento {

    double valorHora, valorHoraExtra, salario, salarioTotal;
    int horasTrabalhadas, horasExtrastrabalhadas;

    double calcularSalario() {
        valorHora = salario / horasTrabalhadas;
        valorHoraExtra = (valorHora * 0.5) + valorHora;
        salarioTotal = (valorHora * horasTrabalhadas) + (valorHoraExtra * horasExtrastrabalhadas);

        return salarioTotal;
    }
}
