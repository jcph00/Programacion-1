

import java.util.ArrayList;

/**
 * Clase principal que controla el flujo del taller.
 * Contiene las listas globales y los métodos de registro y búsqueda.
 */
public class TallerBicicletas {
    private String nombreTaller;
    private String direccionTaller;
    private String nitTaller;

    // Listas globales según el diagrama (Rombos negros = Composición)
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Mecanico> listaMecanicos;
    private ArrayList<Orden> listaOrdenes;

    public TallerBicicletas(String nombre, String direccion, String nit) {
        this.nombreTaller = nombre;
        this.direccionTaller = direccion;
        this.nitTaller = nit;
        this.listaClientes = new ArrayList<>();
        this.listaMecanicos = new ArrayList<>();
        this.listaOrdenes = new ArrayList<>();
    }

    // --- MÉTODOS DE LÓGICA DEL DIAGRAMA ---

    public void registrarCliente(String nombre, String id, int tel, String dir) {
        Cliente nuevo = new Cliente(nombre, id, tel, dir);
        listaClientes.add(nuevo);
        System.out.println("Cliente registrado: " + nombre);
    }

    public Cliente buscarCliente(String id) {
        for (Cliente c : listaClientes) {
            if (c.getIdentificacion().equals(id)) {
                return c;
            }
        }
        return null; // No se encontró
    }

    public void vincularBicicleta(String idCli, String serial, String marca, String mod, String tipo) {
        Cliente c = buscarCliente(idCli);
        if (c != null) {
            Bicicleta nuevaBici = new Bicicleta(serial, marca, mod, tipo);
            c.agregarBicicleta(nuevaBici); // El método de Cliente hace la vinculación bidireccional
            System.out.println("Bicicleta vinculada a " + c.getNombre());
        } else {
            System.out.println("Error: Cliente no encontrado.");
        }
    }

    public void crearOrdenServicio(String serialBici, String descripcion) {
        // Primero buscamos la bicicleta en todos los clientes
        Bicicleta encontrada = null;
        for (Cliente c : listaClientes) {
            for (Bicicleta b : c.getListaBicicletas()) {
                if (b.getSerial().equals(serialBici)) {
                    encontrada = b;
                    break;
                }
            }
        }

        if (encontrada != null) {
            String idOrden = "ORD-" + (listaOrdenes.size() + 1);
            Orden nuevaOrden = new Orden(idOrden, "02/03/2026", descripcion, encontrada);
            listaOrdenes.add(nuevaOrden);
            System.out.println("Orden creada exitosamente: " + idOrden);
        } else {
            System.out.println("Error: No se encontró bicicleta con serial " + serialBici);
        }
    }

    // --- GETTERS ---
    public ArrayList<Mecanico> getListaMecanicos() { return listaMecanicos; }
    public ArrayList<Orden> getListaOrdenes() { return listaOrdenes; }
    public void imprimirCabecera() {
    System.out.println("-------------------------------------------");
    System.out.println("TALLER: " + nombreTaller);
    System.out.println("NIT: " + nitTaller + " | Dir: " + direccionTaller);
    System.out.println("-------------------------------------------");
}
}
