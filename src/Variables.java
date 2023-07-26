public class Variables {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        String descripcion = "Sin Descripcion";
        String descripcion1 = "Sin Descripcion";
        System.out.println(descripcion.toLowerCase());
        System.out.println(descripcion.toUpperCase());

        int autos = 20;
        int ruedasxautos = 5;
        int cantRuedas =  autos * ruedasxautos;
        double presion = 30.5;

        int max_int = 2147483647;
        short max_short = 32767;
        short max_byte = 127;

        System.out.println("Cabtidad de ruedas totales es " + cantRuedas);
        System.out.println("Presion de ruedas es " + cantRuedas * presion);
        System.out.println("Maximo admisible en int es " + max_int);
        System.out.println("Maximo admisible en shortes " + max_short);
        System.out.println("Maximo admisible en byte " + max_byte);

        if (descripcion1 == descripcion) {
            System.out.println("0 - descripcion1 es igual a descripcion");
        }

        if (descripcion1.equals(descripcion)) {
            System.out.println("1 - descripcion1 es igual a descripcion");
        }
    }
}
