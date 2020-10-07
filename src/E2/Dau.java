package E2;

import java.util.Random;

public class Dau {

    private int valor;
    Random rng =  new Random();

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int tirar(){
        this.valor = rng.nextInt(6)+1;

        return this.valor;
    }

    @Override
    public String toString() {
        return "Dau{" + "valor=" + valor + '}';
    }
}
