package GestionNomina;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Empresa {
    private List<Empleado> empleados;
    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public String registrarEmpleado(Empleado empleado) {
        if (empleados.stream().anyMatch(e -> e.getDoucumento().equals(empleado.getDoucumento()))) {
            return "Error: Ya existe un empleado con el mismo documento.";
        }
        empleados.add(empleado);
        return "Empleado registrado exitosamente.";
    }
    
    public Optional<Empleado> buscarEmpleadoPorDocumento(String documento) {
        return empleados.stream()
                .filter(e -> e.getDoucumento().equals(documento))
                .findAny();
    }

    public Optional<Empleado> buscarEmpleadoMayorSalario() {
        return empleados.stream()
                .max((e1, e2) -> Float.compare(e1.calcularSalarioBruto(), e2.calcularSalarioBruto()));
    }

    public float calcularNominaEmpresa() {
        return (float) empleados.stream()
                .mapToDouble(Empleado::calcularSalarioBruto)
                .sum();
    }    
}



