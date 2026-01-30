import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        // Esta es la identidad de tu empresa
        System.out.println("******************************************");
        System.out.println("* PLATAFORMA RUTA-APP V1.0 *");
        System.out.println("* SYSTEM GREGORY PC *");
        System.out.println("******************************************");

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("\nIngrese Usuario de Socio: ");
        String usuario = teclado.nextLine();

        System.out.print("Ingrese Clave de Seguridad: ");
        String clave = teclado.nextLine();

        // Validación simple para la demostración con el Director
        if (usuario.equals("presidente") && clave.equals("taxis2026")) {
            System.out.println("\n✅ ACCESO CONCEDIDO");
            System.out.println("Bienvenido al Panel de Control de la Flota.");
        } else {
            System.out.println("\n❌ ERROR: Usuario o Clave incorrectos.");
            System.out.println("El intento ha sido registrado por seguridad.");
        }
    }
}
