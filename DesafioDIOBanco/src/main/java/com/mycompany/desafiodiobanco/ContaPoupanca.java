/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiodiobanco;

/**
 *
 * @author User
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void ImprimirExtrato() {
        System.out.println("===Extrato Conta Poupança===");
        super.ImprimirInfosComuns();
    } 
    
}
