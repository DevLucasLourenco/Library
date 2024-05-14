public abstract class Livro  implements Produto{
    
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    @SuppressWarnings("unused")
    private boolean impresso;
    
    public Livro(Autor autor){
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
        
        System.out.println("Novo Livro Criado do Autor "+autor.getNome());
    }
    
    public Livro(){
        this.isbn = "000-00-00000-00-0";
        System.out.println("Novo Livro Criado");
    }
    
    void mostrarDetalhes(){
        System.out.println("Mostrando as informações do livro");
        
        System.out.println("Nome: "+this.nome);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Valor: "+this.valor);
        System.out.println("ISBN: "+this.isbn);
        
        System.out.println("---");

        if (this.temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println("\n");
    }

    boolean temAutor(){
        boolean naoEhNull = this.autor != null;
        return naoEhNull;
    }


    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    // ----
}
