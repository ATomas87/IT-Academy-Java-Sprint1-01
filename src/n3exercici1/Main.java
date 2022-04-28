package n3exercici1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Redaccion redaccion = new Redaccion();
        Menu menu = new Menu(redaccion);
        int opcion;

        do {
            menu.mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    menu.introducirRedactor();
                    break;
                case 2:
                    menu.eliminarRedactor();
                    break;
                case 3:
                    menu.introducirNoticiaARedactor();
                    break;
                case 4:
                    menu.eliminarNoticia();
                    break;
                case 5:
                    menu.mostrarNoticiasRedactores();
                    break;
                case 6:
                    menu.calcularPuntuacionNoticia();
                    break;
                case 7:
                    menu.calcularPrecioNoticia();
                    break;
                case 8:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Introduce una opción válida");
            }
        } while (true);
    }
}