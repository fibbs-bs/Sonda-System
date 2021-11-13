import java.util.Scanner;

public class App {
    public static void main(String [] args){
        SistemaSonda system = new SistemaSondaImpl();
        Scanner scan = new Scanner(System.in);
        System.out.println("******************");
		System.out.println("INGRESO DE LOS PROGRAMADORES");
		System.out.println("******************\n");
        System.out.println("INGRESE SUELDO BASE: ");
        system.setSueldoFijo(Integer.parseInt(scan.nextLine()));
		System.out.println("RUT: ");
        String rut = scan.nextLine();
        while (!rut.equals("fin")){
            System.out.println("¿TIENE EXPERIENCIA? [SI/NO]: ");
            String tipo = scan.nextLine();
            if(tipo.equalsIgnoreCase("SI")){
                System.out.println("AÑOS DE EXPERIENCIA: ");
                int experiencia = Integer.parseInt(scan.nextLine());
                try{
                    system.ingresarConExperiencia(rut, experiencia);
                }
                catch (NullPointerException ex){
                    System.out.println(ex.getMessage());
                }
            }
            else{
                if(tipo.equalsIgnoreCase("NO")){
                    System.out.println("LENGUAJES QUE SABE: ");
                    int cant = Integer.parseInt(scan.nextLine());
                    try {
                        system.ingresarNovato(rut, cant);
                    } catch (NullPointerException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
            System.out.println("RUT: ");
            rut = scan.nextLine();
        }
        System.out.println(system.obtenerDatosProgramadores());
        System.out.println(system.obtenerLengProg());
    }
}
