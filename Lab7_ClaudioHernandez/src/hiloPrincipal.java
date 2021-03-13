
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
public class hiloPrincipal extends Thread {

    private JProgressBar barraPrincipal;
    private JProgressBar barrareserva;
    private naves nave;
    private planetas planeta;
    private boolean vive = true;
    private boolean vive2 = true;
    private double distancia;

    public hiloPrincipal(JProgressBar barraPrincipal,JProgressBar barraR, naves nave, planetas planeta,boolean vive2,double distancia) {
        this.barraPrincipal = barraPrincipal;
        this.barrareserva = barraR;
        this.nave = nave;
        this.planeta = planeta;
        this.vive2= vive2;
        this.distancia=distancia;
    }

    @Override
    public void run() {
        double combustible = nave.getCombustibleTanquePrincipal();
        double combustiblepor = nave.getCombustiblePorKilometros();
        double velocidad = nave.getVelocidadViaja();
        double distanciaP = planeta.getDistanciaLugaryTierra();
        double distanciaMaxNave = nave.getDistanciaMaxima();
        double distanciav = 0;
        
        barraPrincipal.setMaximum((int)combustible);
        barraPrincipal.setValue((int)combustible);

        while (vive) {
            
            if (!(velocidad>=distanciaMaxNave)) {
                distanciav = velocidad*distanciaP;

                if (barraPrincipal.getValue()>0) {
                     barraPrincipal.setValue(((int)barraPrincipal.getValue()-(int)distanciav));
                     velocidad+=velocidad;
                     distancia=velocidad;
                    //barraPrincipal.setValue(barraPrincipal.getValue() - 2);

                }
                if (barraPrincipal.getValue()<=0) {
                  int opccion = Integer.parseInt(JOptionPane.showInputDialog("Tanque principal sin combustible\n1. usar tanque de reserva\n2.No usar tanque de reserva"));
                    if (opccion==1) {
                        vive2=true;
                        hilo1 hiloR = new hilo1(barrareserva, nave, planeta,vive,velocidad);
                        hiloR.start();
                        
                    }else if (opccion==2) {
                        JOptionPane.showMessageDialog(null," mision fallida");

                        vive2=false;
                    }
                 vive=false;

                }
                if (velocidad>=distanciaP) {
                    JOptionPane.showMessageDialog(null, "Completada la mision");
                    vive =  false;
                }
            }

         
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
