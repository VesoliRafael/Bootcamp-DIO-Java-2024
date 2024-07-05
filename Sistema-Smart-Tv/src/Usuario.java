/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.smart.tv;

/**
 *
 * @author alves
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        SmartTv smartTv = new SmartTv();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("");
        
        smartTv.ligar();
        System.out.println("Tv ligada!" + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        smartTv.mudarCanal(35);
            
        
    }
}
