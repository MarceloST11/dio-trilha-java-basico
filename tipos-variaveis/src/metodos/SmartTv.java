package metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


public void ligar(){
    ligada = true;
}

public void desligar(){
    ligada = false;
}

public int mudarCanal(int n1){
    return canal = n1;
}

public void aumentarVolume(){
    volume ++; 
}

public void diminuirVolume(){
    volume --; 
}

}
