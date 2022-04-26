package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Viento saxofon = new Viento("Saxofón", 150);
        Viento trompeta = new Viento("Trompeta", 200);
        Viento trombon = new Viento("Trombón", 450);

        Cuerda guitarra = new Cuerda("Guitarra", 100);
        Cuerda violin = new Cuerda("Violín", 300);
        Cuerda bajo = new Cuerda("Bajo", 100);

        Percusion tambor = new Percusion("Tambor", 50);
        Percusion bombo = new Percusion("Bombo", 150);
        Percusion platillos = new Percusion("Platillos", 50);

        System.out.println("Número de veces que se ha cargado la clase Viento: " + Viento.getContador());
        System.out.println("Número de veces que se ha cargado la clase Cuerda: " + Cuerda.getContador());
        System.out.println("Número de veces que se ha cargado la clase Percusión: " + Percusion.getContador());
        System.out.println("Número de veces que se ha cargado la clase Instrumento: " + Instrumento.getContador());

    }
}
