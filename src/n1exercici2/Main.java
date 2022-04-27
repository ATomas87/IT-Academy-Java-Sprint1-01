package n1exercici2;

public class Main {
    public static void main(String[] args) {

        /*Al ser static, pero no final, podemos modificar el valor de la variable de clase modelo,
         aunque sea en el constructor:*/
        Coche coche1 = new Coche(200, "León");
        Coche coche2 = new Coche(150, "Ibiza");

        /*Por el contrario, no es posible modificar la constante de clase MARCA debido al uso
         de la palabra reservada final, que impide que el valor pueda ser cambiado.*/
        //Coche.MARCA = "Ferrari";
        System.out.println(Coche.MARCA);

        /*Se puede observar que la variable modelo puede ser modificada, pero al ser una variable de clase,
         es el último valor introducido el que se guarda.*/
        System.out.println(Coche.modelo);
        Coche.modelo = "Altea";
        System.out.println(Coche.modelo);

        //El método accelerar es un método de instancia y no de clase al no ser static. Por este motivo, se necesita una instancia de la clase para
        //poder ser utilizado.
        coche1.accelerar();

        //El método frenar es un método de clase al ser static. Por este motivo, no es necesaria una instancia de la clase para poder ser utilizado.
        Coche.frenar();

        coche2.accelerar();
        Coche.frenar();
    }
}
