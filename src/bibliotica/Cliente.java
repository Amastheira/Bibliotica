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
public class Cliente {
    
    private Persona Sergio;
    private int libros_pres;
    private double id_cli;

    public Cliente(Persona Sergio, int libros_pres, double id_cli) {
        this.Sergio = Sergio;
        this.libros_pres = libros_pres;
        this.id_cli = id_cli;
    }

    public Persona getSergio() {
        return Sergio;
    }

    public void setSergio(Persona Sergio) {
        this.Sergio = Sergio;
    }

    public int getLibros_pres() {
        return libros_pres;
    }

    public void setLibros_pres(int libros_pres) {
        this.libros_pres = libros_pres;
    }

    public double getId_cli() {
        return id_cli;
    }

    public void setId_cli(double id_cli) {
        this.id_cli = id_cli;
    }
   
    
}
