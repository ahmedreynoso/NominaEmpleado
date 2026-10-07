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
        int horasTrabajadas = entrada.nextInt();

        System.out.print("Ingrese el pago por hora: ");
        int pagoPorHora = entrada.nextInt();
        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);

        System.out.println(nominaEmpleado.getHorasCalculadas());
        System.out.println(nominaEmpleado.calcularHorasNormales());
        System.out.println(nominaEmpleado.calcularHorasExtra());
        System.out.println(nominaEmpleado.calcularPagoNormal());
        System.out.println(nominaEmpleado.calcularPagoExtra());
        System.out.println(nominaEmpleado.calcularPagoTotal());

    }
}

