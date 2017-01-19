/**
 * Created by trist on 19/01/2017.
 */
public class LifeSchool {

    String NomEcole[];     // Est ce le mieux de declarer les tableaux ici ?
    String ListeEleve[];

    public class student {

        String name;
        String prenom;
        Number age;
        String date;

        void createS(String n,String p, Number a, String d ){

            name = n;
            prenom = p;
            age = a;
            date = d;


        }

        public String toString(){     // Est ce vaiment cela d attendu ?

            return " Nom de l'eleve" + this.name + "prenom" +this.prenom + "age" + this.age + "date de naissance" + this.date;
        }



    }


    public class school {

        String name;
        String liste;

        public String toString(){

            return " Nom de l'eleve" + this.name + "liste" +this.liste;
        }

    }

    public static void main(String[] args){

    }

        school infojava = new school(String NomEcole, String ListeEleve); {


        NomEcole = String E;           //Comment faire ici pour remplir un tableau ?
        ListeEleve = String LE;

    }

    public String toString(){
        return " Nom de l'ecole" + this.NomEcole + " liste des eleves " +this.ListeEleve + "." ;


    }

}
