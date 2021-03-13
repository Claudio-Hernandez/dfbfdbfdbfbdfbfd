
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudio Hernandez
 */
public class planetas  implements Serializable{
    /*
    El lugar de destino(ya sea una luna o un planeta) consta de Nombre, 
    distancia que hay entre dicho lugar y la tierra(en kilómetros),
    tipo de superficie (rocosa, líquida o gasesosa), saturaciónde oxígeno(0 –100)
    */
    private static final long SerialVersionUID = 777L;

    private String nombre;
    private double distanciaLugaryTierra;
    private String tipoSuperficie;
    private int saturacion;

    public planetas() {
    }

    public planetas(String nombre, double distanciaLugaryTierra, String tipoSuperficie, int saturacion) {
        this.nombre = nombre;
        this.distanciaLugaryTierra = distanciaLugaryTierra;
        this.tipoSuperficie = tipoSuperficie;
        this.saturacion = saturacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistanciaLugaryTierra() {
        return distanciaLugaryTierra;
    }

    public void setDistanciaLugaryTierra(double distanciaLugaryTierra) {
        this.distanciaLugaryTierra = distanciaLugaryTierra;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public void setTipoSuperficie(String tipoSuperficie) {
        this.tipoSuperficie = tipoSuperficie;
    }

    public int getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(int saturacion) {
        this.saturacion = saturacion;
    }

    @Override
    public String toString() {
        return "Planeta :" + nombre ;
    }
    
    
}
