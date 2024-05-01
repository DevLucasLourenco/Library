public class LivroFisico extends Livro{
    
    public LivroFisico(Autor autor){
        super(autor);
    }

    public double getTaxaImpressao(){
        return super.getValor() * 0.05;
    }
}