public class FolhaPagamento {

    double calcularSalario(int horasTrabalhadas, int horasExtrasTrabalhadas, ContratoTrabalho contrato) {
       double valorHoras = horasTrabalhadas * contrato.valorHora;
       double valorHorasExtras = horasExtrasTrabalhadas * contrato.valorHorasExtra;

       double salarioTotal = valorHoras + valorHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            salarioTotal *= 1.10;
        }

        return salarioTotal;
    }
}
