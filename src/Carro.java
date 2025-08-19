public class Carro {
    String modelo;
    String cor;
    int ano;
    int velocidade;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int aumento) {
        this.velocidade += aumento;
        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
    }

    public void frear(int reducao) {
        if (this.velocidade - reducao < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= reducao;
        }
        System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
    }

    public void exibirInformacoes() {
        System.out.println("--- Informações do Carro ---");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
        System.out.println("----------------------------");
    }
}
