import java.util.*;

/**
 * Created by lcs on 08/06/16.
 */
public class ClasseMain {

    public static void main (String [] args) {
        Lista l1 = new ListaPG(2,4,5);
        System.out.println(l1.quantos()); // 5
        System.out.println(l1.soma()); // 682
        Enumerador e1 = l1.enumerador();
        while(!e1.fim()) System.out.println(e1.proximo()); // 2 8 32 128 512
    }


   /* public static void main (String [] args){
        Enumerador e = new EnumVetor(new int[] { 1, 3, 5 });
        List<Integer> lista = listaDeEnum(e);
        Iterator i = lista.iterator();
        for(int j : lista){
            System.out.println(i.next());
        }
    }

    static List<Integer> listaDeEnum(Enumerador e){
        List<Integer> lista = new ArrayList();
        do{
            lista.add(e.proximo());
        }while(!e.fim());
        return lista;
    }*/

}
