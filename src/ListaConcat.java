/**
 * Created by lcs on 08/06/16.
 */
public class ListaConcat implements Lista {

    Lista lista1, lista2;

    public ListaConcat(Lista lista1, Lista lista2){
        this.lista1 = lista1;
        this.lista2 = lista2;
    }

    public int quantos(){
        return lista1.quantos() + lista2.quantos();
    }

    public int soma(){
        return lista1.soma() + lista2.soma();
    }

    public Enumerador enumerador (){
        return new Enumerador() {
                Enumerador enumPrimeira = lista1.enumerador();
                Enumerador enumSegunda = lista2.enumerador();
            public int proximo() {
                if(enumPrimeira.fim()){
                    return enumSegunda.proximo();
                }
                return enumPrimeira.proximo();
            }

            @Override
            public boolean fim() {
                if(enumPrimeira.fim()){
                    return enumSegunda.fim();
                }
                return false;
            }
        };
    }


}
