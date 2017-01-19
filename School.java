import java.util.ArrayList;

/**
 * Created by trist on 18/01/2017.
 */
public class School {

    ArrayList NomEcole = new ArrayList();
    ArrayList ListeEleve = new ArrayList();


    public void School(String E, String LE){

        NomEcole.add(String E);
        ListeEleve.add(String LE);

    }

    public String toString(){
        return " Nom de l'ecole" + this.NomEcole + " liste des eleves " +this.ListeEleve + "." ;
    }
}
