import java.util.ArrayList;

public class Banco extends Empleado {
    ArrayList<Empleado> empleados = new ArrayList<>();

    public Banco(String nombre, int salario) {
        super(nombre,salario);
    }

    public static double liquidarPrestacionesEmp(Empleado empleado){
        double prima;
        double cesantias;
        double interesesCesantias;
        double vacaciones;

        prima = empleado.getSalario() * 0.0833;
        cesantias = empleado.getSalario() * 0.0833;
        interesesCesantias = cesantias * 0.12;
        vacaciones = empleado.getSalario() * 0.0416;
        double prestaciones = prima + cesantias + interesesCesantias + vacaciones;
        return prestaciones;
    }

    public static double liquidarSegSocialEmp(Empleado empleado){
        double salud;
        double pension;
        double arl;
        salud = empleado.getSalario() * 0.085;
        pension = empleado.getSalario() * 0.12;
        arl = empleado.getSalario() * 0.0052; // 0.0052 en vez de 0.00522
        double seguridadSocial = salud + pension + arl;
        return seguridadSocial;
    }

    public static double liquidarNominaEmp(Empleado empleado){
        double psalud = 0.04; // Porcentaje salud
        double ppension = 0.04; // Porcentaje pension
        double total = empleado.getSalario() - (psalud + ppension) * empleado.getSalario();
        return Math.round(total);
    }

    public static double liquidarParafiscalesEmp (Empleado empleado){
        double pCompFamiliar = 0.04; // Porcentaje Caja de Compensación Familiar
        double pICBF = 0.03; // Porcentaje ICBF
        double pSENA = 0.02; // Porcentaje SENA
        double total = (pCompFamiliar + pICBF + pSENA) * empleado.getSalario();
        return Math.round(total);
    }
}