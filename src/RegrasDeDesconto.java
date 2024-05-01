public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("lucas Lourenco");

        Livro livro = new Livro(autor);
        livro.setValor(59.90);

        System.out.println("Valor Atual: "+livro.getValor());

        if (!livro.aplicarDescontoDe(0.1)){
            System.out.println("Desconto não pode ser maior do que 30%");
        }else{
            System.err.println("Valor com desconto: "+livro.getValor());
        }
        
        // ---
        System.out.println("\n");

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);
        
        if (!ebook.aplicarDescontoDe(0.15)){
            System.out.println("Desconto no ebook não pode ser maior do que 15%");
        }else{
            System.err.println("Valor do Ebook com desconto: "+ebook.getValor());
        }

    }    
}