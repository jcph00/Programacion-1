package Banco;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private List<Transaccion> transacciones;
    private Cliente cliente;
    private Banco ownedByBanco;

    public Cuenta(String numeroCuenta, double saldo, Cliente cliente, Banco ownedByBanco) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.transacciones = new ArrayList<>();
        this.cliente = cliente;
        this.ownedByBanco = ownedByBanco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    // Método privado para no repetir la lógica de registro
    private void registrarTransaccion(double valor, TipoTransaccion tipo, Estado estado) {
        Transaccion tr = new Transaccion(valor, LocalTime.now(), LocalDate.now(), tipo, estado);
        this.transacciones.add(tr);
    }

    public void depositarDinero(double monto, double montoLimite) {
        if (monto <= 0) {
            registrarTransaccion(monto, TipoTransaccion.DEPOSITAR, Estado.RECHAZADA);
            throw new IllegalArgumentException("Valor inválido.");
        }
        if (monto > montoLimite) {
            registrarTransaccion(monto, TipoTransaccion.DEPOSITAR, Estado.RECHAZADA);
            throw new IllegalArgumentException("Valor excede monto límite.");
        }
        saldo += monto;
        registrarTransaccion(monto, TipoTransaccion.DEPOSITAR, Estado.EXITOSA);
    }

    public void retirarDinero(double monto, double montoLimite) {
        if (monto <= 0) {
            registrarTransaccion(monto, TipoTransaccion.RETIRAR, Estado.RECHAZADA);
            throw new IllegalArgumentException("Valor inválido.");
        }
        if (monto > montoLimite) {
            registrarTransaccion(monto, TipoTransaccion.RETIRAR, Estado.RECHAZADA);
            throw new IllegalArgumentException("Valor excede monto límite.");
        }
        if (monto > saldo) {
            registrarTransaccion(monto, TipoTransaccion.RETIRAR, Estado.SIN_FONDOS);
            throw new IllegalStateException("Saldo insuficiente.");
        }
        saldo -= monto;
        registrarTransaccion(monto, TipoTransaccion.RETIRAR, Estado.EXITOSA);
    }

/*
    public String depositarDInero(double dineroDepositado, double montoLimite){
        String resultado = " ";
        Transaccion tr = new Transaccion();
        tr.setValor(dineroDepositado);
        tr.setHora(LocalTime.now());
        tr.setFecha(LocalDate.now());
        tr.setTipoTtransaccion(TipoTransaccion.DEPOSITAR);
        if (dineroDepositado<=0){
            resultado = "Valor invalido.";
            tr.setEstado(Estado.RECHAZADA);
            this.transacciones.add(tr);
            return resultado;
        } else if(dineroDepositado>montoLimite){
            resultado = "Valor excede monto límite.";
            tr.setEstado(Estado.RECHAZADA);
            this.transacciones.add(tr);
            return resultado;
        } else {
            saldo = saldo + dineroDepositado;
            resultado = "Transaccion exitosa";
            tr.setEstado(Estado.EXITOSA);
            this.transacciones.add(tr);
            return resultado;
        }        
    }

    public String retirarDinero(double dineroRetirado, double montoLimite){
        String resultado = " ";
        Transaccion tr = new Transaccion();
        tr.setValor(dineroRetirado);
        tr.setHora(LocalTime.now());
        tr.setFecha(LocalDate.now());
        tr.setTipoTtransaccion(TipoTransaccion.RETIRAR);
        if (dineroRetirado<=0){
            resultado = "Valor invalido.";
            tr.setEstado(Estado.RECHAZADA);
            this.transacciones.add(tr);
            return resultado;
        } else if(dineroRetirado>montoLimite){
            resultado = "Valor excede monto límite.";
            tr.setEstado(Estado.RECHAZADA);
            this.transacciones.add(tr);
            return resultado;
        } else if (dineroRetirado>saldo){
            resultado = "Saldo insuficiente.";
            tr.setEstado(Estado.SIN_FONDOS);
            this.transacciones.add(tr);
            return resultado;
        } else {
            saldo = saldo - dineroRetirado;
            resultado = "Transaccion exitosa";
            tr.setEstado(Estado.EXITOSA);
            this.transacciones.add(tr);
            return resultado;
        }
    }
*/

    @Override
    public String toString() {
        return "Cuenta: " + this.numeroCuenta + ", Saldo: " + this.saldo;
    }
}
