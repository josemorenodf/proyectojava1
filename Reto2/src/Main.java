public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Manuel",2500000);

        double prestaciones = (Banco.liquidarPrestacionesEmp(empleado1));
        double seguridadSocial = (Banco.liquidarSegSocialEmp(empleado1));

        System.out.println(prestaciones);
        System.out.println(seguridadSocial);
    }
}