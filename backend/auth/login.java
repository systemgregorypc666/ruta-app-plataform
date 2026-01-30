import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Credenciales de prueba para el Director
        String usuarioCorrecto = "admin_ruta";
        String claveCorrecta = "Ruta2026";

        System.out.println("--- SYSTEM GREGORY PC: ACCESO SEGURO ---");
        System.out.print("Usuario: ");
        String user = input.nextLine();
        
        System.out.print("Clave: ");
        String pass = input.nextLine();

        if (user.equals(usuarioCorrecto) && pass.equals(claveCorrecta)) {
            System.out.println("ACCESO CONCEDIDO. Bienvenido a Ruta-App.");
        } else {
            System.out.println("ERROR: Credenciales inválidas. Sistema bloqueado.");
        }
    }
}
