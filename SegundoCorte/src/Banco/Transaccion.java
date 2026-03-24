package Banco;

import java.time.LocalDate;
import java.time.LocalTime;

public record Transaccion (double valor, LocalTime hora, LocalDate fecha, TipoTransaccion tipo, Estado estado)
{
    @Override
    public String toString() {
        return "Transaccion{" +
                "valor=" + valor +
                ", hora=" + hora +
                ", fecha=" + fecha +
                ", tipo=" + tipo +
                ", estado=" + estado +
                '}';
    }
}