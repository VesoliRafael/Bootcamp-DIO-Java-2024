/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

import java.util.Scanner;

/**
 *
 * @author alves
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroConta;
        double saldo;
        String agencia, nomeCliente;
        
        System.out.println("Por favor, preencha os campos abaixo para o acesso de sua respectiva conta: ");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome do cliente: ");
            nomeCliente = input.nextLine();                    
        
        System.out.print("Digite o n�mero da conta: ");
            numeroConta = input.nextInt(); 
            
        System.out.print("Digite o n�mero da ag�ncia: ");
            agencia = input.next();
            
        System.out.print("Digite o valor que deseja depositar em sua conta corrente(CC): R$");
            saldo = input.nextDouble();
            
            System.out.println("");
                                  
        System.out.println("Ol� " + nomeCliente +", muito obrigado por criar uma conta "
                + "em nosso banco! O n�mero de sua conta �: " + numeroConta + ", ag�ncia: " + agencia + ", seu"
                + " saldo � de R$" + saldo + " Reais e j� est� dispon�vel para saque!");
        
    }
    
}
