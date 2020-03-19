/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotica;

public class Adeudo {
    private int dias;
    private double costo;
    private int retraso;

    public Adeudo(int dias, double costo, int retraso) {
        this.dias = dias;
        this.costo = costo;
        this.retraso = retraso;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }
    
    
}
