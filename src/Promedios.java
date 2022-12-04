import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        int[] a = new int[7];
        int count = a.length;
        int positivos = 0, negativos = 0, ceros = 0;
        int sumaPos = 0, sumaNeg = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese un numero entero: ");
            a[i] = s.nextInt();
            if (a[i] > 0) {
                sumaPos += a[i];
                positivos++;
            } else if (a[i] < 0) {
                sumaNeg += a[i];
                negativos++;
            } else {
                ceros++;
            }
        }
        if (positivos == 0) {
            System.out.println("No se pudo calcular el promedio de números positivos porque no se ingresó ninguno");
        } else {
            System.out.println("Se ingresaron " + positivos + " números positivos que suman un total de: " + sumaPos +
                    " y su promedio es: " + ((double)sumaPos/positivos));
        }

        if (negativos == 0) {
            System.out.println("No se pudo calcular el promedio de números negativos porque no se ingresó ninguno");
        } else {
            System.out.println("Se ingresaron " + negativos + " números negativos que suman un total de: " + sumaNeg +
                    " y su promedio es: " + ((double)sumaNeg/negativos));
        }

        System.out.println("Se ingresaron " + ceros + " números cero");
    }
}
