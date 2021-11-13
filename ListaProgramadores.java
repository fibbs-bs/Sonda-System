public class ListaProgramadores {
    
    private int cant;
    private int max;
    private Programador [] lista;

    public ListaProgramadores(int max){
        this.max=max;
        cant=0;
        lista = new Programador[max];
    }

    public int getCant(){
        return cant;
    }

    public Programador getProgramadorI(int i){
        if (i<cant){ 
            return lista[i];
        }
        else{ 
            return null;
        }
    }

    public boolean ingresarProgramador(Programador p){
        if (cant<max){
            lista[cant]=p;
            cant++;
            return true;
        }
        else{
            return false;
        }
    }
}
