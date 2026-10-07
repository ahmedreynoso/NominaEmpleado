public class Nomina {

    private int clave;
    private String nombre;
    private int horasTrabajadas;
    private int pagoPorHora;

    public Nomina(int clave, String nombre, int horasTrabajadas, int pagoPorHora) {
        this.clave = clave;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasCalculadas(){
        if(horasTrabajadas > 50);{
            horasTrabajadas = 50;
        }
        return horasTrabajadas;
    }

    public int calcularHorasNormales(){
        int horasNormales = 0;
        if (horasTrabajadas > 40) {
            horasNormales = 40;
        }else {
            horasNormales = horasTrabajadas;
        }
        return  horasNormales;
    }
    public int calcularHorasExtra(){
        int horasExtra = 0;
        if(horasTrabajadas > 40){
            horasExtra = horasTrabajadas - 40;
        }
        return horasExtra;
    }

    public double calcularPagoNormal(){
        double pagoNormal = 0;
        pagoNormal = calcularHorasNormales() * pagoPorHora;
        return pagoNormal;
    }

    public double calcularPagoExtra(){
        double pagoExtra = 0;
        pagoExtra = calcularHorasExtra() * (pagoPorHora * 2 );
        return pagoExtra;
    }

    public double calcularPagoTotal(){
        double pagoTotal = 0;
        pagoTotal = calcularPagoNormal() + calcularPagoExtra();
        return pagoTotal;
    }


}
