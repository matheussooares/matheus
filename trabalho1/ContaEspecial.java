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
public class ContaEspecial extends Contas {
    
    public int limite;
    public double multa;

   

   
    
    public void descontar( double limiteutilizado ,double multa){
        double multaaplicada;
        multaaplicada=(((multa)/100)*limiteutilizado);
        this.saldo= this.saldo-multaaplicada-limiteutilizado;      
         
     
    }
    
    
    public void tipoConta(){
        
        System.out.printf("Conta Especial");
    }
    
    
}
