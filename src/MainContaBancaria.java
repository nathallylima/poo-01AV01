public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345-6", "João da Silva", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("98765-4", "Maria Souza", 500.00);
        conta1.exibirSaldo();
        conta1.depositar(200.00);
        conta1.sacar(150.00);
        conta1.exibirSaldo();
        System.out.println();
        conta2.exibirSaldo();
        conta1.transferir(conta2, 300.00);
        System.out.println("\n--- Saldos Finais ---");
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
