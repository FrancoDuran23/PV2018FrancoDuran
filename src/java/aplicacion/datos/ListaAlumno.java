/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.dominio.Alumno;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Franco Duran
 */
public class ListaAlumno implements Serializable{
    private ArrayList<Alumno> listaAlumno;

    public ListaAlumno() {
        listaAlumno=new ArrayList();
    }

    public ListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }
     public void modificarAlumno(Alumno unAlumno){
        for(Alumno a: listaAlumno){
            if(a.getDni().equals(unAlumno.getDni())){
                getListaAlumno().set(listaAlumno.indexOf(a), unAlumno);
                break;
            }
        }
    }
    
    public void eliminarAlumno(Alumno unAlumno){
        for(Alumno a: listaAlumno){
            if(a.getDni().equals(unAlumno.getDni())){   
                listaAlumno.remove(listaAlumno.indexOf(a));
                break;
            }
        }
    }
    public void agregarAlumno(Alumno unAlumno) {
        getListaAlumno().add(unAlumno);
    }

    /**
     * @return the listaAlumno
     */
    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    /**
     * @param listaAlumno the listaAlumno to set
     */
    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }
    
    
}
