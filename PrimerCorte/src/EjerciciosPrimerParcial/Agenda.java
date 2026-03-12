package EjerciciosPrimerParcial;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> listaContactos;
    private List<Grupo> listaGrupos;

    public Agenda(){
        this.listaContactos = new ArrayList<>();
        this.listaGrupos = new ArrayList<>();
    }    
    
    public List<Contacto> obtenerContactosPorFiltro(String nombreBuscado, Categoria categoriaBuscada){
        List<Contacto> resultado = new ArrayList<>();

        for (Grupo g : listaGrupos){
            if (g.verificarCategoria(categoriaBuscada)){
                for (Contacto n : g.getListaContactosGrupo()){
                    if (n.verificarNombreInicial(nombreBuscado) && verificarEnLista(resultado, n)){
                        resultado.add(n);
                    }
                }
            }
        }

        return resultado;
    }

    //Esta fue mi solucion para verificar si mi contacto esta en una lista
    public boolean verificarContactoEnLista(){
        boolean flag = false;
        for (Contacto c : listaContactos){
            for (Grupo g : listaGrupos){
                for (Contacto n : g.getListaContactosGrupo()){
                    if (c.getTelefono().equals(n.getTelefono())){
                        flag = true;
                    }

                }
            }
        }
        return flag;
    }

    public boolean verificarEnLista(List<Contacto> lista , Contacto c){
        for (Contacto contactoEnLista : lista){
            if (contactoEnLista.getTelefono().equals(c.getTelefono())){
                return true;
            }
        }
        return false;
    }
}


    

