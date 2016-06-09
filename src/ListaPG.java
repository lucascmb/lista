/**
 * Created by lcs on 08/06/16.
 */
public class ListaPG implements Lista {

    public int elementoInicial;
    public int razao;
    public int numeroDeTermos;

    public ListaPG(int a0, int q, int n){
        this.elementoInicial = a0;
        this.razao = q;
        this.numeroDeTermos = n;
    }

    public int quantos(){
        return numeroDeTermos;
    }

    public int soma(){
        return (elementoInicial * ((int)Math.pow(razao, numeroDeTermos) - 1)) / (razao - 1);
    }

    public Enumerador enumerador(){
        return new Enumerador() {

            int contador = -1;

            public int proximo() {
                contador++;
                if(contador > 4){
                    contador = 0;
                }
                return elementoInicial * (int) Math.pow(razao, contador);
            }

            public boolean fim() {
                while(contador < numeroDeTermos - 1){
                    return false;
                }
                return true;
            }
        };
    }


}
