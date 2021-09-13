public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Manuel",2500000);

        double nomina = (Banco.liquidarNominaEmp(empleado1));
        double parafiscales = (Banco.liquidarParafiscalesEmp(empleado1));

        System.out.println(nomina);
        System.out.println(parafiscales);
    }
}
