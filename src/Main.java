import com.sun.deploy.util.SyncAccess;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World!!!");

        int numero = 1;
        System.out.println(numero);

        String nome ="Jessica";
        System.out.println(nome);

        numero = 5;
        System.out.println(numero);

        System.out.println(nome + numero);
        System.out.println(nome + " " + numero);

        int somando = soma(50,15);

        System.out.println (soma(50, 10));
        System.out.println(nome + " " + numero + " " + somando);
    }

    public static int soma(int numeroA, int numeroB){
        return numeroA + numeroB;
    }
}
