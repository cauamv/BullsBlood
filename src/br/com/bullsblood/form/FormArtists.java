
package br.com.bullsblood.form;

import br.com.bullsblood.modelo.ModelPopular;
import javax.swing.ImageIcon;


public class FormArtists extends javax.swing.JPanel {


    public FormArtists() {
        initComponents();
        init();
    }
    
    private void init() {
        mostPopular.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/FESTA_DO_ENZO.png")), "", ""));
        mostPopular.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/festinha.png")), "", ""));
        mostPopular.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/clavison.png")), "", ""));
        mostPopular.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/bora_codar.png")), "", ""));
        mostPopular1.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/indiano.png")), "", ""));
        mostPopular1.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/ROBERTO.png")), "", ""));
        mostPopular1.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/PALESTRA_1.png")), "", ""));
        mostPopular1.addImage(new ModelPopular(new ImageIcon(getClass().getResource("/br/com/bullsblood/icone/ROBERTO_1.png")), "", ""));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mostPopular = new br.com.bullsblood.componente.MostPopular();
        mostPopular1 = new br.com.bullsblood.componente.MostPopular();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(129, 23, 23));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Eventos");

        jLabel2.setBackground(new java.awt.Color(129, 23, 23));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Recomendados");

        jLabel3.setBackground(new java.awt.Color(129, 23, 23));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Eventos");

        jLabel4.setBackground(new java.awt.Color(129, 23, 23));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mais Populares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(mostPopular, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addComponent(mostPopular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostPopular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostPopular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private br.com.bullsblood.componente.MostPopular mostPopular;
    private br.com.bullsblood.componente.MostPopular mostPopular1;
    // End of variables declaration//GEN-END:variables
}
