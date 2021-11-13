public abstract class Programador{

    private String rut;
    private static int sueldoBase;

    public Programador(String rut){
        this.rut=rut;
    }

    public static void setSueldoBase(int sueldo){
        sueldoBase=sueldo;
    }

    public static int getSueldoBase(){
        return sueldoBase;
    }

    public abstract int calcularSueldo();

    public String getRut(){
        return rut;
    }
}

/**
 * Programador.setSueldoBase(sueldo);
 * Programador p = new Programador("ru1");
 * sout(p.getSueldoBase());
 */

