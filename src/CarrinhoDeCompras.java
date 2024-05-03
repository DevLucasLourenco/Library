public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: "+livro.getNome());
        livro.aplicarDescontoDe(0.05);
        this.total += livro.getValor();
    }
    
    public double getTotal() {
        return total;
    }
}