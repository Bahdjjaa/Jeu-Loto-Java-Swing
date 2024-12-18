
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bahdja moucer  alicia abib
 */
public class LesJoueurs {

    private ArrayList<Joueur> lstJ;

    //Constructeur
    public LesJoueurs() {
        //Intanciation d'une nouvelle ArrayList du type Joueur
        this.lstJ = new ArrayList<>();
    }
    
    //Méthode qui renvoie le nombre des joueurs
    public int getNbJoueur() {
        return this.lstJ.size();
    }

    //Méthode qui renvoie le joueur d'indice i
    public Joueur getJoueur(int i) {
        if (i >= 0 && i < getNbJoueur()) {
            return this.lstJ.get(i);
        } else {
            return null;
        }
    }

    //Méthode pour ajouter un joueur à la liste
    public void ajouteJoueur(Joueur j) {
        this.lstJ.add(j);
    }

    //Méthode pour supprimer un joueur de la liste
    public void supprimeJoueur(Joueur j) {
        this.lstJ.remove(j);
    }
    
    //Méthode pour rechercher un joueur dans la liste en utilisant son pseudo
    public Joueur rechJoueur(String name) {
        boolean ok = false; //booléen indiquant si le joueur a était trouvé ou non 
        int i = 0;
        //Parcourir la liste
        while (i < getNbJoueur() && !ok) {
            ok = (this.lstJ.get(i).getPseudo().equals(name)); //comparaison des pseudo de chaque joueur avec le pseudo passé en paramètres
            i++;
        }
        if (ok == false) {
            return null; //renvoyer null si le joueur n'a pas été trouvé
        }
        return this.lstJ.get(i - 1); //renvoyer le joueur si trouvé
    }

    @Override
    //renvoyer les informations textuelle des joueurs
    public String toString() {
        String s = "Les Joueurs sont :\n";
        //Parcourir la liste des joueur et afficher les informations de chacun
        for (int i = 0; i < getNbJoueur(); i++) {
            s += this.lstJ.get(i).toString() + "\n";
        }
        return s;
    }
}
