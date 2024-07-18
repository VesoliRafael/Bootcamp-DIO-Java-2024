/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartphone;

import Funcoes.Aparelho;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

/**
 *
 * @author alves
 */
public class Iphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aparelho iphone = new Aparelho();
        
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;
        ReprodutorMusical reprodutorMusical = iphone;
        
        aparelhoTelefonico.ligar("(Numero telefônico)");
        navegadorInternet.exibirPagina("www.Google.com.br");
        reprodutorMusical.selecionarMusica("(Musica)");
    }
    
}
