/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

/**
 *
 * @author Franco Duran
 */
public class Materia {
    private Integer codigo;
    private String denominacion;
    private String carrera;
    private String añoCur;

    public Materia() {
    }

    public Materia(Integer codigo, String denominacion, String carrera, String añoCur) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.carrera = carrera;
        this.añoCur = añoCur;
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the añoCur
     */
    public String getAñoCur() {
        return añoCur;
    }

    /**
     * @param añoCur the añoCur to set
     */
    public void setAñoCur(String añoCur) {
        this.añoCur = añoCur;
    }
      @Override
    public boolean equals(Object obj) {
        return(obj instanceof Materia) && (codigo!=null)? codigo.equals(((Materia)obj).codigo):(obj==this);
    }

    @Override
    public int hashCode() {
        return(codigo!=null)? (this.getClass().hashCode()+codigo.hashCode()):super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s %s",denominacion,carrera,añoCur);
    }
    
}
