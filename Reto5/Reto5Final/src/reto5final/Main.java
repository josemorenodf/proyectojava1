/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5final;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Manuel",2500000);
        double costoEmpleado = (Banco.costoEmpleadoParaLaEmpresa(empleado1));
        System.out.println(costoEmpleado);
    }
}