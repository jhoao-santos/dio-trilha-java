public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuiVolume() {
        volume--;
    }




    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
