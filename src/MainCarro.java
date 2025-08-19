public class MainCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", "Azul", 1975);
        meuCarro.exibirInformacoes();
        meuCarro.acelerar(60);
        meuCarro.frear(20);
        meuCarro.exibirInformacoes();
        meuCarro.cor = "Vermelho";
        System.out.println("\nCor do carro alterada para: " + meuCarro.cor);
        meuCarro.exibirInformacoes();
    }
}
