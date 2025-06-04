public class Main {
    public static void main(String[] args) {
        
        Televisao tv = new Televisao(80, "Philips", 220, 30);


        tv.status();
        tv.ligar();
        tv.aumentarVolume();
        tv.subirCanal();
        tv.subirCanal();
        tv.diminuirVolume();
        tv.descerCanal();
        tv.desligar();
        tv.status();
    }
}
