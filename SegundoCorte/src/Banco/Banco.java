package Banco;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

public class Banco {    
    private String nombre;
    private String direccion;
    private List<Cuenta> cuentas;
    private List<Transaccion> transacciones;
    private List<Cliente> listaClientes;

    public Banco(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
        this.transacciones = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void agregarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }
        listaClientes.add(cliente);
    }

    public Cliente buscarCliente(String identificacion){
        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.cedula().equals(identificacion)) {
                return cliente;
            }
        }
        return clienteEncontrado;
    }

    public Optional<Cliente> buscarClienteOptional(String identificacion) {
        return listaClientes.stream()
                .filter(cliente -> cliente.cedula().equals(identificacion))
                .findFirst();
    }

    public void retirarDinero(String identificacion, double valorRetiro) {
    Cliente clienteEncontrado = buscarCliente(identificacion);
    if (clienteEncontrado == null) {
        throw new RuntimeException("El cliente no está registrado");
    }
    if (clienteEncontrado.cuenta() == null) {
        throw new RuntimeException("El cliente no tiene una cuenta asociada");
    }
    // Delega la operación a Cuenta, que maneja sus propias excepciones
    clienteEncontrado.cuenta().retirarDinero(valorRetiro, 1000000);
    }

    public void depositarDinero(String identificacion, double valorDeposito) {
        Cliente clienteEncontrado = buscarCliente(identificacion);
        if (clienteEncontrado == null) {
            throw new RuntimeException("El cliente no está registrado");
        }
        if (clienteEncontrado.cuenta() == null) {
            throw new RuntimeException("El cliente no tiene una cuenta asociada");
        }
        // Delega la operación a Cuenta
        clienteEncontrado.cuenta().depositarDinero(valorDeposito, 1000000);
    }
    /*
    public String retirarDinero(String identificacion, double valorRetiro){

        Cliente clienteEncontrado = buscarCliente(identificacion);
        if(clienteEncontrado == null){
            throw new RuntimeException("El cliente no esta registrado");
        }
        Cuenta cuenta = clienteEncontrado.getCuenta();
        return cuenta.retirarDinero(valorRetiro, 1000000);
    }

    
    */

    @Override
    public String toString() {
        return "Banco: " + this.nombre + ", Direccion: " + this.direccion;
    }

    
}
