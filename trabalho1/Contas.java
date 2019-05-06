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
public class Contas {
    private String nome;
    private int numero;
    double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    
    public void depositar( double depositar){
        this.saldo= this.saldo+ depositar;
        
    }
    
    boolean sacar( double sacar){
        if ( sacar<=this.saldo){
            this.saldo= this.saldo-sacar;
            return (true);
        }
        else{
            return ( false);
        }
    }
    Contas vinicial;
    Contas vfinal;
    public void transferir( int conta1, int conta2, double valor ){
        
        if(conta1==CadastroContas.c.getNumero() ){
            vinicial=CadastroContas.c;
        } else if(conta1 == CadastroContas.cp.getNumero() ){
            vinicial=CadastroContas.cp; 
        } else {
            vinicial=CadastroContas.ce;
        }
        
        if(conta2==CadastroContas.c.getNumero()){
            vfinal=CadastroContas.c;
        }else if(conta2==CadastroContas.cp.getNumero()){
            vfinal=CadastroContas.cp;
        }else {
            vfinal=CadastroContas.ce;
        }
        vinicial.sacar(valor);
        vfinal.depositar(valor);
    }
    public void tipoConta(){
        
        System.out.printf("\nTipo de conta: Conta comum.\n");
    }
}
