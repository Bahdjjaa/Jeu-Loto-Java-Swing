
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author bahdja moucer  alicia abib
 */

public class Joueur {

    private String pseudo;
    private Color couleur;
    private double solde;
    private ImageIcon photo;

    //Accesseur en lecture de type String pour l'attribut 'pseudo'
    public String getPseudo() {
        return this.pseudo;
    }

    //Accesseur en lecture de type Color pour l'attribut 'couleur'
    public Color getCouleur() {
        return this.couleur;
    }

    //Accesseur en lecture de type double pour l'attribut 'solde'
    public double getSolde() {
        return this.solde;
    }

    //Accesseur en lecture de type ImageIcon pour l'attribut 'couleur'
    public ImageIcon getPhoto() {
        return this.photo;
    }

    //Accesseur en écriture pour l'attribut 'pseudo'
    public void setPseudo(String p) {
        this.pseudo = p;
    }

    //Accesseur en écriture pour l'attribut 'couleur'
    public void setCouleur(Color c) {
        this.couleur = c;
    }

    //Accesseur en écriture pour l'attribut 'photo'
    public void setPhoto(ImageIcon p) {
        this.photo = p;
    }

    //Accesseur en écriture pour l'attribut 'solde'
    public void setSolde(double s) {
        this.solde = s;
    }

    //Constructeur standard avec un paramètre de type String pour l'attribut 'pseudo'
    public Joueur() {
        this.pseudo = "";
        this.couleur = Color.gray;
        this.solde = 20;
        this.photo = new ImageIcon(getClass().getResource("/joueurDefaut.png"));
    }

    //constructeur par defaut de la classe Joueur
    public Joueur(String p) {
        this.pseudo = p;
        this.couleur = Color.gray;
        this.solde = 20;
        this.photo = new ImageIcon(getClass().getResource("/joueurDefaut.png"));
    }

    
    //méthode string qui renvoie une description textuelle du joueur
    @Override
    public String toString() {
        String res = "\nJoueur " + this.pseudo;
        res += "\nCouleur " + this.couleur;
        res += "\nSolde " + this.solde;
        return res;
    }
}
