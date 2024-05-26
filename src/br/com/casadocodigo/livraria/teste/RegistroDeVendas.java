package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Lucas Lourenco");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Livro Físico Java");
        fisico.setValor(59.90);
        
        if (fisico.aplicarDescontoDe10Porcento()){
            System.out.println("Valor agora é: "+fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Ebook Java");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println(carrinho.getTotal());

        Produto[] produtos = carrinho.getProdutos();
        
        for (Produto produto : produtos){
            if (produto != null){
                System.out.println(produto.getValor());
            }
        }
    }
}
