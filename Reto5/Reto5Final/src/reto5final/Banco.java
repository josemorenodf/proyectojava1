/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5final;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Banco {
    
    ArrayList<Empleado> empleados = new ArrayList<>();
    
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
        double nomina = empleado.getSalario() - (psalud + ppension) * empleado.getSalario();
        return nomina;
    }

    public static double liquidarParafiscalesEmp (Empleado empleado){
        double pCompFamiliar = 0.04; // Porcentaje Caja de Compensación Familiar
        double pICBF = 0.03; // Porcentaje ICBF
        double pSENA = 0.02; // Porcentaje SENA
        double parafiscales = (pCompFamiliar + pICBF + pSENA) * empleado.getSalario();
        return parafiscales;
    }
    public static double costoEmpleadoParaLaEmpresa(Empleado empleado){
        double prestaciones = liquidarPrestacionesEmp(empleado);
        double seguridadSocial = liquidarSegSocialEmp(empleado);
        double nomina = liquidarNominaEmp(empleado);
        double parafiscales = liquidarParafiscalesEmp(empleado);
        double costoEmpleado = prestaciones + seguridadSocial + nomina + parafiscales;
        return costoEmpleado;
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
