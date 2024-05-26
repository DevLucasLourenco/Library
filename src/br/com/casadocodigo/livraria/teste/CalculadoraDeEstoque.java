package br.com.casadocodigo.livraria.teste;
public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        double soma = 0;
        double valorDoLivro = 59.90;

        for (int i = 0; i < 25; i++) {
            soma += valorDoLivro;
        }

        System.out.println("O total da soma do estoque é "+soma);

        if (soma<150){
            System.out.println("estoque baixo");
        }else if (soma>=2000){
            System.out.println("estoque muito alto");
        }else{
            System.out.println("estoque bom");
        }
    }
}

