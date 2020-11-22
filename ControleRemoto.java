/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author clara
 */
public class ControleRemoto implements Controlador{
    
    //Atributos.
    private int volume = 50;
    private boolean ligado = false;
    private boolean tocando = false;
    
    @Override
    public void ligar(){
        
        this.setLigado(true);
        
    }
    
    @Override
    public void desligar(){
        
        this.setLigado(false);
        
    }
    
    @Override
    public void abrirMenu(){
        
        System.out.println("---------MENU---------");
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.println("Volume: "+this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
            
            
        }
        
        System.out.println("");
        
    }
    
    @Override
    public void fecharMenu(){
        
        System.out.println("Menu fechado.");
                
    }
    
    @Override
    public void maisVolume(){
        
        if (this.getLigado()){
                
                this.setVolume(this.getVolume() + 5);
            
        }else{
            
            System.out.println("TV desligada, não posso aumentar o volume.");
            
        }
        
    }
    
    @Override
    public void menosVolume(){
        
        if (this.getLigado()){
            
                this.setVolume(this.getVolume() - 5);
            
        }else{
            
            System.out.println("TV desligada, não posso diminuir o volume.");
        }
    }
    
    @Override
    public void ligarMudo(){
        
        if (this.getLigado() && this.getVolume() > 0){
            
            this.setVolume(0);
            
        }
        
    }
    
    @Override
    public void desligarMudo(){
        
        if (this.getLigado() && this.getVolume() == 0){
            
            this.setVolume(50);
            
        }
        
    }
    
    @Override
    public void play(){
        
        if (this.getLigado() && !(this.getTocando())){
            
            this.setTocando(true);
            
        }else {
            
            System.out.println("Não consegui reproduzir.");
            
        }
        
    }
    
    @Override
    public void pause(){
        
        if (this.getLigado() && !(this.getTocando())){
            
            this.setTocando(false);
            
        }else {
            
            System.out.println("Não consegui pausar.");
            
        }
        
    }
    
    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getTocando() {
        return this.tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }
    
    
    
}
