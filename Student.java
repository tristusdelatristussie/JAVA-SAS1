import java.util.ArrayList;

/**
 * Created by trist on 18/01/2017.
 */
public class student {

    ArrayList name = new ArrayList();
    ArrayList prenom = new ArrayList();
    ArrayList age = new ArrayList();
    ArrayList date = new ArrayList();


    public void student(String n,String p, Number a, String d ){

        name.add(n);
        prenom.add(p);
        age.add(a);
        date.add(d);


    }

    public String toString(){

        return " Nom de l'eleve" + this.name + "prenom" +this.prenom + "age" + this.age + "date de naissance" + this.date;
    }



}