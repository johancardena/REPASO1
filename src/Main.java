import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cedula del estudiante: ");
        String cedula = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula);

        System.out.println("Estudiante ingresado: " + estudiante);
    }
}
