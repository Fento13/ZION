package maps.simulacrionuevo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class SimulacrioNuevo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            Integrante integrante1 = new Integrante("1", "Juan", "Gomez", "Perez", Especialidades.INGENIERIA, true);
            Integrante integrante2 = new Integrante("2", "Salma", "Luna", "Sanz", Especialidades.FISICA, false);
            ArrayList<Integrante> listaIntegrantes1 = new ArrayList<Integrante>();
            listaIntegrantes1.add(integrante1);
            listaIntegrantes1.add(integrante2);
            ArrayList investigaciones = new ArrayList<Investigacion>();
            Investigacion investigacion1 = new Investigacion("F1P1", "Analisis teorico sobre la estructura de nucleos exoticos ligeros", LocalDate.of(2025, Month.JUNE,5 ), LocalDate.of(2025, Month.DECEMBER, 18), LocalDate.of(2025, Month.DECEMBER, 10), 70000.00);
            Investigacion investigacion2 = new Investigacion("F1P2", "Analisis e implementacion de medidas de seguridad en centrales nucleares ", LocalDate.of(2003, Month.AUGUST,8 ), LocalDate.of(2027, Month.AUGUST, 5), LocalDate.of(2027, Month.MARCH, 17), 100000.00);
            investigaciones.add(investigacion1);
            investigaciones.add(investigacion2);
            ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
            Equipo equipo1 = new Equipo("E1", "Equipo de fisica nuclear", listaIntegrantes1, investigaciones);
            listaEquipos.add(equipo1);

            
    }
    
    public static Equipo registrarEquipo(){
       //TODO hacer equipo
        String id, nombre; 
        ArrayList<Integrante> integrantesEquipo = new ArrayList<>();
        ArrayList<Investigacion> investigaciones = new ArrayList<>();
        System.out.println("ingrese el id del equipo");
        id = scanner.nextLine();
        System.out.println("ingrese el nombre del equipo");
        nombre = scanner.nextLine();
        //Hacer integrantes del equipo
        System.out.println("ingrese el numero de integrantes del equipo");
        int numeroIntegrantes = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numeroIntegrantes; i++) {
            System.out.println("ingrese el id del integrante");
            String idIntegrante = scanner.nextLine();
            System.out.println("ingrese el nombre del integrante");
            String nombreIntegrante = scanner.nextLine();
            integrantesEquipo.add(new Integrante(idIntegrante, nombreIntegrante, "", "", Especialidades.INGENIERIA, false));
        }
        //Hacer investigaciones del equipo
        System.out.println("ingrese el numero de investigaciones del equipo");
        int numeroInvestigaciones = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < numeroInvestigaciones; i++) {
            System.out.println("ingrese el id de la investigacion");
            String idInvestigacion = scanner.nextLine();
            System.out.println("ingrese el nombre de la investigacion");
            String nombreInvestigacion = scanner.nextLine();
            investigaciones.add(new Investigacion(idInvestigacion, nombreInvestigacion, LocalDate.now(), LocalDate.now(), LocalDate.now(), 0.0));
        }
        //crear el equipo con los datos ingresados
        return new Equipo(id, nombre, integrantesEquipo, investigaciones);
    }

    public static void mostrarEquipo(Equipo equipo){
        System.out.println("id del equipo: " + equipo.getId());
        System.out.println("nombre del equipo: " + equipo.getNombre());
        System.out.println("integrantes del equipo: ");
        for (Integrante integrante : equipo.getIntegrantesEquipo()) {
            System.out.println(integrante);
        }
        System.out.println("investigaciones del equipo: ");
        for (Investigacion investigacion : equipo.getInvestigaciones()) {
            System.out.println(investigacion);
        }
    }   

    public static void contarIngenieros(ArrayList<Equipo> equipos){
        //TODO contar ingenieros
        int contadorIngenieros = 0;
        //TODO recorrer los equipos y contar los ingenieros
        for (Equipo equipo : equipos) {
            for (Integrante integrante : equipo.getIntegrantesEquipo()) {
                if (integrante.getEspecialidad() == Especialidades.INGENIERIA){
                    contadorIngenieros++;
                }
            }
        }
        
        //TODO mostrar el resultado
        System.out.println("El numero de ingenieros es: " + contadorIngenieros);
    }

    public static void mostrarPresupuestoTotal(ArrayList<Equipo> equipos){
        //TODO mostrar presupuesto total
        double presupuestoTotal = 0.0;
        //TODO recorrer los equipos y sumar el presupuesto de las investigaciones
        for (Equipo equipo : equipos) {
            for (Investigacion investigacion : equipo.getInvestigaciones()) {
                presupuestoTotal += investigacion.getPresupuesto();
            }
        }
        //TODO mostrar el resultado
        System.out.println("El presupuesto total es: " + presupuestoTotal);
    }
}
