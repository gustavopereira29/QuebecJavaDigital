package EstruturasCondicionais;

public class ResultadoEscolar {
    public static void main(String[] args){
        int nota = 9;

        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if(nota >= 5 && nota < 7 ){
            System.out.println("Precisa fazer recuperacao");
        }
        else{
            System.out.println("Reprovado");
        }

        System.out.println("-------------------------------");

        //Operador Ternario

        int nota2 = 6;
        String resultado = nota2 >= 7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);
    }
}
