/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiodiobanco;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        
        Cliente rafael = new Cliente();
        rafael.setNome("Rafael Oliveira");
        
        Conta cc01 = new ContaCorrente(rafael); 
        Conta poupanca = new ContaPoupanca(rafael);
        
        cc01.depositar(100);
        cc01.transferir(50, poupanca);
        cc01.ImprimirExtrato();
        poupanca.ImprimirExtrato();
    }
}
