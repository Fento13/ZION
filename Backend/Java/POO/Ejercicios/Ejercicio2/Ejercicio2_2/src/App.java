import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static final int LIMITE_USUARIOS = 10;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        
        do {
            mostrarMenu();
            opcion = obtenerOpcion();
            
            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    verNumeroUsuarios();
                    break;
                case 3:
                    eliminarUsuario();
                    break;
                case 4:
                    mostrarNicknameyContraseña();
                    break;
                case 5:
                    listarUsuariosPorTelefono();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENU DE GESTIÓN DE USUARIOS =====");
        System.out.println("1. Registrar un usuario nuevo");
        System.out.println("2. Ver el número de usuarios registrados");
        System.out.println("3. Eliminar un usuario");
        System.out.println("4. Mostrar nickname y contraseña fuerte");
        System.out.println("5. Listar usuarios por número de teléfono");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcion() {
        int opcion;
        try {
            opcion = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            opcion = -1;
        }
        return opcion;
    }

    private static void registrarUsuario() {
        // Verificar límite
        if (usuarios.size() >= LIMITE_USUARIOS) {
            System.out.println(" Límite de usuarios alcanzado (máximo: " + LIMITE_USUARIOS + ")");
            return;
        }

        System.out.println("\n===== REGISTRAR USUARIO =====");
        
        // Obtener nickname
        System.out.print("Nickname: ");
        String nickname = scanner.nextLine().trim();
        
        // Verificar que el nickname no exista
        if (existeNickname(nickname)) {
            System.out.println(" El nickname ya existe.");
            return;
        }
        
        // Obtener contraseña
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine().trim();
        
        // Obtener datos de la persona
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine().trim();
        
        System.out.print("Apellido 1: ");
        String apellido1 = scanner.nextLine().trim();
        
        System.out.print("Apellido 2: ");
        String apellido2 = scanner.nextLine().trim();
        
        System.out.print("Fecha de nacimiento (yyyy-MM-dd): ");
        LocalDate fechaNacimiento = null;
        try {
            fechaNacimiento = LocalDate.parse(scanner.nextLine().trim());
        } catch (Exception e) {
            System.out.println(" Formato de fecha inválido.");
            return;
        }
        
        // Crear persona y usuario
        Persona persona = new Persona(nombre, apellido1, apellido2, fechaNacimiento);
        Usuario usuario = new Usuario(nickname, contraseña, persona);
        
        // Agregar teléfonos
        System.out.println("Agregue números de teléfono (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine().trim();
            if (telefono.equalsIgnoreCase("fin")) {
                break;
            }
            if (!telefono.isEmpty()) {
                usuario.agregarTelefono(telefono);
            }
        }
        
        // Agregar emails
        System.out.println("Agregue emails (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Email: ");
            String email = scanner.nextLine().trim();
            if (email.equalsIgnoreCase("fin")) {
                break;
            }
            if (!email.isEmpty()) {
                usuario.agregarEmail(email);
            }
        }
        
        usuarios.add(usuario);
        System.out.println(" Usuario registrado correctamente.");
    }

    private static boolean existeNickname(String nickname) {
        for (Usuario u : usuarios) {
            if (u.getNickname().equalsIgnoreCase(nickname)) {
                return true;
            }
        }
        return false;
    }

    private static void verNumeroUsuarios() {
        System.out.println("\n===== NÚMERO DE USUARIOS =====");
        System.out.println("Total de usuarios registrados: " + usuarios.size() + "/" + LIMITE_USUARIOS);
    }

    private static void eliminarUsuario() {
        if (usuarios.isEmpty()) {
            System.out.println(" No hay usuarios registrados.");
            return;
        }

        System.out.println("\n===== ELIMINAR USUARIO =====");
        System.out.print("Ingrese el nickname del usuario a eliminar: ");
        String nickname = scanner.nextLine().trim();
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNickname().equalsIgnoreCase(nickname)) {
                usuarios.remove(i);
                System.out.println(" Usuario eliminado correctamente.");
                return;
            }
        }
        
        System.out.println(" Usuario no encontrado.");
    }

    private static void mostrarNicknameyContraseña() {
        if (usuarios.isEmpty()) {
            System.out.println(" No hay usuarios registrados.");
            return;
        }

        System.out.println("\n===== NICKNAMES Y FORTALEZA DE CONTRASEÑA =====");
        for (Usuario u : usuarios) {
            String fortaleza = u.esContraseñaFuerte() ? " Fuerte" : " Débil";
            System.out.println(u.getNickname() + " -> " + fortaleza);
        }
    }

    private static void listarUsuariosPorTelefono() {
        if (usuarios.isEmpty()) {
            System.out.println(" No hay usuarios registrados.");
            return;
        }

        System.out.println("\n===== BUSCAR USUARIOS POR TELÉFONO =====");
        System.out.print("Ingrese el número de teléfono a buscar: ");
        String telefonoBuscado = scanner.nextLine().trim();
        
        ArrayList<String> usuariosEncontrados = new ArrayList<>();
        
        for (Usuario u : usuarios) {
            for (String telefono : u.getTelefonosContacto()) {
                if (telefono.equals(telefonoBuscado)) {
                    usuariosEncontrados.add(u.getNickname());
                    break;
                }
            }
        }
        
        if (usuariosEncontrados.isEmpty()) {
            System.out.println(" No se encontraron usuarios con ese teléfono.");
        } else {
            System.out.println(" Usuarios encontrados:");
            for (String nickname : usuariosEncontrados) {
                System.out.println("  - " + nickname);
            }
        }
    }
}
