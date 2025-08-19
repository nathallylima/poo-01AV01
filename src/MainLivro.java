public class MainLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.exibirInformacoes();
        livro1.emprestar();
        livro1.devolver();
        livro1.exibirInformacoes();
        System.out.println();
        livro2.exibirInformacoes();
    }
}
