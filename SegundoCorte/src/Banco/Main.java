package Banco;

public class Main {
    public static void main(String[] args) {
    Banco banco = new Banco("Bancolombia", "Calle 50");
    Cuenta cuenta = new Cuenta("001", 500000, null, banco);
    Cliente cliente = new Cliente("Juan", "123456", cuenta);
    banco.agregarCliente(cliente);

    try {
        banco.retirarDinero("123456", 200000);
        System.out.println("Retiro exitoso");
    } catch (IllegalStateException e) {
        System.out.println("Fondos insuficientes: " + e.getMessage());
    } catch (IllegalArgumentException e) {
        System.out.println("Datos inválidos: " + e.getMessage());
    } catch (RuntimeException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    
}
