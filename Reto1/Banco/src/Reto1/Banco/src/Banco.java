import java.text.DecimalFormat;

public class Banco {

    public static double liquidarPrestaciones(int salario, int comision, int auxilioTransporte){
        double total_devengado;
        double calculo_prima;
        double calculo_cesantias;
        double calculo_intereses;
        double calculo_vacaciones;

        double prima = 0.0833;
        double cesantias = 0.0833;
        double intereses_cesantias = 0.12;
        double vacaciones = 0.0416;
        double total_prestaciones;

        total_devengado = salario + comision + auxilioTransporte;
        calculo_prima = total_devengado*prima;
        calculo_cesantias = total_devengado*cesantias;
        calculo_intereses = calculo_cesantias*intereses_cesantias;
        calculo_vacaciones = salario*vacaciones;
        total_prestaciones = calculo_prima + calculo_cesantias + calculo_intereses + calculo_vacaciones;              
        
        return total_prestaciones;

    }

    public static void main(String[] args) {
        int salario = 1800000;
        int comision = 300000;
        int auxilioTransporte = 106454;
        double resultado;

        resultado = liquidarPrestaciones(salario, comision, auxilioTransporte);
        DecimalFormat df = new DecimalFormat("###.#");

        String liquidacion = df.format(resultado);
        System.out.println(liquidacion);
    }        
}