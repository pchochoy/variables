import javax.swing.*;

public class VariablesEjercicios {
    public static void main(String[] args) {
        double resultado;
        final double IVA = 0.21;

        String valorProducto = JOptionPane.showInputDialog(null,"Ingrese Numero");
        int valorProductoInt = Integer.parseInt(valorProducto);

        resultado = valorProductoInt + valorProductoInt * IVA;

        System.out.println(resultado);

        JOptionPane.showMessageDialog(null,"El Importe con IVA es " + resultado);
    }
}
