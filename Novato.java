public class Novato extends Programador{

    private int cantLenguajes;

    public Novato(String rut,int cant){
        super(rut);
        cantLenguajes=cant;
    }

    public int getCantLenguajes(){
        return cantLenguajes;
    }

    public void setCantLenguajes(int cant){
        cantLenguajes=cant;
    }

    @Override
    public int calcularSueldo(){
        return Programador.getSueldoBase();
    }

}
