package Metodos;

/**
 * Classe de exemplo para o exercicio da aula 2 de Metodos - Return
 */

public class Quadrilatero2 {

    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
}
