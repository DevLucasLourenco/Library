package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{
    
    public LivroFisico(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.3){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public double getTaxaImpressao(){
        return super.getValor() * 0.05;
    }
}