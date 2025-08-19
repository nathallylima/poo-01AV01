public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$ " + String.format("%.2f", valor) + " para " + contaDestino.titular + " realizada.");
        } else {
            System.out.println("Não foi possível realizar a transferência.");
        }
    }

    public void exibirSaldo() {
        System.out.println("--- Saldo da Conta ---");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
        System.out.println("----------------------");
    }
}
