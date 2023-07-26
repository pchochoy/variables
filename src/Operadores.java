import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        //operadores
        int variable0 = 100;
        int variable1 = 200;

        double variable2 = 100;
        double variable3 = 200;

        double resul = variable2 / variable3;

        System.out.println("Suma " + (variable0 + variable1));
        System.out.println("Resta " + (variable0 - variable1));
        System.out.println("División " + (variable0 / variable1));
        System.out.println("Producto " + (variable0 * variable1));
        System.out.println("Porcentual int " + (variable0 % variable1));
        System.out.println("Porcentual double " + (variable2 % variable3));
        System.out.println("resul es  " + resul);

        byte a = 100;
        byte b = 100;
        byte res1 = (byte) (a * b);
        int res2 = a * b;
        System.out.println(res1);
        System.out.println(res2);

        Date fecha = new Date();
        System.out.println(fecha);
    }
}
