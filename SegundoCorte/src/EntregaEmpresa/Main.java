package EntregaEmpresa;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions");
        System.out.println(empresa + "\n");
        
        Empleado empleado1 = new Empleado("Juan Perez", "123456789", LocalTime.of(8, 30), LocalTime.of(17, 0));
        Empleado empleado2 = new Empleado("Maria Gomez", "987654321", LocalTime.of(9, 0), LocalTime.of(18, 0));
        Empleado empleado3 = new Empleado("Carlos Rodriguez", "456789123", LocalTime.of(7, 45), LocalTime.of(16, 30));
        
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        LocalTime horaEntradaEmpresa = LocalTime.of(8, 0);
        ArrayList<Empleado> empleadosTarde = empresa.consultarEmpleadosTarde(horaEntradaEmpresa);
        System.out.println("Hora de entrada de la empresa: " + horaEntradaEmpresa + "\n");
        System.out.println("Empleados que llegaron tarde: \n");
        for (Empleado empleado : empleadosTarde) {
            System.out.println(empleado);
        }

    }

}
