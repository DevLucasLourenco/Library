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


        double v1 = 2;
        double v2 = 6;
        boolean validador = false;

        if (v1 < v2 && v2 > 5){
            System.out.println("ambos são true");
        }if (v1 < v2 || v2 > 5){
            System.out.println("ou um ou outro");
        }if (!validador){
            System.out.println("Boolean se torna verdadeiro");
        }

    }
}

