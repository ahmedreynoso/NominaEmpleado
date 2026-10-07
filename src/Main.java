import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Nomina de Empleados");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la clave: ");
        int clave = entrada.nextInt();

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.next();

        System.out.print("Ingrese las horas trabajadas: ");
        float horasTrabajadas = entrada.nextFloat();

        System.out.print("Ingrese el pago por hora: ");
        float pagoPorHora = entrada.nextFloat();
        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);
    }
}

