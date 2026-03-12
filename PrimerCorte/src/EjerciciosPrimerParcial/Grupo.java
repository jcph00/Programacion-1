package EjerciciosPrimerParcial;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    private List <Contacto> listaContactos;

    public Grupo (String nombre, Categoria categoria){
        this.nombre = nombre;
        this.categoria = categoria;
        this.listaContactos = new ArrayList<>();
    }
    public List<Contacto> getListaContactosGrupo(){
        return listaContactos;
    }

    public boolean verificarCategoria(Categoria categoriaBuscada){
        return this.categoria == categoriaBuscada;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grupo").append(nombre)
            .append("[Categoría: ").append(categoria).append("]\n");
            sb.append("Integrantes:\n");

            for (Contacto c : listaContactos){
                sb.append("- ").append(c.toString()).append("\n");
            }
            return sb.toString();            

    }

}
