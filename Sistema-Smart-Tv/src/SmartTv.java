/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.smart.tv;

/**
 *
 * @author alves
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + novoCanal);
        
    }
    
    public void aumentarCanal() {
        canal++;
    }
    
    public void diminuirCanal() {
        canal--;
    }
    
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume...: " + volume);
    }
    
    public void diminuirVolume() {    
        volume--;
        System.out.println("Diminuindo volume...: " + volume);
    }
    
    public void ligar() {
        ligada = true;
    }  
    
    public void desligar() {
        ligada = false;
    }  
       
}

