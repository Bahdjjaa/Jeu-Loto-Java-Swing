/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bahdja moucer  alicia abib
 */
public class CarteLoto {

    private int tab[][];
    private int jetons[][];
    private int nbCol;
    private int nbLig;
    private int nbNumeros;
    private double prix;
    private final int valMax = 90;

    public CarteLoto() {
        this.nbNumeros = 15;
        this.nbCol = 9;
        this.nbLig = 3;
        this.tab = new int[nbLig][nbCol];
        this.jetons = new int[nbLig][nbCol];
        this.prix = 5;
        initValeursCarte();
    }

    public CarteLoto(int nbc, int nbVal) {
        this.nbNumeros = nbVal;
        this.nbCol = nbc;
        this.nbLig = 3;
        this.tab = new int[nbLig][nbCol];
        this.jetons = new int[nbLig][nbCol];
        this.prix = 5;
        initValeursCarte();
    }

    public int getNbColonne() {
        return this.nbCol;
    }

    public int getNbLigne() {
        return this.nbLig;
    }

    public int getNbNumero() {
        return this.nbNumeros;
    }

    public int getCase(int i, int j) {
        if (i >= 0 && i < this.nbLig && j >= 0 && j < this.nbCol) {
            return this.tab[i][j];
        } else {
            return -1;
        }
    }

    public double getPrix() {
        return this.prix;
    } // accesseur get pour récupérer le prix de la carte
    // A COMPLETER autres accesseurs get et set
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.nbLig; i++) {
            for (int j = 0; j < this.nbCol; j++) {
                if (tab[i][j] < 10) {
                    res += " ";
                }
                res += " " + tab[i][j];
            }
            res += "\n";
        }
        return res;
    }

    public boolean estDans(int val) {
        boolean res = false;
        for (int i = 0; i < this.nbLig; i++) {
            for (int j = 0; j < this.nbCol; j++) {
                if (tab[i][j] == val) {
                    res = true;
                }
            }
        }
        return res;
    }

    public void initValeursCarte() {
        int i, j, k, n;
        i = 0;
        for (k = 0; k < this.nbNumeros; k++) {
            do {
                j = (int) (Math.random() * this.nbCol);
            } while (this.tab[i][j] != 0);

            do {
                n = (int) (Math.random() * 90 + 1);
            } while (estDans(n));

            this.tab[i][j] = n;

            i = (i + 1) % this.nbLig;
        }
    }

    public boolean placePion(int val) {
        boolean res = false;
        for (int i = 0; i < this.nbLig; i++) {
            for (int j = 0; j < this.nbCol; j++) {
                if (tab[i][j] == val) {
                    res = true;
                    jetons[i][j] = val;
                }
            }
        }
        return res;
    }

    public boolean estLignePleine(int lig) {
        boolean res = true;
        for (int j = 0; j < this.nbCol; j++) {
            if (jetons[lig][j] != tab[lig][j]) {
                res = false;
            }
        }
        return res;
    }

    public int getNbLignesPleines() {
        int s = 0;
        for (int i = 0; i < this.nbLig; i++) {
            if (estLignePleine(i)) {
                s++;
            }
        }
        return s;
    }

    public boolean cartonGagnant(int option) {
        boolean res = false;
        switch (option) {
            case 1:
                res = getNbLignesPleines() == 1;
                break;
            case 2:
                res = getNbLignesPleines() == 2;
                break;
            case 3:
                res = getNbLignesPleines() == 3;
        }
        return res;
    }

    public void setNbNumeros(int nombre) {
        if (nombre >= 3 && nombre <= this.nbLig * this.nbCol) {
            this.nbNumeros = nombre;
        }
    }
}
