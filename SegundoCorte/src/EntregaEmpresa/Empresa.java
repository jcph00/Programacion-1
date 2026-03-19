package EntregaEmpresa;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalTime;

public class Empresa {
    private String nombre;
    private List<Empleado> listaEmpleados;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }
    public String getNombre(){
        return this.nombre;
    }

    public void agregarEmpleado(Empleado empleado){
        this.listaEmpleados.add(empleado);
    }
    
    public ArrayList<Empleado> consultarEmpleadosTarde(LocalTime horaEntradaEmpresa){
        ArrayList<Empleado> resultado = new ArrayList<>();
        for (Empleado empleado : this.listaEmpleados){
            if (empleado.llegoTarde(horaEntradaEmpresa)){
                resultado.add(empleado);
            }
        }
        return resultado;
    }

    @Override
    public String toString(){
        return "Empresa: " + this.nombre;
    }
    
}
