package GestionNomina;

public class EmpleadoPlanta extends Empleado {
    private String cargo;
    private int horasExtras;
    private float valorHoraExtra;
    private float auxilioTransporte;

    public EmpleadoPlanta(String nombre, String doucumento, int edad, float salarioBase, String cargo, CategoriaEmpleado categoria, int horasExtras, float valorHoraExtra, float auxilioTransporte) {
        super(nombre, doucumento, edad, salarioBase, categoria);
        this.cargo = cargo;
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
        this.auxilioTransporte = auxilioTransporte;
    }
    
    public String getCargo() {
        return cargo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public float getValorHoraExtra() {
        return valorHoraExtra;
    }

    public float getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setHorasExtras(int horasExtras) {
        if (horasExtras < 0) {
            throw new IllegalArgumentException("Las horas extras no pueden ser negativas.");
        }
        this.horasExtras = horasExtras;
    }

    public void setValorHoraExtra(float valorHoraExtra) {
        if (valorHoraExtra < 0) {
            throw new IllegalArgumentException("El valor de la hora extra no puede ser negativo.");
        }
        this.valorHoraExtra = valorHoraExtra;
    }

    public void setAuxilioTransporte(float auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public float calcularSalarioBruto() {
        return super.calcularSalarioBruto() + (horasExtras * valorHoraExtra) + auxilioTransporte; // Salario base más bonificación de categoría, horas extras y auxilio de transporte
    }

    @Override
    public String toString() {
        return "EmpleadoPlanta [cargo=" + cargo + ", horasExtras=" + horasExtras + ", valorHoraExtra=" + valorHoraExtra
                + ", auxilioTransporte=" + auxilioTransporte + "]";
    }
    
}
