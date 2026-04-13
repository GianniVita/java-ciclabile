import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("I numeri del mio Array");

        int[] numeri = { 10, 20, 30, 40 };
        Ciclabile box = new Ciclabile(numeri);
        Ciclabile userBox = new Ciclabile();

        while (box.hasAncoraElementi()) {
            System.out.println(box.hasAncoraElementi());
            int element = box.getElementoSuccessivo();
            userBox.addElemento(element);
            System.out.println(element);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il tuo numero!");

        int userNumber = scan.nextInt();
        userBox.addElemento(userNumber);
        scan.close();

        while (userBox.hasAncoraElementi()) {
            System.out.println(userBox.hasAncoraElementi());
            int element = userBox.getElementoSuccessivo();
            System.out.println(element);
        }
    }
}
