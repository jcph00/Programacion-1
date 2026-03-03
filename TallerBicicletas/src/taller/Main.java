
public class Main {
    public static void main(String[] args) {
        // 1. Inicializar el Taller
        TallerBicicletas miTaller = new TallerBicicletas("Eco-Bikes", "Calle 10 # 5-20", "900.123.456-1");

        // 2. Registrar un Cliente
        // (nombre, id, telefono, direccion)
        miTaller.registrarCliente("Juan Perez", "102030", 31055566, "Av. Central 123");

        // 3. Vincular una Bicicleta al cliente creado
        // (idCli, serial, marca, modelo, tipo)
        miTaller.vincularBicicleta("102030", "SN-9988", "Specialized", "Rockhopper", "Montaña");

        // 4. Registrar un Mecánico
        Mecanico mec1 = new Mecanico("Carlos Garcia", "75842", "MEC-01");
        miTaller.getListaMecanicos().add(mec1);

        // 5. Crear una Orden de Servicio para la bicicleta serial SN-9988
        miTaller.crearOrdenServicio("SN-9988", "Frenos largos y ruido en la cadena");

        // 6. Configurar la Orden (Simulando que ya sabemos que es la primera orden de la lista)
        if (!miTaller.getListaOrdenes().isEmpty()) {
            Orden ordenActual = miTaller.getListaOrdenes().get(0);
            
            // Asignar el mecánico que creamos
            ordenActual.asignarResponsable(mec1);
            
            // Agregar Repuestos
            ordenActual.adicionarRepuesto("Pastillas Freno", 2, 25000);
            ordenActual.adicionarRepuesto("Lubricante Seco", 1, 15000);
            
            // Agregar Tareas
            ordenActual.adicionarTarea("Ajuste Frenos", "Limpieza de discos y cambio de pastillas");
            ordenActual.adicionarTarea("Lubricacion", "Limpieza profunda de transmision");
            
            // Definir mano de obra y actualizar estado
            ordenActual.setCostoManoObra(30000);
            ordenActual.setEstado("En Taller");

            // 7. MOSTRAR RESULTADOS
            System.out.println("\n===========================================");
            System.out.println("      REPORTE DE SERVICIO - " + miTaller.getListaOrdenes().get(0).getEstado());
            System.out.println("===========================================");
            System.out.println(ordenActual.toString());
            System.out.println("-------------------------------------------");
            System.out.println("Detalle de la Bici: " + ordenActual.getBicicleta().toString());
            System.out.println("-------------------------------------------");
            System.out.println("Responsable: " + mec1.toString());
            System.out.println("Liquidación Final: $" + ordenActual.calcularLiquidacion());
            System.out.println("===========================================");
        }
    }
}
