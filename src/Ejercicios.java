import javax.swing.*;

public class Ejercicios {

    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog(null,"Ingrese Numero 1");
        int valorNumero1nt = Integer.parseInt(numero1);

        String numero2 = JOptionPane.showInputDialog(null,"Ingrese Numero 2");
        int valorNumero2nt = Integer.parseInt(numero2);

        int resultado =   valorNumero1nt+ valorNumero2nt;
        JOptionPane.showMessageDialog(null,"Suma es " + resultado);

        resultado =   valorNumero1nt- valorNumero2nt;
        JOptionPane.showMessageDialog(null,"Resta es " + resultado);

        if(numero1.equals(numero2)) {
            JOptionPane.showMessageDialog(null,"Los numeros ingresados son Iguales");
        } else {
            if (valorNumero1nt > valorNumero2nt)
                JOptionPane.showMessageDialog(null,"Numero 1 es mayor a numero 2");
            else
                JOptionPane.showMessageDialog(null,"Numero 1 es menor a numero 2");
        }

        for (int i = 0; i<10; i++) {
            JOptionPane.showMessageDialog(null,"Iteración con i = " + i + " sumando a numero1 es " + (valorNumero1nt + i));
        }

        var resultadoComparacion = valorNumero1nt == valorNumero2nt ? "los valores son iguales" : "los valores no son iguales";
        JOptionPane.showMessageDialog(null,"resultadoComparacion es " + resultadoComparacion) ;

        boolean a = true;
        int vueltas = 0;
        while(a == true) {
            vueltas++;
            if(vueltas < 5)
                JOptionPane.showMessageDialog(null,"Vuelta Nro. " + vueltas);
            else a = false;

            switch (vueltas) {
                case (1):
                    JOptionPane.showMessageDialog(null,"case 1");
                    break;
                case (2):
                    JOptionPane.showMessageDialog(null,"case 2");
                    break;
                    default:
                        JOptionPane.showMessageDialog(null,"case default");
            }
        }
    }
}
