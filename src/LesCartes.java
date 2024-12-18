
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bahdja moucer  alicia abib
 */
public class LesCartes {

    private ArrayList<CarteLoto> lst;

    public LesCartes() {
        lst = new ArrayList<>();
    }

    public int getTaille() {
        return this.lst.size();
    }

    public CarteLoto getCarte(int i) {
        if (i < getTaille() && i >= 0) {
            return this.lst.get(i);
        } else {
            return null;
        }
    }

    public void ajouteCarte(CarteLoto c) {
        this.lst.add(c);
    }

    public void retireCarte(CarteLoto c) {
        int i = this.lst.indexOf(c);
        if (i != -1) {
            this.lst.remove(c);
        }
    }
    
    public void retireCartes(){
        this.lst.clear();
    }
    
    public void initLesCartes(int n, int nbCol, int nbVal){
        CarteLoto c;
        for(int i = 0 ; i < n ; i++){
            c = new CarteLoto(nbCol,nbVal);
            ajouteCarte(c);
        }
    }

    //Rechercher les cartes qui contiennent un numéro spécifique
    public LesCartes rechCarte(int num){
        LesCartes lc = new LesCartes();
        for(int i = 0 ; i < getTaille() ; i++){
            getCarte(i).estDans(num);
            lc.ajouteCarte(getCarte(i));       
        }
        return lc;
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i = 0 ; i < getTaille(); i++){
            s+="Carte "+i+1+"\n";
            s+=getCarte(i).toString()+"\n";
        }
        return s;
    }
}
