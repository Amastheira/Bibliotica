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
public class Prestamo {
    private int dias_prestamo;
    private int libro_prestado;
    private double costo;
    private Libro tiburon;
    private Cliente alejandro;

    public Prestamo(int dias_prestamo, int libro_prestado, double costo, Libro tiburon, Cliente alejandro) {
        this.dias_prestamo = dias_prestamo;
        this.libro_prestado = libro_prestado;
        this.costo = costo;
        this.tiburon = tiburon;
        this.alejandro = alejandro;
    }

    public int getDias_prestamo() {
        return dias_prestamo;
    }

    public void setDias_prestamo(int dias_prestamo) {
        this.dias_prestamo = dias_prestamo;
    }

    public int getLibro_prestado() {
        return libro_prestado;
    }

    public void setLibro_prestado(int libro_prestado) {
        this.libro_prestado = libro_prestado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Libro getTiburon() {
        return tiburon;
    }

    public void setTiburon(Libro tiburon) {
        this.tiburon = tiburon;
    }

    public Cliente getAlejandro() {
        return alejandro;
    }

    public void setAlejandro(Cliente alejandro) {
        this.alejandro = alejandro;
    }
    
    
}

