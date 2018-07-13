/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.datos.ListaAlumno;
import aplicacion.dominio.Alumno;
import aplicacion.dominio.Materia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Franco Duran
 */
@ManagedBean
@ViewScoped
public class AlumnoFormBean implements Serializable{
      private int dni;
    private String apellido;
    private String nombre;
    private Date fechaNac;
    private String domicilio;
    private int telefono;
    private Materia materia;
    private ArrayList<Materia> listaMateria;
    private ListaAlumno listaAlumno;
    private Alumno unAlumno;
    private ListaAlumno listaAlumnoAux;
    private String auxApellido;
    

    /**
     * Creates a new instance of AlumnoFormBean
     */
    public AlumnoFormBean() {
        listaAlumno = new ListaAlumno();    
        listaMateria = new ArrayList();
        listaAlumnoAux=new ListaAlumno();
        listaMateria.add(new Materia(1,"Programacion Visual","APU","2do Informatica"));
        listaMateria.add(new Materia(2,"Algebra II","APU","2do Informatica"));
    }
   public void agregarAlumno(){
        getListaAlumno().getListaAlumno().add(new Alumno(getDni(),getApellido(),getNombre(),getFechaNac(),getDomicilio(),getTelefono(),getMateria()));
    }
     public void establecerAlumno(Alumno unAlumno){
        setUnAlumno(unAlumno);
    }
    public void modificarAlumno(){
         listaAlumno.modificarAlumno(unAlumno);    
    }
    public void eliminarAlumno(){
        listaAlumno.eliminarAlumno(unAlumno);
    }
     public void buscarAlumno() {
        for (int i = 0; i < getListaAlumno().getListaAlumno().size(); i++) {
            if (getListaAlumno().getListaAlumno().get(i).getApellido().equals(getAuxApellido())) {
                getListaAlumnoAux().getListaAlumno().add(getListaAlumno().getListaAlumno().get(i));
            }
        }
     }
      public void reinciar() {
        setListaAlumno(new ListaAlumno());
        setListaAlumnoAux(new ListaAlumno());
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaNac
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * @return the listaMateria
     */
    public ArrayList<Materia> getListaMateria() {
        return listaMateria;
    }

    /**
     * @param listaMateria the listaMateria to set
     */
    public void setListaMateria(ArrayList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    /**
     * @return the listaAlumno
     */
    public ListaAlumno getListaAlumno() {
        return listaAlumno;
    }

    /**
     * @param listaAlumno the listaAlumno to set
     */
    public void setListaAlumno(ListaAlumno listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    /**
     * @return the unAlumno
     */
    public Alumno getUnAlumno() {
        return unAlumno;
    }

    /**
     * @param unAlumno the unAlumno to set
     */
    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    /**
     * @return the listaAlumnoAux
     */
    public ListaAlumno getListaAlumnoAux() {
        return listaAlumnoAux;
    }

    /**
     * @param listaAlumnoAux the listaAlumnoAux to set
     */
    public void setListaAlumnoAux(ListaAlumno listaAlumnoAux) {
        this.listaAlumnoAux = listaAlumnoAux;
    }

    /**
     * @return the auxApellido
     */
    public String getAuxApellido() {
        return auxApellido;
    }

    /**
     * @param auxApellido the auxApellido to set
     */
    public void setAuxApellido(String auxApellido) {
        this.auxApellido = auxApellido;
    }
    
}
