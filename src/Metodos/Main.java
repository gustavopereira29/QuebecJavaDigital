package Metodos;

public class Main {
    public static void main(String [] args){

        // Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(90, 53);
        Calculadora.subtracao(90, 53);
        Calculadora.multiplicacao(90, 53);
        Calculadora.divisao(90, 53);

        // Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(2);

        // Empréstimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(10000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(10000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(15000, Emprestimo.getTresParcelas());

        // Quadrilatero
        System.out.println("Exercicio quadrilatero - Sobrecarga");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(99, 1, 5);
        Quadrilatero.area(5f,5f);

        // Quadrilatero2
        System.out.println("Exercicio Quadrilatero2 - Return");

        double areaQuadrado = Quadrilatero2.area(6);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(6, 9);
        System.out.println("Area do ratangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(25, 60, 3);
        System.out.println("Area do trapezio: " + areaTrapezio);
    }
}
