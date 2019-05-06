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
public class Principal {
    
    public static void main(String[] args) {
      
        
        
        JOptionPane.showMessageDialog(null,"\t\t\t\t\nBem Vindo!","Banco do Brasil",JOptionPane.PLAIN_MESSAGE);
        
        CadastroContas acesso1 = new CadastroContas();
        acesso1.setVisible(true);
        acesso1.setLocationRelativeTo(null);
        acesso1.setResizable(false);
        
        
  
        
        
        
    }
    
}
