/**
 * Created by lcs on 08/06/16.
 */
public class ListaVazia implements Lista {

    public ListaVazia(){}

    public int quantos(){
        return 0;
    }

    public int soma(){
        return 0;
    }

    public Enumerador enumerador(){
        return new Enumerador (){
            public int proximo(){
                return 0;
            }
            public boolean fim(){
                return true;
            }
        };
    }

}
