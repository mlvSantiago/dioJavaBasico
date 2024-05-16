public class SmartTv {
    boolean ligada=false;
    int canal=1; 
    int volume = 25;
    
    public void ligar(){
        ligada=true;
    }
    public void desligar (){
        ligada= false; 
    }
    public void aumentarvolume(){
        volume++;
    }
    public void diminuir(){
        volume--;
    }
    public void aumentarmudarcanal(){
        canal++;
    }
    public void descercanal(){
        canal--;
    }
    public void mudarcanal(int novoCanal){
        canal=novoCanal;
    }
}
