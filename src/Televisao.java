public class Televisao {

    // Atributos
    private int tamanhoTela;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;
    private boolean ligada;


    public Televisao(int tamanhoTela, String marca, int voltagem, int canal) {
        this.tamanhoTela = tamanhoTela;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
        this.volume = 5;
        this.ligada = false;
    }

    // Métodos
    public void ligar() {
        if (!ligada) {
            ligada = true;
            int consumo = voltagem * tamanhoTela;
            System.out.println("TV ligada. Consumo: " + consumo + " Watts.");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("TV desligada.");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > 1) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    public void subirCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void descerCanal() {
        if (canal > 1) {
            canal--;
        }
        System.out.println("Canal atual: " + canal);
    }

    public void status() {
        System.out.println("---- Status da TV ----");
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanhoTela + " polegadas");
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("-----------------------");
    }
}
