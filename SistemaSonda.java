public interface SistemaSonda {
    
    public void ingresarNovato(String rut,int cantLeng);
    public void ingresarConExperiencia(String rut, int exp);
    public String obtenerLengProg();
    public String obtenerDatosProgramadores();
    public void setSueldoFijo(int sueldoFijo);
}
