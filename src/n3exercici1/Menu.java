package n3exercici1;

import java.util.Scanner;

public class Menu {
    Redaccion redaccion;

    public Menu(Redaccion redaccion) {
        this.redaccion = redaccion;
    }

    public void mostrarMenu() {
        System.out.println("Gestor de redacción - Seleccione una opción:");
        System.out.println("1 - Introducir redactor");
        System.out.println("2 - Eliminar redactor");
        System.out.println("3 - Introducir noticia a un redactor");
        System.out.println("4 - Eliminar noticia");
        System.out.println("5 - Mostrar las noticias de un redactor");
        System.out.println("6 - Calcular puntuación de la noticia");
        System.out.println("7 - Calcular precio de la noticia");
        System.out.println("8 - Salir");
    }

    public void mostrarMenuIntroducirNoticia() {
        System.out.println("- Introducir noticia a un redactor -");
        System.out.println("Elige la categoría de la noticia:");
        System.out.println("1 - Fútbol");
        System.out.println("2 - Baloncesto");
        System.out.println("3 - Tenis");
        System.out.println("4 - Formula 1");
        System.out.println("5 - Motociclismo");
    }

    public void introducirRedactor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Introducir redactor -");
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el DNI:");
        String dni = scanner.nextLine();
        Redactor redactor = new Redactor(nombre, dni);
        redaccion.getRedactores().add(redactor);
        System.out.println("Redactor añadido correctamente.");
    }

    public void eliminarRedactor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Eliminar redactor -");
        System.out.println("Introduce el DNI del redactor:");
        String dni = scanner.nextLine();
        redaccion.getRedactores().removeIf(redactor -> redactor.getDni().equalsIgnoreCase(dni));
        System.out.println("Redactor eliminado correctamente.");
    }

    public void introducirNoticiaARedactor() {
        Scanner scanner = new Scanner(System.in);
        Noticia noticia = null;
        String titular;
        String competicion;
        String club;
        String equipo;
        String escuderia;
        String texto;
        String jugador;
        String tenista;
        int opcionNoticia;

        mostrarMenuIntroducirNoticia();
        opcionNoticia = scanner.nextInt();
        scanner.nextLine();

        switch (opcionNoticia) {
            case 1:
                System.out.println("- Fútbol -");
                System.out.println("Introduce el titular de la noticia:");
                titular = scanner.nextLine();
                System.out.println("Introduce el nombre de la competición:");
                competicion = scanner.nextLine();
                System.out.println("Introduce el nombre del club:");
                club = scanner.nextLine();
                System.out.println("Introduce el nombre del jugador:");
                jugador = scanner.nextLine();
                noticia = new NoticiaFutbol(titular, competicion, club, jugador);
                /*System.out.println("¿Quieres redactar ahora la noticia? S/N");
                String redactarAhora = scanner.nextLine()();
                if (redactarAhora.equalsIgnoreCase("s")){
                    System.out.println("Introduce el texto de la noticia:");
                    noticia.setTexto(scanner.nextLine()());
                }*/
                break;
            case 2:
                System.out.println("- Baloncesto -");
                System.out.println("Introduce el titular de la noticia:");
                titular = scanner.nextLine();
                System.out.println("Introduce el nombre de la competición:");
                competicion = scanner.nextLine();
                System.out.println("Introduce el nombre del club:");
                club = scanner.nextLine();
                noticia = new NoticiaBaloncesto(titular, competicion, club);
                /*System.out.println("¿Quieres redactar ahora la noticia? S/N");
                String redactarAhora = scanner.nextLine()();
                if (redactarAhora.equalsIgnoreCase("s")){
                    System.out.println("Introduce el texto de la noticia:");
                    noticia.setTexto(scanner.nextLine()());
                }*/
                break;
            case 3:
                System.out.println("- Tenis -");
                System.out.println("Introduce el titular de la noticia:");
                titular = scanner.nextLine();
                System.out.println("Introduce el nombre de la competición:");
                competicion = scanner.nextLine();
                System.out.println("Introduce el nombre del tenista:");
                tenista = scanner.nextLine();
                noticia = new NoticiaTenis(titular, competicion, tenista);
                /*System.out.println("¿Quieres redactar ahora la noticia? S/N");
                String redactarAhora = scanner.nextLine()();
                if (redactarAhora.equalsIgnoreCase("s")){
                    System.out.println("Introduce el texto de la noticia:");
                    noticia.setTexto(scanner.nextLine()());
                }*/
                break;
            case 4:
                System.out.println("- Formula 1 -");
                System.out.println("Introduce el titular de la noticia:");
                titular = scanner.nextLine();
                System.out.println("Introduce el nombre de la escuderia:");
                escuderia = scanner.nextLine();
                noticia = new NoticiaF1(titular, escuderia);
                /*System.out.println("¿Quieres redactar ahora la noticia? S/N");
                String redactarAhora = scanner.nextLine()();
                if (redactarAhora.equalsIgnoreCase("s")){
                    System.out.println("Introduce el texto de la noticia:");
                    noticia.setTexto(scanner.nextLine()());
                }*/
                break;
            case 5:
                System.out.println("- Motociclismo -");
                System.out.println("Introduce el titular de la noticia:");
                titular = scanner.nextLine();
                System.out.println("Introduce el nombre del equipo:");
                equipo = scanner.nextLine();
                noticia = new NoticiaMotociclismo(titular, equipo);
                /*System.out.println("¿Quieres redactar ahora la noticia? S/N");
                String redactarAhora = scanner.nextLine()();
                if (redactarAhora.equalsIgnoreCase("s")){
                    System.out.println("Introduce el texto de la noticia:");
                    noticia.setTexto(scanner.nextLine()());
                }*/
                break;
            default:
        }

        System.out.println("- Redactor -");
        mostrarRedactores();
        System.out.println("Introduce el DNI del redactor de la noticia:");
        String dni = scanner.nextLine();
        Redactor redactor = encontrarRedactorByDni(dni);
        redactor.getNoticias().add(noticia);
        System.out.println("Noticia introducida correctamente en el historial del redactor: " + redactor.getNombre());
    }

    public void eliminarNoticia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- Eliminar noticia -");
        System.out.println("Introduce el nombre del redactor:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el DNI del redactor:");
        String dni = scanner.nextLine();
        Redactor redactor = redaccion.getRedactores().stream()
                .filter(redactor1 -> dni.equalsIgnoreCase(redactor1.getDni()))
                .findAny().orElse(null);
        if (redactor != null) {
            redactor.getNoticias().forEach(System.out::println);
            System.out.println("Introduce el titular de la noticia que quieres eliminar:");
            String titular = scanner.nextLine();
            if (!redactor.getNoticias().removeIf(
                    noticia -> titular.equalsIgnoreCase(noticia.getTitular())
                    && nombre.equalsIgnoreCase(redactor.getNombre())
                    && dni.equalsIgnoreCase(redactor.getDni()))) {
                System.out.println("Error: No se puede encontrar la noticia introducida o el redactor es incorrecto.");
            } else System.out.println("Noticia eliminada correctamente.");
        } else {
            System.out.println("Este redactor no existe");
        }
    }

    public void mostrarNoticiasRedactores() {
        for (Redactor redactor : redaccion.getRedactores()) {
            System.out.println("Noticias de " + redactor.getNombre() + ":");
            for (Noticia noticia : redactor.getNoticias()) {
                System.out.println(noticia);
            }
        }
    }

    public void calcularPuntuacionNoticia() {
        Scanner scanner = new Scanner(System.in);
        mostrarNoticiasRedactores();
        System.out.println("Introduce el titular de la noticia de la que quieres calcular la puntuación:");
        String titular = scanner.nextLine();
        Noticia noticia = redaccion.getRedactores().stream()
                .flatMap(redactor -> redactor.getNoticias().stream()
                        .filter(noticia1 -> titular.equalsIgnoreCase(noticia1.getTitular())))
                .findFirst().orElse(null);
        if (noticia != null) {
            noticia.calcularPuntuacionNoticia();
            System.out.println("La puntuación de esta noticia es: " + noticia.getPuntuacion() + " puntos.");
        } else {
            System.out.println("La noticia introducida no existe.");
        }
    }

    public void calcularPrecioNoticia() {
        Scanner scanner = new Scanner(System.in);
        mostrarNoticiasRedactores();
        System.out.println("Introduce el titular de la noticia de la que quieres calcular la el precio:");
        String titular = scanner.nextLine();
        Noticia noticia = redaccion.getRedactores().stream()
                .flatMap(redactor -> redactor.getNoticias().stream()
                        .filter(noticia1 -> titular.equalsIgnoreCase(noticia1.getTitular())))
                .findFirst().orElse(null);
        if (noticia != null) {
            noticia.calcularPrecioNoticia();
            System.out.println("El precio de esta noticia es: " + noticia.getPrecio() + "€.");
        } else {
            System.out.println("La noticia introducida no existe.");
        }
    }

    public Redactor encontrarRedactorByDni(String dni) {
        return redaccion.getRedactores().stream()
                .filter(redactor -> dni.equalsIgnoreCase(redactor.getDni()))
                .findFirst()
                .orElse(null);
    }

    public void mostrarRedactores() {
        redaccion.getRedactores().forEach(System.out::println);
    }
}
