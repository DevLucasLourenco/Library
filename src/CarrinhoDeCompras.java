public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: "+produto);
        // produto.aplicarDescontoDe(0.16);
        this.total += produto.getValor();
    }
    
    public double getTotal() {
        return total;
    }
}