/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author mathe
 */
public class Operacoes extends javax.swing.JFrame {

    /**
     * Creates new form Acoes
     */
    public Operacoes() {
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

        jSaque = new javax.swing.JButton();
        jDeposito = new javax.swing.JButton();
        jSaldoatual = new javax.swing.JButton();
        jReajuste = new javax.swing.JButton();
        jTranferencia = new javax.swing.JButton();
        jSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSaque.setText("Saque");
        jSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaqueActionPerformed(evt);
            }
        });

        jDeposito.setText("Depósito");
        jDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositoActionPerformed(evt);
            }
        });

        jSaldoatual.setText("Saldo Atual");
        jSaldoatual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaldoatualActionPerformed(evt);
            }
        });

        jReajuste.setText("Reajuste");
        jReajuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReajusteActionPerformed(evt);
            }
        });

        jTranferencia.setText("Tranferência");
        jTranferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTranferenciaActionPerformed(evt);
            }
        });

        jSair.setText("Sair");
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTranferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSaldoatual, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jReajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTranferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jSaldoatual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSairActionPerformed

    private void jSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaqueActionPerformed
        PaginadeAcessoSacar pagacesso = new PaginadeAcessoSacar();
        pagacesso.setVisible(true);
        pagacesso.setLocationRelativeTo(null);
        pagacesso.setResizable(false);
        dispose();
        
    }//GEN-LAST:event_jSaqueActionPerformed

    private void jSaldoatualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaldoatualActionPerformed
        VerSaldo  VerSaldo = new VerSaldo();
        VerSaldo.setVisible(true);
        VerSaldo.setLocationRelativeTo(null);
        VerSaldo.setResizable(false);
        dispose();
    }//GEN-LAST:event_jSaldoatualActionPerformed

    private void jDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositoActionPerformed
       PaginadeAcessoDeposito pagacesso = new PaginadeAcessoDeposito();
       pagacesso.setVisible(true);
       pagacesso.setLocationRelativeTo(null);
       pagacesso.setResizable(false);
       dispose();
       
    }//GEN-LAST:event_jDepositoActionPerformed

    private void jReajusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReajusteActionPerformed
        PaginadeAcessoReajustar novo = new PaginadeAcessoReajustar();
        novo.setVisible(true);
        novo.setLocationRelativeTo(null);
        novo.setResizable(false);
        dispose();
    }//GEN-LAST:event_jReajusteActionPerformed

    private void jTranferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTranferenciaActionPerformed
        PaginadeAcessoTransferencia novo= new PaginadeAcessoTransferencia();
        novo.setVisible(true);
        novo.setLocationRelativeTo(null);
        novo.setResizable(false);
        dispose();
    }//GEN-LAST:event_jTranferenciaActionPerformed

    
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
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDeposito;
    private javax.swing.JButton jReajuste;
    private javax.swing.JButton jSair;
    private javax.swing.JButton jSaldoatual;
    private javax.swing.JButton jSaque;
    private javax.swing.JButton jTranferencia;
    // End of variables declaration//GEN-END:variables
}
