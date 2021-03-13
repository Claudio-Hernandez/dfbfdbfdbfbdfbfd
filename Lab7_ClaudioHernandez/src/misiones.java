
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudio Hernandez
 */
public class misiones implements Serializable{
   private static final long SerialVersionUID = 777L;

    private naves nave;
    private ArrayList<astronautas> astronautasAbordo =  new ArrayList();
    private String condicion ;
    private planetas planeta;

    public misiones(naves nave, String condicion,ArrayList<astronautas> astronautasAbordo,planetas planeta) {
        this.nave = nave;
        this.condicion = condicion;
        this.astronautasAbordo= astronautasAbordo;
        this.planeta =  planeta;
    }

    public planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(planetas planeta) {
        this.planeta = planeta;
    }

    public naves getNave() {
        return nave;
    }

    public void setNave(naves nave) {
        this.nave = nave;
    }

    public ArrayList<astronautas> getAstronautasAbordo() {
        return astronautasAbordo;
    }

    public void setAstronautasAbordo(ArrayList<astronautas> astronautasAbordo) {
        this.astronautasAbordo = astronautasAbordo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "\nmision:" + "Nave Utilizada =" + nave + "\n Astronautas Abordo = " + astronautasAbordo +"\n   planeta"+planeta+ "\n  condicion=" + condicion+"\n========================";
    }
    
    
}
