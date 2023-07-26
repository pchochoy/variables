public class Strings {
    public static void main(String[] args) {
        String nombre = "Pablo"; //No permite modificar el valor sino que crea uno nuevo y deja basura en memoria
        String tema = new String("Manejo de Strings");

        StringBuilder nombre2 = new StringBuilder("Daniel"); //Permite modificar el valor

        nombre = nombre + " Chochoy";
        System.out.println(nombre);
    }
}
