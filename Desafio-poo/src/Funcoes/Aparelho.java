/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcoes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

/**
 *
 * @author alves
 */
public class Aparelho implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo Iphone!");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo Iphone!");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica pelo Iphone: " + musica);
    }
    
    @Override
    public void ligar(String numero) {
        System.out.println("Realizando Ligação... " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Ligação recebida...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acessando correio de voz...");
    }
    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da internet no navegador: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de navegação no navegador!");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página do navegador!");
    }
}
