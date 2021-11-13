public class SistemaSondaImpl implements SistemaSonda {
    
    private ListaProgramadores programadores;

    public SistemaSondaImpl(){
        programadores = new ListaProgramadores(10);
    }

    @Override
    public void ingresarNovato(String rut, int cantLeng) {
        Programador n = new Novato(rut, cantLeng);
        if (!programadores.ingresarProgramador(n)){
            throw new NullPointerException("No hay espacio en la lista! No se pueden agregar mas programadores.");
        }
    }

    @Override
    public void ingresarConExperiencia(String rut, int exp) {
        Programador e = new ConExperiencia(rut,exp);
        if (!programadores.ingresarProgramador(e)){
            throw new NullPointerException("No hay espacio en la lista! No se pueden agregar mas programadores.");
        }
        
    }

    @Override
    public String obtenerLengProg() {
        int cantLenguajes = 0;
        int cantNovatos = 0;
        for (int i = 0; i < programadores.getCant(); i++) {
            Programador hijo = programadores.getProgramadorI(i); //Programador, no es ninguno de sus hijos.
            if (hijo instanceof Novato){
                cantNovatos++;
                Novato novato = (Novato) hijo; //Ahora vemos al hijo como novato, no como Programador
                cantLenguajes += novato.getCantLenguajes();
            }
        }
        int promedio = cantLenguajes/cantNovatos;
        return "Cantidad Novatos: "+cantNovatos+" | Promedio de lenguajes por novato: "+promedio;
    }

    @Override
    public String obtenerDatosProgramadores() {
        String text = "";
        for (int i = 0; i < programadores.getCant(); i++) {
            Programador p = programadores.getProgramadorI(i);
            text += "Rut del programador: "+p.getRut()+", sueldo final: $"+p.calcularSueldo();
            if (p instanceof ConExperiencia){
                ConExperiencia c = (ConExperiencia) p;
                text+=", experiencia: "+c.getExperiencia()+"\n";
            }
            else{
                Novato n = (Novato) p;
                text+=", cantidad de lenguajes: "+n.getCantLenguajes()+"\n";
            }
        }
        return text;
    }

    @Override
    public void setSueldoFijo(int sueldoFijo) {
        Programador.setSueldoBase(sueldoFijo);
    }

}
