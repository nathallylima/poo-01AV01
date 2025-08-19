public class Livro {
    String titulo;
    String autor;
    int anoDePublicacao;
    boolean disponivel;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            this.disponivel = false;
            System.out.println("O livro '" + this.titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + this.titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            this.disponivel = true;
            System.out.println("O livro '" + this.titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + this.titulo + "' já estava disponível.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("--- Informações do Livro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoDePublicacao);
        System.out.println("Disponível: " + (this.disponivel ? "Sim" : "Não"));
        System.out.println("----------------------------");
    }
}
