package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Instrumento saxofon = new Viento("Saxofón", 150);
        Instrumento trompeta = new Viento("Trompeta", 200);
        Instrumento trombon = new Viento("Trombón", 450);

        Instrumento guitarra = new Cuerda("Guitarra", 100);
        Instrumento violin = new Cuerda("Violín", 300);
        Instrumento bajo = new Cuerda("Bajo", 100);

        Instrumento tambor = new Percusion("Tambor", 50);
        Instrumento bombo = new Percusion("Bombo", 150);
        Instrumento platillos = new Percusion("Platillos", 50);

        System.out.println("Número de veces que se ha cargado la clase Viento: " + Viento.getContador());
        System.out.println("Número de veces que se ha cargado la clase Cuerda: " + Cuerda.getContador());
        System.out.println("Número de veces que se ha cargado la clase Percusión: " + Percusion.getContador());

    }
}
