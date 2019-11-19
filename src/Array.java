import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main (String[] args){
      List<String> nomesAlunos = new ArrayList<>();
      String nome1 = "Jessica";
      nomesAlunos.add(nome1);
      String nome2 = "Joao";
      nomesAlunos.add(nome2);
      String nome3 = "Silmara";
      nomesAlunos.add(nome3);
      String nome4 = "Jose";
      nomesAlunos.add(nome4);

      System.out.println(nomesAlunos.get(1));

      //System.out.println(nomesAlunos);

        System.out.println(nomesAlunos);

      for (int i=0; i < nomesAlunos.size(); i++){
          System.out.println(nomesAlunos.get(i));
      }
    }
}
