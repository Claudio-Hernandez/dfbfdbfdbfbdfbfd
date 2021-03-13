
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
public class astronautas implements Serializable {
/*
    Para hacer la simulación,el sistema debe hacer mantenimiento de astronautas. De ellos se conoce el ID, nombre, apellido, nacionalidad, 
    titulo universitario, contexturafísica,
    peso en kilogramos y cantidad de misiones que ha tenido previamente (cero, de forma predeterminada).
    
    
    */
    private static final long SerialVersionUID = 777L;
    private String ID;
    private String tituloUniversitario;
    private String contextTura;
    private String nombre;
    private double peso;
    private int NumeroDeMisiones=0;
     private String apellido;
    private String nacionalidad;

    public astronautas() {
    }

    public astronautas(String ID, String tituloUniversitario, String contextTura, String nombre, double peso, String apellido, String nacionalidad,int misiones) {
        this.ID = ID;
        this.tituloUniversitario = tituloUniversitario;
        this.contextTura = contextTura;
        this.nombre = nombre;
        this.peso = peso;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.NumeroDeMisiones= misiones;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    public String getContextTura() {
        return contextTura;
    }

    public void setContextTura(String contextTura) {
        this.contextTura = contextTura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumeroDeMisiones() {
        return NumeroDeMisiones;
    }

    public void setNumeroDeMisiones(int NumeroDeMisiones) {
        this.NumeroDeMisiones = NumeroDeMisiones;
    }
    

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

   /* @Override
    public String toString() {
        return "Astronautas:" + "\n   ID=" + ID + "\n   TituloUniversitario=" + tituloUniversitario + "\n   contextTura=" + contextTura + "\n   nombre=" + nombre + "\n   peso=" + peso + "\n   NumeroDeMisiones=" + NumeroDeMisiones + "\n   apellido=" + apellido + "\n   nacionalidad=" + nacionalidad ;
    }
*/

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    

}
