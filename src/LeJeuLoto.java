
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author bahdja moucer alicia abib
 */
public class LeJeuLoto extends javax.swing.JFrame {

    private LesJoueurs joueurs; //La liste des joueurs participants
    private final int MaxNbJoueurs = 4; //Le nombre maximal des joueurs 

    public LeJeuLoto() {
        initComponents();
        //Création d'un objet de type LesJoueurs et l'affecter à l'attribut 'joueurs'
        joueurs = new LesJoueurs();
        initListeJoueurs();
        initPanJoueurs();
    }

    //Méthode pour afficher les pseudos des joueurs sur les boutons
    private void AfficheJoueurs() {
        for (int i = 0; i < this.joueurs.getNbJoueur(); i++) {
            //Récupération de bouton 
            JButton btn = (JButton) PanJoueurs.getComponent(i);
            //Ecriture du prénom de joueur sur la bouton
            btn.setText(joueurs.getJoueur(i).getPseudo());
            //Colorer la bouton avec la couleur préférée du joueur
            btn.setBackground(joueurs.getJoueur(i).getCouleur());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LesCartons = new javax.swing.JPanel();
        Cartons1 = new javax.swing.JPanel();
        Carton11 = new javax.swing.JPanel();
        Carton12 = new javax.swing.JPanel();
        Carton13 = new javax.swing.JPanel();
        Carton14 = new javax.swing.JPanel();
        Cartons2 = new javax.swing.JPanel();
        Carton21 = new javax.swing.JPanel();
        Carton22 = new javax.swing.JPanel();
        Carton23 = new javax.swing.JPanel();
        Carton24 = new javax.swing.JPanel();
        PanJoueurs = new javax.swing.JPanel();
        Bjoueur1 = new javax.swing.JButton();
        Bjoueur2 = new javax.swing.JButton();
        Bjoueur3 = new javax.swing.JButton();
        Bjoueur4 = new javax.swing.JButton();
        Bas = new javax.swing.JPanel();
        LCadeau = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historique = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        LModeJeu = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BTirage = new javax.swing.JButton();
        Tirage = new javax.swing.JLabel();
        BArreter = new javax.swing.JButton();
        Haut = new javax.swing.JPanel();
        LTitre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAjout = new javax.swing.JMenu();
        jMenuItemJoueur = new javax.swing.JMenuItem();
        jMenuItemLot = new javax.swing.JMenuItem();
        jMenuAction = new javax.swing.JMenu();
        OptionJeu = new javax.swing.JMenuItem();
        DémarerJeu = new javax.swing.JMenuItem();
        AcheterCartes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LesCartons.setLayout(new java.awt.GridLayout(0, 2));

        Cartons1.setLayout(new java.awt.GridLayout(4, 0));

        javax.swing.GroupLayout Carton11Layout = new javax.swing.GroupLayout(Carton11);
        Carton11.setLayout(Carton11Layout);
        Carton11Layout.setHorizontalGroup(
            Carton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton11Layout.setVerticalGroup(
            Carton11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons1.add(Carton11);

        javax.swing.GroupLayout Carton12Layout = new javax.swing.GroupLayout(Carton12);
        Carton12.setLayout(Carton12Layout);
        Carton12Layout.setHorizontalGroup(
            Carton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton12Layout.setVerticalGroup(
            Carton12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons1.add(Carton12);

        javax.swing.GroupLayout Carton13Layout = new javax.swing.GroupLayout(Carton13);
        Carton13.setLayout(Carton13Layout);
        Carton13Layout.setHorizontalGroup(
            Carton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton13Layout.setVerticalGroup(
            Carton13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons1.add(Carton13);

        javax.swing.GroupLayout Carton14Layout = new javax.swing.GroupLayout(Carton14);
        Carton14.setLayout(Carton14Layout);
        Carton14Layout.setHorizontalGroup(
            Carton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton14Layout.setVerticalGroup(
            Carton14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons1.add(Carton14);

        LesCartons.add(Cartons1);

        Cartons2.setLayout(new java.awt.GridLayout(4, 0));

        javax.swing.GroupLayout Carton21Layout = new javax.swing.GroupLayout(Carton21);
        Carton21.setLayout(Carton21Layout);
        Carton21Layout.setHorizontalGroup(
            Carton21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton21Layout.setVerticalGroup(
            Carton21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons2.add(Carton21);

        javax.swing.GroupLayout Carton22Layout = new javax.swing.GroupLayout(Carton22);
        Carton22.setLayout(Carton22Layout);
        Carton22Layout.setHorizontalGroup(
            Carton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton22Layout.setVerticalGroup(
            Carton22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons2.add(Carton22);

        javax.swing.GroupLayout Carton23Layout = new javax.swing.GroupLayout(Carton23);
        Carton23.setLayout(Carton23Layout);
        Carton23Layout.setHorizontalGroup(
            Carton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton23Layout.setVerticalGroup(
            Carton23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons2.add(Carton23);

        javax.swing.GroupLayout Carton24Layout = new javax.swing.GroupLayout(Carton24);
        Carton24.setLayout(Carton24Layout);
        Carton24Layout.setHorizontalGroup(
            Carton24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        Carton24Layout.setVerticalGroup(
            Carton24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        Cartons2.add(Carton24);

        LesCartons.add(Cartons2);

        getContentPane().add(LesCartons, java.awt.BorderLayout.CENTER);

        PanJoueurs.setLayout(new java.awt.GridLayout(4, 0));

        Bjoueur1.setText("Joueur1");
        Bjoueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bjoueur1ActionPerformed(evt);
            }
        });
        PanJoueurs.add(Bjoueur1);

        Bjoueur2.setText("Joueur2");
        Bjoueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bjoueur2ActionPerformed(evt);
            }
        });
        PanJoueurs.add(Bjoueur2);

        Bjoueur3.setText("Joueur3");
        Bjoueur3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bjoueur3ActionPerformed(evt);
            }
        });
        PanJoueurs.add(Bjoueur3);

        Bjoueur4.setText("Joueur4");
        Bjoueur4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bjoueur4ActionPerformed(evt);
            }
        });
        PanJoueurs.add(Bjoueur4);

        getContentPane().add(PanJoueurs, java.awt.BorderLayout.EAST);

        Bas.setLayout(new java.awt.BorderLayout());

        LCadeau.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        LCadeau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LCadeau.setText("                ");
        Bas.add(LCadeau, java.awt.BorderLayout.NORTH);
        LCadeau.getAccessibleContext().setAccessibleName("LCadeau");

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Historique du tirage des boules");
        jPanel2.add(jLabel2, java.awt.BorderLayout.NORTH);

        Historique.setColumns(20);
        Historique.setRows(5);
        jScrollPane1.setViewportView(Historique);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        LModeJeu.setText("                   ");
        jPanel3.add(LModeJeu, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        BTirage.setText("Tirage");
        jPanel4.add(BTirage);

        Tirage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tirage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(Tirage);

        BArreter.setText("Arreter");
        jPanel4.add(BArreter);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        Bas.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Bas, java.awt.BorderLayout.SOUTH);

        Haut.setLayout(new java.awt.GridLayout(1, 1));

        LTitre.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        LTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LTitre.setText("Voici les cartes dont vous disposez");
        Haut.add(LTitre);

        getContentPane().add(Haut, java.awt.BorderLayout.NORTH);

        jMenuAjout.setText("Ajout");

        jMenuItemJoueur.setText("Joueur");
        jMenuItemJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJoueurActionPerformed(evt);
            }
        });
        jMenuAjout.add(jMenuItemJoueur);

        jMenuItemLot.setText("Lot");
        jMenuAjout.add(jMenuItemLot);

        jMenuBar1.add(jMenuAjout);

        jMenuAction.setText("Action");

        OptionJeu.setText("Options Jeu");
        jMenuAction.add(OptionJeu);

        DémarerJeu.setText("Démarer Jeu");
        jMenuAction.add(DémarerJeu);

        AcheterCartes.setText("Acheter cartes");
        jMenuAction.add(AcheterCartes);

        jMenuItem4.setText("Continuer");
        jMenuAction.add(jMenuItem4);

        jMenuItem5.setText("Recommencer");
        jMenuAction.add(jMenuItem5);

        jMenuBar1.add(jMenuAction);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Gestionnaire du clic sur la sous-option 'Joueur' du menu 'Ajout' 
    private void jMenuItemJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJoueurActionPerformed
        //Tester si le nombre des joueurs déjà inscrits ne dépasse pas 4 (le nombre maximum de joueurs)
        if (this.joueurs.getNbJoueur() < this.MaxNbJoueurs) {

            //Création d'une nouvelle boite de dialogue de type 'SaisieJoueurDlg'
            SaisieJoueurDlg diag = new SaisieJoueurDlg(this, true);

            //Affichage de la boite de dialogue
            diag.setVisible(true);

            //Ajustement de la taille de la boite de dialogue
            diag.setSize(600, 500);

            //Précision des coordonnées d'affichage de la boite de dialogue
            diag.setLocation(100, 100);

            //Si l'utilisateur à cliquer sur le bouton 'Valider'
            if (diag.getOK()) {
                //Récupération du joueur créé
                Joueur j = diag.getJoueur();

                //Ajout du joueur à la liste des joueurs inscrits
                this.joueurs.ajouteJoueur(j);

                //Affichage du nom de joueur sur son bouton
                AfficheJoueurs();
            }
            //Si le nombre maximum de joueurs et atteint on désactive le fonctionnement de la sous-option 'Joueur'
        } else {
            jMenuItemJoueur.setEnabled(false);
        }

    }//GEN-LAST:event_jMenuItemJoueurActionPerformed
    //Gestionnaire du clique sur le bouton Bjoueur1
    private void Bjoueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bjoueur1ActionPerformed
        //Tester si un joueur est inscrit
        if (this.joueurs.getJoueur(0) != null) {
            //Création d'une nouvelle boite de dialogue de type 'VisuJoueurDlg'
            VisuJoueurDlg diag = new VisuJoueurDlg(this, true, this.joueurs.getJoueur(0));
            //Ajustement de la taille de la boite de dialogue
            diag.setSize(600, 500);

            //Précision des coordonnées d'affichage de la boite de dialogue
            diag.setLocation(100, 100);

            //Affichage de la boite de dialogque 
            diag.setVisible(true);
        }
    }//GEN-LAST:event_Bjoueur1ActionPerformed
    //Gestionnaire du clique sur le bouton Bjoueur2
    private void Bjoueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bjoueur2ActionPerformed
        if (this.joueurs.getJoueur(1) != null) {
            VisuJoueurDlg diag = new VisuJoueurDlg(this, true, this.joueurs.getJoueur(1));
            diag.setSize(600, 500);
            diag.setLocation(100, 100);
            diag.setVisible(true);
        }
    }//GEN-LAST:event_Bjoueur2ActionPerformed
    //Gestionnaire du clique sur le bouton Bjoueur3
    private void Bjoueur3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bjoueur3ActionPerformed
        if (this.joueurs.getJoueur(2) != null) {
            VisuJoueurDlg diag = new VisuJoueurDlg(this, true, this.joueurs.getJoueur(2));
            diag.setSize(600, 500);
            diag.setLocation(100, 100);
            diag.setVisible(true);
        }
    }//GEN-LAST:event_Bjoueur3ActionPerformed
    //Gestionnaire du clique sur le bouton Bjoueur4
    private void Bjoueur4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bjoueur4ActionPerformed
        if (this.joueurs.getJoueur(3) != null) {
            VisuJoueurDlg diag = new VisuJoueurDlg(this, true, this.joueurs.getJoueur(3));
            diag.setSize(600, 500);
            diag.setLocation(100, 100);
            diag.setVisible(true);
        }
    }//GEN-LAST:event_Bjoueur4ActionPerformed

    //Méthodes supplémentaires pour tester le fonctionnement des boites de dialogues
    //Dès le lancement du programme
    //Méthode pour initialiser la ArrayList 'joueurs'
    private void initListeJoueurs() {
        //Instantiation d'un joueur 'Elis'
        Joueur j1 = new Joueur("Elis");
        //Affectation d'une couleur
        j1.setCouleur(new Color(255, 0, 0));
        //Ajout du joueur créé j1 à la liste 'joueurs'
        joueurs.ajouteJoueur(j1);
    }

    //Méthode pour initialiser le panneau 'PanJoueurs'
    private void initPanJoueurs() {
        for (int i = 0; i < this.joueurs.getNbJoueur(); i++) {
            //Récupération de bouton 
            JButton btn = (JButton) PanJoueurs.getComponent(i);
            //Ecriture du prénom de joueur sur la bouton
            btn.setText(joueurs.getJoueur(i).getPseudo());
            //Colorer la bouton avec la couleur préférée du joueur
            btn.setBackground(joueurs.getJoueur(i).getCouleur());
        }
    }

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
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LeJeuLoto loto = new LeJeuLoto();
                loto.setVisible(true);
                loto.setSize(800, 600);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcheterCartes;
    private javax.swing.JButton BArreter;
    private javax.swing.JButton BTirage;
    private javax.swing.JPanel Bas;
    private javax.swing.JButton Bjoueur1;
    private javax.swing.JButton Bjoueur2;
    private javax.swing.JButton Bjoueur3;
    private javax.swing.JButton Bjoueur4;
    private javax.swing.JPanel Carton11;
    private javax.swing.JPanel Carton12;
    private javax.swing.JPanel Carton13;
    private javax.swing.JPanel Carton14;
    private javax.swing.JPanel Carton21;
    private javax.swing.JPanel Carton22;
    private javax.swing.JPanel Carton23;
    private javax.swing.JPanel Carton24;
    private javax.swing.JPanel Cartons1;
    private javax.swing.JPanel Cartons2;
    private javax.swing.JMenuItem DémarerJeu;
    private javax.swing.JPanel Haut;
    private javax.swing.JTextArea Historique;
    private javax.swing.JLabel LCadeau;
    private javax.swing.JLabel LModeJeu;
    private javax.swing.JLabel LTitre;
    private javax.swing.JPanel LesCartons;
    private javax.swing.JMenuItem OptionJeu;
    private javax.swing.JPanel PanJoueurs;
    private javax.swing.JLabel Tirage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuAction;
    private javax.swing.JMenu jMenuAjout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemJoueur;
    private javax.swing.JMenuItem jMenuItemLot;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
