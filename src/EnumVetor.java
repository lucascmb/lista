import java.util.List;

/**
 * Created by lcs on 08/06/16.
 */
public class EnumVetor implements Enumerador {

    public int vetorInt[];
    public int tamanhoVetor;
    public int posAtual;

    public EnumVetor(int vetor[]){
        this.vetorInt = vetor;
        this.tamanhoVetor = this.vetorInt.length;
        this.posAtual = 0;
    }

    public int proximo(){
        this.posAtual++;
        return vetorInt[posAtual - 1];
    }

    public boolean fim(){
        if(posAtual == tamanhoVetor){
            return true;
        }
        return false;
    }

}
