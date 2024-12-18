

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author bahdja moucer  alicia abib
 */
public class VisuJoueurDlg extends javax.swing.JDialog {

    //Pour récupérer le joueur dont on veut afficher les informations
    private Joueur leJoueur; 
    
    public VisuJoueurDlg(java.awt.Frame parent, boolean modal, Joueur j) {
        super(parent, modal);
        initComponents();
        //Récupération du joueur passé en paramètres
        this.leJoueur = j;
        initInfos();
    }
   
    //Méthode pour afficher les informations du joueur
    private void initInfos(){
        Pseudo.setText(leJoueur.getPseudo()); //Afficher le pseudo sur le JLabel Pseudo
        Solde.setText(""+leJoueur.getSolde()); //Afficher le solde sur le JLabel Solde
        Informations.setText(leJoueur.toString()); //Afficher l'ensemble des informations dans la JTextArea Informations
        Couleur.setBackground(leJoueur.getCouleur()); //Colorer le JPanel Couleur avec la couleur du joueur
        BIcon.setIcon(leJoueur.getPhoto()); //Afficher l'image du joueur sur le bouton BIcon
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LTitre = new javax.swing.JLabel();
        PCentre = new javax.swing.JPanel();
        PGauche = new javax.swing.JPanel();
        jLPseudo = new javax.swing.JLabel();
        Pseudo = new javax.swing.JLabel();
        jLCouleur = new javax.swing.JLabel();
        Couleur = new javax.swing.JPanel();
        jLSolde = new javax.swing.JLabel();
        Solde = new javax.swing.JLabel();
        PDroite = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Informations = new javax.swing.JTextArea();
        BIcon = new javax.swing.JButton();
        PSouth = new javax.swing.JPanel();
        BFermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LTitre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LTitre.setText("Informations relatives à un joueur");
        getContentPane().add(LTitre, java.awt.BorderLayout.NORTH);

        PCentre.setLayout(new java.awt.GridLayout(1, 2));

        PGauche.setLayout(new java.awt.GridLayout(3, 2));

        jLPseudo.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLPseudo.setText("Pseudo");
        PGauche.add(jLPseudo);

        Pseudo.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        PGauche.add(Pseudo);

        jLCouleur.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLCouleur.setText("Couleur");
        PGauche.add(jLCouleur);

        javax.swing.GroupLayout CouleurLayout = new javax.swing.GroupLayout(Couleur);
        Couleur.setLayout(CouleurLayout);
        CouleurLayout.setHorizontalGroup(
            CouleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        CouleurLayout.setVerticalGroup(
            CouleurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        PGauche.add(Couleur);

        jLSolde.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLSolde.setText("Solde");
        PGauche.add(jLSolde);

        Solde.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        PGauche.add(Solde);

        PCentre.add(PGauche);

        PDroite.setLayout(new java.awt.GridLayout(1, 2));

        Informations.setColumns(20);
        Informations.setLineWrap(true);
        Informations.setRows(5);
        Informations.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Informations);

        PDroite.add(jScrollPane1);
        PDroite.add(BIcon);

        PCentre.add(PDroite);

        getContentPane().add(PCentre, java.awt.BorderLayout.CENTER);

        BFermer.setText("Fermer");
        BFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFermerActionPerformed(evt);
            }
        });
        PSouth.add(BFermer);

        getContentPane().add(PSouth, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFermerActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_BFermerActionPerformed

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
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisuJoueurDlg dialog = new VisuJoueurDlg(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton BFermer;
    private javax.swing.JButton BIcon;
    private javax.swing.JPanel Couleur;
    private javax.swing.JTextArea Informations;
    private javax.swing.JLabel LTitre;
    private javax.swing.JPanel PCentre;
    private javax.swing.JPanel PDroite;
    private javax.swing.JPanel PGauche;
    private javax.swing.JPanel PSouth;
    private javax.swing.JLabel Pseudo;
    private javax.swing.JLabel Solde;
    private javax.swing.JLabel jLCouleur;
    private javax.swing.JLabel jLPseudo;
    private javax.swing.JLabel jLSolde;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}