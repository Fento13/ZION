import java.util.ArrayList;
import java.util.regex.Pattern;

public class Usuario {
    private String nickname;
    private String contraseña;
    private Persona personaAsociada;
    private ArrayList<String> telefonosContacto;
    private ArrayList<String> emails;

    // Constructor
    public Usuario(String nickname, String contraseña, Persona personaAsociada) {
        this.nickname = nickname;
        this.contraseña = contraseña;
        this.personaAsociada = personaAsociada;
        this.telefonosContacto = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    // Getters
    public String getNickname() {
        return nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Persona getPersonaAsociada() {
        return personaAsociada;
    }

    public ArrayList<String> getTelefonosContacto() {
        return telefonosContacto;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    // Método para agregar teléfono
    public void agregarTelefono(String telefono) {
        if (telefono != null && !telefono.isEmpty()) {
            telefonosContacto.add(telefono);
        }
    }

    // Método para agregar email
    public void agregarEmail(String email) {
        if (email != null && !email.isEmpty()) {
            emails.add(email);
        }
    }

    // Método para cambiar contraseña
    public boolean cambiarContraseña(String contraseñaActual, String contraseñaNueva1, String contraseñaNueva2) {
        // Verificar que la contraseña actual es correcta
        if (!this.contraseña.equals(contraseñaActual)) {
            return false;
        }
        
        // Verificar que la nueva contraseña es distinta a la actual
        if (contraseñaActual.equals(contraseñaNueva1)) {
            return false;
        }
        
        // Verificar que las 2 nuevas contraseñas coinciden
        if (!contraseñaNueva1.equals(contraseñaNueva2)) {
            return false;
        }
        
        // Cambio exitoso
        this.contraseña = contraseñaNueva1;
        return true;
    }

    // Método para verificar si la contraseña es fuerte
    public boolean esContraseñaFuerte() {
        // Al menos 8 caracteres
        if (contraseña.length() < 8) {
            return false;
        }
        
        // Al menos 1 dígito
        if (!Pattern.compile("[0-9]").matcher(contraseña).find()) {
            return false;
        }
        
        // Al menos 1 mayúscula
        if (!Pattern.compile("[A-Z]").matcher(contraseña).find()) {
            return false;
        }
        
        // Al menos 1 minúscula
        if (!Pattern.compile("[a-z]").matcher(contraseña).find()) {
            return false;
        }
        
        // Al menos 1 símbolo especial ($, %, @, #, &)
        if (!Pattern.compile("[$%@#&]").matcher(contraseña).find()) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nickname='" + nickname + '\'' +
                ", personaAsociada=" + personaAsociada +
                ", telefonosContacto=" + telefonosContacto +
                ", emails=" + emails +
                '}';
    }
}
