
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
public class naves  implements Serializable{
    /*De las naves se conoce suNombre, Identificador,cantidadmáximade personas, tiempo de despegue,
    astronautas que lleva a bordo, tiempo de aterrizaje, velocidad a la que viaja (en km/h),
    distanciamáxima a la que puede viajar, cantidad de 
    combustible que se gasta por kilometro (en litros),
    y cantidad de combustible en el tanque de reserva (en litros). */
        private static final long SerialVersionUID = 777L;
        private int numeroDeAstronautas;
        private String nombre,identificador;
        private double tiempoDespegue,tiempoDeAterrizaje,velocidadViaja,distanciaMaxima,combustiblePorKilometros,combustibleTanquePrincipal,combustibleReserva;

    public naves() {
    }

    public naves(int numeroDeAstronautas, String nombre, String identificador, double tiempoDespegue, double tiempoDeAterrizaje, double velocidadViaja, double distanciaMaxima, double combustiblePorKilometros, double combustibleTanquePrincipal, double combustibleReserva) {
        this.numeroDeAstronautas = numeroDeAstronautas;
        this.nombre = nombre;
        this.identificador = identificador;
        this.tiempoDespegue = tiempoDespegue;
        this.tiempoDeAterrizaje = tiempoDeAterrizaje;
        this.velocidadViaja = velocidadViaja;
        this.distanciaMaxima = distanciaMaxima;
        this.combustiblePorKilometros = combustiblePorKilometros;
        this.combustibleTanquePrincipal = combustibleTanquePrincipal;
        this.combustibleReserva = combustibleReserva;
    }

    public int getNumeroDeAstronautas() {
        return numeroDeAstronautas;
    }

    public void setNumeroDeAstronautas(int numeroDeAstronautas) {
        this.numeroDeAstronautas = numeroDeAstronautas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getTiempoDespegue() {
        return tiempoDespegue;
    }

    public void setTiempoDespegue(double tiempoDespegue) {
        this.tiempoDespegue = tiempoDespegue;
    }

    public double getTiempoDeAterrizaje() {
        return tiempoDeAterrizaje;
    }

    public void setTiempoDeAterrizaje(double tiempoDeAterrizaje) {
        this.tiempoDeAterrizaje = tiempoDeAterrizaje;
    }

    public double getVelocidadViaja() {
        return velocidadViaja;
    }

    public void setVelocidadViaja(double velocidadViaja) {
        this.velocidadViaja = velocidadViaja;
    }

    public double getDistanciaMaxima() {
        return distanciaMaxima;
    }

    public void setDistanciaMaxima(double distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public double getCombustiblePorKilometros() {
        return combustiblePorKilometros;
    }

    public void setCombustiblePorKilometros(double combustiblePorKilometros) {
        this.combustiblePorKilometros = combustiblePorKilometros;
    }

    public double getCombustibleTanquePrincipal() {
        return combustibleTanquePrincipal;
    }

    public void setCombustibleTanquePrincipal(double combustibleTanquePrincipal) {
        this.combustibleTanquePrincipal = combustibleTanquePrincipal;
    }

    public double getCombustibleReserva() {
        return combustibleReserva;
    }

    public void setCombustibleReserva(double combustibleReserva) {
        this.combustibleReserva = combustibleReserva;
    }

    /*@Override
    public String toString() {
        return "nave : " +nombre+ "\n   numerocDe Astronautas = " + numeroDeAstronautas + "\n    identificador=" + identificador + "\n   tiempoDespegue=" + tiempoDespegue + "\n   tiempoDeAterrizaje=" + tiempoDeAterrizaje + "\n   velocidad a la que Viaja=" + velocidadViaja + "\n   distancia Maxima que recorre=" + distanciaMaxima + "\n   combustible Por Kilometros=" + combustiblePorKilometros + ", combustible Tanque Principal=" + combustibleTanquePrincipal + ", combustible Reserva=" + combustibleReserva;
    }
*/

    @Override
    public String toString() {
        return  nombre;
    }
    
        
        

}
