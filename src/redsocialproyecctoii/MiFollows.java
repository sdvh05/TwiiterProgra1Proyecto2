/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redsocialproyecctoii;

import redsocialproyecctoii.Master;


/**
 *
 * @author Hp
 */
public class MiFollows extends javax.swing.JFrame {
public Master mas;
   
    public MiFollows(Master mast) {
        initComponents();
        mas=mast;
        this.setTitle("Mi Perfil ( @"+mas.getUsuarioActual()+" )");
        setLocationRelativeTo(null);
        AreaFollows.setText("");
        lblUsername.setText("@"+mas.getUsuarioActual());
        lblFollowers.setText("Followers: "+mas.UsuarioActual.getNumFollowers());
        lblFollowing.setText("Following: "+mas.UsuarioActual.getNumFollowing());
        lblListName.setText("    ");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        Return = new javax.swing.JButton();
        btnFolowing = new javax.swing.JButton();
        btnFollower = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaFollows = new javax.swing.JTextArea();
        lblFollowing = new javax.swing.JLabel();
        lblFollowers = new javax.swing.JLabel();
        lblListName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setText("MI Usuername");

        Return.setBackground(new java.awt.Color(0, 51, 153));
        Return.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Return.setText("<");
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(lblUsername)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Return)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnFolowing.setBackground(new java.awt.Color(0, 51, 153));
        btnFolowing.setText("Following");
        btnFolowing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFolowingMouseClicked(evt);
            }
        });

        btnFollower.setBackground(new java.awt.Color(0, 51, 153));
        btnFollower.setText("Follower");
        btnFollower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFollowerMouseClicked(evt);
            }
        });

        AreaFollows.setEditable(false);
        AreaFollows.setColumns(20);
        AreaFollows.setRows(5);
        jScrollPane1.setViewportView(AreaFollows);

        lblFollowing.setText("NumFollowing");

        lblFollowers.setText("NumFollowers");

        lblListName.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        lblListName.setText("Mis is Follow***");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFollowing, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFollowers, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFolowing, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFollower, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lblListName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFolowing)
                    .addComponent(btnFollower))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFollowing)
                    .addComponent(lblFollowers))
                .addGap(18, 18, 18)
                .addComponent(lblListName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFolowingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFolowingMouseClicked
        //MOSTAR SEGUIDOS
        AreaFollows.setText("");
        lblListName.setText("Mis Following");
            for (int i =0; i < mas.UsuarioActual.getNumFollowing(); i++) {
            String Follows=mas.UsuarioActual.getfollowing()[i] +"\n \n"+ AreaFollows.getText();
            AreaFollows.setText(Follows);
        }
    }//GEN-LAST:event_btnFolowingMouseClicked

    private void btnFollowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFollowerMouseClicked
        //MostrarSeguidores
        AreaFollows.setText("");
        lblListName.setText("Mis Followers");
        
        for (int i =0; i < mas.UsuarioActual.getNumFollowers(); i++) {
            
            String Follows=mas.UsuarioActual.getfollowers()[i] +"\n \n"+ AreaFollows.getText();
            AreaFollows.setText(Follows);
        }
    }//GEN-LAST:event_btnFollowerMouseClicked

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        MiPerfil mp =new MiPerfil(mas);
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaFollows;
    private javax.swing.JButton Return;
    private javax.swing.JButton btnFollower;
    private javax.swing.JButton btnFolowing;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFollowers;
    private javax.swing.JLabel lblFollowing;
    private javax.swing.JLabel lblListName;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
