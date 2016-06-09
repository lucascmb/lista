/**
 * Created by lcs on 08/06/16.
 */
public class ListaCons implements Lista {

    public int primeiro;
    public Lista resto;

    public ListaCons(int primeiro, Lista list){
        this.primeiro = primeiro;
        this.resto = list;
    }

    public int quantos(){
        return resto.quantos() + 1;
    }

    public int soma(){
        return primeiro + resto.soma();
    }

    public Enumerador enumerador(){
        return new Enumerador() {
            Enumerador enumResto = null;

            public int proximo() {
                if(enumResto == null) {
                    enumResto = resto.enumerador();
                    return primeiro;
                }
                return enumResto.proximo();
            }

            public boolean fim(){
                if(enumResto == null){
                    return false;
                }
                return enumResto.fim();
            }

        };
    }

}
