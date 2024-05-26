package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Lucas Lourenço");
        autor.setEmail("lucas.lourenco@aprendendoJava.com");
        autor.setCpf("123.456.789.10");
        

        LivroFisico livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prática");
        livro.setDescricao("novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");;

        livro.setAutor(autor);

        
        if (!livro.aplicarDescontoDe(0.1)){
            System.out.println("Desconto não pode ser maior do que 30%");
        }
        
        livro.mostrarDetalhes();
        
        // ---

        Autor outroAutor = new Autor();
        outroAutor.setNome("Lucas Lourenço2");
        outroAutor.setEmail("lucas2.lourenco2@aprendendoJava.com");
        outroAutor.setCpf("987-654-321-10");
        

        LivroFisico outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        // outroLivro.setIsbn("978-85-66250-22-0");

        outroLivro.setAutor(outroAutor);
        
        outroLivro.mostrarDetalhes();

    }
}