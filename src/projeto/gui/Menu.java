/*
 * Criado para o projeto interdiciplinar II da universidade anhembi morumbi no ano de 2016
 * 
 * Autores:   
 * Henrique Alves Conzatti
 * Ra: 20686577
 * Egerton Maciel
 * Ra: 20709502
 * Michael Arcângelo
 * Ra: 20714553
 * Rafael Sommer
 * Ra: 20709887
 *
 */

package projeto.gui;

import projeto.main.GlobalInstance;



public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu2
     */
    public Menu() {
        initComponents();
        
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button3 = new java.awt.Button();
        button2 = new java.awt.Button();
        button1 = new java.awt.Button();
        button5 = new java.awt.Button();
        button4 = new java.awt.Button();

        button3.setLabel("Listar Times");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button2.setLabel("Cadastro de Times");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button1.setLabel("Cadastro de Partidas");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button5.setLabel("Sobre este Sistema");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button4.setLabel("Listar Partidas");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
       
        GlobalInstance.janela.remove(GlobalInstance.menu);
        GlobalInstance.janela.add(GlobalInstance.cPartida);
        GlobalInstance.cPartida.updateUI();
        GlobalInstance.cPartida.setVisible(true);
        GlobalInstance.cPartida.atualizarTimes();
        
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        GlobalInstance.janela.remove(GlobalInstance.menu);
        GlobalInstance.janela.add(GlobalInstance.cTime);
        GlobalInstance.cTime.updateUI();
        GlobalInstance.cTime.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        GlobalInstance.janela.remove(GlobalInstance.menu);
        GlobalInstance.janela.add(GlobalInstance.lTime);
        GlobalInstance.lTime.updateUI();
        GlobalInstance.lTime.setVisible(true);
        GlobalInstance.lTime.Atualiza();
        
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        GlobalInstance.janela.remove(GlobalInstance.menu);
        GlobalInstance.janela.add(GlobalInstance.lPartida);
        GlobalInstance.lPartida.updateUI();
        GlobalInstance.lPartida.setVisible(true); 
        GlobalInstance.lPartida.Atualiza();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        GlobalInstance.janela.remove(GlobalInstance.menu);
        GlobalInstance.janela.add(GlobalInstance.about);
        GlobalInstance.about.updateUI();
        GlobalInstance.about.setVisible(true);
    }//GEN-LAST:event_button5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    // End of variables declaration//GEN-END:variables
}
