public class ConExperiencia extends Programador {
    private int experiencia;

    public ConExperiencia(String rut, int experiencia){
        super(rut);
        this.experiencia=experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public int calcularSueldo(){
        return Programador.getSueldoBase()+this.experiencia*250000;
    }
}
