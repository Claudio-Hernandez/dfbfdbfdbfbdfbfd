
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Claudio Hernandez
 */
public class hilo1 extends Thread {

    private JProgressBar barrados;
    private boolean sigue;
    private naves nave;
    private planetas planeta;
    private boolean vive = true;
    private double distancia;

   public hilo1(JProgressBar barraPrincipal, naves nave, planetas planeta,boolean vive2,double distancia) {
        this.barrados = barraPrincipal;
        this.nave = nave;
        this.planeta = planeta;
        this.vive= vive2;
        this.distancia=distancia;
    }

    @Override
    public void run() {
        double combustible = nave.getCombustibleReserva();
        double combustiblepor = nave.getCombustiblePorKilometros();
        double velocidad = distancia;
        double distanciaP = planeta.getDistanciaLugaryTierra();
        double distanciaMaxNave = nave.getDistanciaMaxima();
        double distanciav = 0;
        barrados.setMaximum((int) combustible);
        barrados.setValue((int) combustible);

        while (vive) {

            if (!(velocidad>= distanciaMaxNave)) {
                distanciav = velocidad * distanciaP;

                if (barrados.getValue() > 0) {
                    barrados.setValue(((int) barrados.getValue() - (int) distanciav));
                    velocidad += velocidad;
                    //barraPrincipal.setValue(barraPrincipal.getValue() - 2);

                }
                if (barrados.getValue() <= 0) {
                    JOptionPane.showMessageDialog(null,"Tanque de reserva sin combustible mision fallida");
                    
                    vive = false;

                }
                if (velocidad >= distanciaP) {
                    JOptionPane.showMessageDialog(null, "Completada la mision");
                    vive = false;
                }

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(hiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }
}
