public class Ciclabile {

    private int[] numeri;
    private int indice;


    public Ciclabile() {
        indice = 0;
        numeri = new int [0];
    }

    public Ciclabile(int[] numeri) {
        indice = 0;
        this.numeri = numeri;
    }

    int getElementoSuccessivo() {
        int element = numeri[indice];
        ++indice;
        return element;
    }

    boolean hasAncoraElementi() {
        boolean element = indice < numeri.length;
        return element;
    }


}
