/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class PaginadeAcessoReajustar extends javax.swing.JFrame {

   
    public PaginadeAcessoReajustar() {
        initComponents();
        jReajustenovo.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBotaosaque = new javax.swing.JButton();
        j1Contaex1 = new javax.swing.JTextField();
        jReajustar = new javax.swing.JLabel();
        jReajustenovo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Conta: ");

        jBotaosaque.setText("Acessar");
        jBotaosaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaosaqueActionPerformed(evt);
            }
        });

        j1Contaex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1Contaex1ActionPerformed(evt);
            }
        });

        jReajustar.setText("Novo Reajuste:");

        jLabel2.setText("Taxa de Reajuste Conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotaosaque)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jReajustar))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jReajustenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1Contaex1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(j1Contaex1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jReajustar)
                    .addComponent(jReajustenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jBotaosaque)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaosaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaosaqueActionPerformed
                
        if((jReajustenovo.getText().trim().equals("")) || jReajustenovo.getText() == null){
            CadastroContas.cp.reajuste();
            JOptionPane.showMessageDialog(null, " rejuste automatico efetuado com sucesso!");
        }else{
            CadastroContas.cp.reajuste(Double.parseDouble(jReajustenovo.getText()));
            JOptionPane.showMessageDialog(null, " rejuste efetuado com sucesso!");
        }
        
       
       Operacoes novo1 = new Operacoes();
       novo1.setVisible(true);
       novo1.setLocationRelativeTo(null);
       novo1.setResizable(false);
       dispose();
    }//GEN-LAST:event_jBotaosaqueActionPerformed

    private void j1Contaex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1Contaex1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j1Contaex1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginadeAcessoReajustar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginadeAcessoReajustar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginadeAcessoReajustar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginadeAcessoReajustar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginadeAcessoReajustar().setVisible(true);
            }
        });
    }
    public Contas tipodeconta(){
        int contaex = Integer.parseInt(j1Contaex1.getText());
        
        if(contaex ==  CadastroContas.c.getNumero()){
            return CadastroContas.c;
        }else if(contaex == CadastroContas.cp.getNumero()){
            return  CadastroContas.cp;
        }else if(contaex == CadastroContas.ce.getNumero()){
            return  CadastroContas.ce;
        }else{
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField j1Contaex1;
    private javax.swing.JButton jBotaosaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jReajustar;
    private javax.swing.JTextField jReajustenovo;
    // End of variables declaration//GEN-END:variables
}