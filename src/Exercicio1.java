public class Exercicio1 {
    public static void main (String[] args){
        double umNumeroB = 15;
        String umaCadeiaDeTexto = "Hoje é segunda";

        System.out.println (umNumeroB + " " + umaCadeiaDeTexto);

        System.out.println (soma(16, 24));

        System.out.println (subtracao(65, 24));
    }

    public static int soma (int numeroA, int numeroB){
        return (numeroA + numeroB);
    }

    public static int subtracao (int numeroA, int numeroB){
        return (numeroA - numeroB);
    }
}
