
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("I numeri del mio Array");

        int[] numeri = {10, 20, 30, 40};
        Ciclabile box = new Ciclabile(numeri);

       while(box.hasAncoraElementi()) {
            System.out.println(box.hasAncoraElementi());
            int element = box.getElementoSuccessivo();
            System.out.println(element);
        }

    }
}
