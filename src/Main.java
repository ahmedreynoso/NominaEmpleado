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

        System.out.println("================================");
        System.out.println("        RECIBO DE NOMINA        ");
        System.out.println("================================");
        System.out.println("Clave: "+ clave);
        System.out.println("Emplado: "+ nombre);
        System.out.println("Horas trabajadas en total: " + nominaEmpleado.getHorasCalculadas());
        System.out.println("Horas normales: " + nominaEmpleado.calcularHorasNormales());
        System.out.println("Horas extra: " + nominaEmpleado.calcularHorasExtra());
        System.out.println("Pago por hora: "+ pagoPorHora);
        System.out.println("Pago normal: " + nominaEmpleado.calcularPagoNormal());
        System.out.println("Pago extra: " + nominaEmpleado.calcularPagoExtra());
        System.out.println("--------------------------------");
        System.out.println("Pago total: " + nominaEmpleado.calcularPagoTotal());
        System.out.println("================================");
        if(horasTrabajadas > 50){
            System.out.println("Nota: solo se consideran 50 horas trabajadas por normas de la empresa.");
        }

    }
}

