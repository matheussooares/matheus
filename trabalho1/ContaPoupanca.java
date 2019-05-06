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
public class ContaPoupanca extends Contas {
    
    public void reajuste( double taxa){
        double saldo=this.getSaldo();
        double saldoatual=saldo*(taxa/100)+ saldo;
        this.setSaldo(saldoatual);
        
    }
     
    public void reajuste(){
        double saldo= this.getSaldo();
        double saldoatual=saldo*0.1 + saldo;
        this.setSaldo(saldoatual);
        
    }
    public void tipoConta(){
        System.out.printf("\nTipo de conta: Conta-Poupança");
    }
}
