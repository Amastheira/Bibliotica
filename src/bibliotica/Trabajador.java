/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotica;

/**
 *
 * @author marka
 */
public class Trabajador extends Persona{
    private Persona pancho;
    private int antiguedad;
    private String id_trabajador;
    private Boolean seguro;

    public Trabajador(Persona pancho, int antiguedad, String id_trabajador, Boolean seguro) {
        this.pancho = pancho;
        this.antiguedad = antiguedad;
        this.id_trabajador = id_trabajador;
        this.seguro = seguro;
    }

    public Persona getPancho() {
        return pancho;
    }

    public void setPancho(Persona pancho) {
        this.pancho = pancho;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(String id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }
    
    
}
