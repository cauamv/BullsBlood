package br.com.bullsblood.principal;

import br.com.bullsblood.modelo.ModelMenu;
import br.com.bullsblood.modelo.ModelUser;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MainSystem extends javax.swing.JFrame {

    private final ModelUser user;
    
    private MainViewParty viewParty;

    public MainSystem(ModelUser user) {
        this.user = user;
        initComponents();
        init();
        getContentPane().setBackground(new Color(255, 255, 255));
        lbUser.setText("Olá, " + user.getNomeDeUsuario());
        this.viewParty = new MainViewParty();
        
    }
    
    private void init() {
        list1.addItem(new ModelMenu("Perfil", "perfil"));
        list3.addItem(new ModelMenu("Camera", "camera"));
        
        list2.addItem(new ModelMenu("Festa", "festa"));
        list2.addItem(new ModelMenu("Infantil", "infantil"));
        list2.addItem(new ModelMenu("Palestra", "palestra"));
        list2.addItem(new ModelMenu("Stand up", "standup"));
        list2.addItem(new ModelMenu("Show", "globo"));
        list2.addItem(new ModelMenu("Esporte", "bicicleta"));
        list2.addItem(new ModelMenu("Tecnologia", "cerebro"));
        list2.addItem(new ModelMenu("Cultura", "chapeu"));
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new br.com.bullsblood.swing.Panel();
        menu1 = new br.com.bullsblood.componente.Menu();
        lbUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        list2 = new br.com.bullsblood.componente.ListMenu<>();
        list1 = new br.com.bullsblood.componente.ListMenu<>();
        jLabel1 = new javax.swing.JLabel();
        formArtists1 = new br.com.bullsblood.form.FormArtists();
        list3 = new br.com.bullsblood.componente.ListMenu<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        lbUser.setBackground(new java.awt.Color(255, 255, 255));
        lbUser.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("User Name");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bullsblood/icone/1.png"))); // NOI18N

        list2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                list2MousePressed(evt);
            }
        });

        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                list1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Explorar");

        list3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                list3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addGroup(menu1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(list2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(list3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formArtists1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formArtists1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -5, 1600, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void list1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MousePressed
        list2.clearSelection();
        list3.clearSelection();
    }//GEN-LAST:event_list1MousePressed

    private void list2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list2MousePressed
        list1.clearSelection();
        list3.clearSelection();
    }//GEN-LAST:event_list2MousePressed

    private void list3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list3MousePressed
        viewParty.setVisible(true);
        list1.clearSelection();
        list2.clearSelection();
    }//GEN-LAST:event_list3MousePressed

    
    public static void main(ModelUser user) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystem(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.bullsblood.form.FormArtists formArtists1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbUser;
    private br.com.bullsblood.componente.ListMenu<String> list1;
    private br.com.bullsblood.componente.ListMenu<String> list2;
    private br.com.bullsblood.componente.ListMenu<String> list3;
    private br.com.bullsblood.componente.Menu menu1;
    private br.com.bullsblood.swing.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
