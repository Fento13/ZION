import java.time.LocalDate;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        LocalDate fechaNacimiento1 = LocalDate.of(2003,7, 2);
        LocalDate fechaNacimiento2 = LocalDate.of(1995,9, 3);
        LocalDate fechaNacimiento3 = LocalDate.of(2000,2, 4);
        Persona persona1 = new Persona("Juan", "Perez", "Gomez", "123456B", fechaNacimiento1);
        Persona persona2 = new Persona("Paco", "Garcia", "Rodriguez", "789123N", fechaNacimiento2);
        Persona persona3 = new Persona("Maria", "De la sierra", "Lorca", "4567789W", fechaNacimiento3);       
        Cuenta cuenta1 = new Cuenta("ES12345678901234567890", 1000.0, new Persona[]{persona1, persona2});
        Cuenta cuenta2 = new Cuenta("ES09876543210987654321", 500.0, new Persona[]{persona3});  
        Cuenta cuenta3 = new Cuenta("ES11223344556677889900", 200.0, new Persona[]{persona1});  

        for (Cuenta cuenta : new Cuenta[]{cuenta1, cuenta2, cuenta3}) {
            System.out.println(cuenta);
        }
        
            System.out.println("--------------------------------------------------");
            for (Persona persona : new Persona[]{persona1, persona2, persona3}) {
                System.out.println(persona);
            }
            
    cuenta1.ingresarDinero(500);                                                                                                                                                                                                                                                                                                                                                                                                      
    cuenta2.retirarDinero(10);
    cuenta1.transferirDinero(cuenta3, 100);
    }
}
