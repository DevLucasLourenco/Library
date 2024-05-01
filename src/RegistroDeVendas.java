public class RegistroDeVendas {
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Lucas Lourenco");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Livro Físico Java");

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Ebook Java");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        
    }
}