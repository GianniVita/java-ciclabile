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

    void addElemento(int newNumber) {
        int[] num = new int[numeri.length + 1];


        for (int i = 0; i < numeri.length; i++) {
            num[i] = numeri[i];
        }   

        num[num.length - 1] = newNumber;
    }
}
