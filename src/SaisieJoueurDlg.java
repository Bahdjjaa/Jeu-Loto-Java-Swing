
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author bahdja moucer alicia abib
 */
public class SaisieJoueurDlg extends javax.swing.JDialog {

    private Joueur leJoueur; //Joueur à créer
    private boolean ok; //Vaut 'true' si l'utilisateur a cliqué sur le bouton valider, 'false' sur le bouton annuler

    public SaisieJoueurDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal); //Appel au constructeur standard de la classe JDialog
        initComponents();
        //Initialisation des attribut
        this.leJoueur = new Joueur(); //Création d'un nouveau joueur par défaut
        this.ok = false;
    }

    //Accesseur en lecture de type boolean pour l'attribut 'ok'
    public boolean getOK() {
        return this.ok;
    }

    //Accesseur en lecture de type Joueur pour l'attribut 'leJoueur'
    public Joueur getJoueur() {
        return this.leJoueur;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LTitre = new javax.swing.JLabel();
        PCentre = new javax.swing.JPanel();
        PGauche = new javax.swing.JPanel();
        jLPseudo = new javax.swing.JLabel();
        jLSolde = new javax.swing.JLabel();
        jLCouleur = new javax.swing.JLabel();
        jLPhoto = new javax.swing.JLabel();
        PDroite = new javax.swing.JPanel();
        Pseudo = new javax.swing.JTextField();
        Solde = new javax.swing.JTextField();
        PCouleur = new javax.swing.JPanel();
        BChoisir = new javax.swing.JButton();
        Couleur = new javax.swing.JPanel();
        jPPhoto = new javax.swing.JPanel();
        BParcourir = new javax.swing.JButton();
        Photo = new javax.swing.JButton();
        PSouth = new javax.swing.JPanel();
        BAnnuler = new javax.swing.JButton();
        BValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LTitre.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        LTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LTitre.setText("Informations relatives à un joueur");
        getContentPane().add(LTitre, java.awt.BorderLayout.NORTH);

        PCentre.setLayout(new java.awt.GridLayout(1, 2));

        PGauche.setLayout(new java.awt.GridLayout(4, 1));

        jLPseudo.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLPseudo.setText("Pseudo ?");
        PGauche.add(jLPseudo);

        jLSolde.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLSolde.setText("Solde ?");
        PGauche.add(jLSolde);

        jLCouleur.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLCouleur.setText("Couleur préférée ?");
        PGauche.add(jLCouleur);

        jLPhoto.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLPhoto.setText("Photo ?");
        PGauche.add(jLPhoto);

        PCentre.add(PGauche);

        PDroite.setLayout(new java.awt.GridLayout(4, 1));
        PDroite.add(Pseudo);
        PDroite.add(Solde);

        PCouleur.setLayout(new java.awt.GridLayout(1, 2));

        BChoisir.setText("Choisir !");
        BChoisir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BChoisirActionPerformed(evt);
            }
        });
        PCouleur.add(BChoisir);

        javax.swing.GroupLayout CouleurLayout = new javax.swing.GroupLayout(Couleur);
        Couleur.setLayout(CouleurLayout);
        CouleurLayout.setHorizontalGroup(
            CouleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        CouleurLayout.setVerticalGroup(
            CouleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        PCouleur.add(Couleur);

        PDroite.add(PCouleur);

        jPPhoto.setLayout(new java.awt.GridLayout(1, 2));

        BParcourir.setText("Parcourir");
        BParcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BParcourirActionPerformed(evt);
            }
        });
        jPPhoto.add(BParcourir);
        jPPhoto.add(Photo);

        PDroite.add(jPPhoto);

        PCentre.add(PDroite);

        getContentPane().add(PCentre, java.awt.BorderLayout.CENTER);

        PSouth.setLayout(new java.awt.GridLayout(1, 2));

        BAnnuler.setText("Annuler");
        BAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnnulerActionPerformed(evt);
            }
        });
        PSouth.add(BAnnuler);

        BValider.setText("Valider");
        BValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BValiderActionPerformed(evt);
            }
        });
        PSouth.add(BValider);

        getContentPane().add(PSouth, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Gestionnaire du clic sur le bouton 'Annuler'
    private void BAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnnulerActionPerformed
        this.ok = false; //On a cliqué sur le bouton 'Annuler'
        this.dispose(); //Pour libérer de l'espace en mémoire
        this.setVisible(false);//On ferme la boite de dialogue
    }//GEN-LAST:event_BAnnulerActionPerformed

    //Gestionnaire du clic sur le bouton 'Choisir'
    private void BChoisirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BChoisirActionPerformed
        //Création d'une nouvelle boite de dialogue de type JColorChooser
        JColorChooser diag = new JColorChooser();
        //Récupération de la couleur séléctionnée par l'utilisateur
        Color coul = diag.showDialog(this, "Couleur", Color.red);
        if (coul != null) {
            this.leJoueur.setCouleur(coul); //Affectation de la couleur choisie à l'attribut 'couleur' du joueur
            Couleur.setBackground(coul); //Colorer le panneau 'Couleur' par la couleur choisie
        }
    }//GEN-LAST:event_BChoisirActionPerformed

    //Gestionnaire du clic sur le bouton 'Valider'
    private void BValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BValiderActionPerformed
        if (Pseudo.getText().equals("") || Solde.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Les informations du joueur sont insuffisantes", "Avertissement", JOptionPane.WARNING_MESSAGE);
        } else {
            String ps = Pseudo.getText(); //Récupérer le pseudo
            String so = Solde.getText(); //Récupérer le solde
            double s = Double.parseDouble(so); //Caster le solde en double
            this.leJoueur.setPseudo(ps); //Affecter le pseudo à l'attribut pseudo du joueur
            this.leJoueur.setSolde(s); //Affecter le solde à l'attribut solde du joueur
            this.ok = true; //On a cliqué sur le bouton valider
            this.setVisible(false); //Fermeture de la boite de dialogue
            this.dispose(); //Liberer la mémoire
        }

    }//GEN-LAST:event_BValiderActionPerformed

    //Gestionnaire du clic sur le bouton parcourir
    private void BParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BParcourirActionPerformed
        //On utilise la boite de dialogue JFileChooser
        JFileChooser diag = new JFileChooser();
        int result = diag.showOpenDialog(this);
        //Tester si l'utilisateur a choisit l'image et a validé son choix
        if (result == JFileChooser.APPROVE_OPTION) { 
            //récupération du chemin d'accès vers l'image dpuis la racine
            String chemin = diag.getSelectedFile().getPath();
            //récupération de l'image
            Image img = Toolkit.getDefaultToolkit().getImage(chemin);
            //Affichage de l'image selectionnée sur le bouton Photo
            Photo.setIcon(new ImageIcon(img));
            //Affecter la photo choisie à l'attribut photo du joueur
            leJoueur.setPhoto(new ImageIcon(img));
        }
    }//GEN-LAST:event_BParcourirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SaisieJoueurDlg dialog = new SaisieJoueurDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAnnuler;
    private javax.swing.JButton BChoisir;
    private javax.swing.JButton BParcourir;
    private javax.swing.JButton BValider;
    private javax.swing.JPanel Couleur;
    private javax.swing.JLabel LTitre;
    private javax.swing.JPanel PCentre;
    private javax.swing.JPanel PCouleur;
    private javax.swing.JPanel PDroite;
    private javax.swing.JPanel PGauche;
    private javax.swing.JPanel PSouth;
    private javax.swing.JButton Photo;
    private javax.swing.JTextField Pseudo;
    private javax.swing.JTextField Solde;
    private javax.swing.JLabel jLCouleur;
    private javax.swing.JLabel jLPhoto;
    private javax.swing.JLabel jLPseudo;
    private javax.swing.JLabel jLSolde;
    private javax.swing.JPanel jPPhoto;
    // End of variables declaration//GEN-END:variables
}
