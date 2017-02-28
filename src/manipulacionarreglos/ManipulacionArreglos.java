/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.\
 */
package manipulacionarreglos;

import java.util.Arrays;

/**
 *
 * @author carlosjoseanguiano
 */
public class ManipulacionArreglos {

    public static void main(String[] args) {
        double[] arregloDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(arregloDouble);

        System.out.printf("\narregloDoubles: ");

        for (double valor : arregloDouble) {
            System.out.printf("%.1f ", valor);

        }

        //Llena arreglo de 10 elementos con 7
        int[] arregloIntLleno = new int[10];
        Arrays.fill(arregloIntLleno, 7);
        mostrarArreglo(arregloIntLleno, "arregloIntLleno");

        //copia el arreglo int en el arreglo copiaArregloInt
        int[] arregloInt = {1, 2, 3, 4, 5, 6};
        int[] copiaArregloInt = new int[arregloInt.length];
        System.arraycopy(arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
        mostrarArreglo(arregloInt, "arregloInt");
        mostrarArreglo(copiaArregloInt, "copiaArregloInt");

        //compara si arreglo y copia son iguales
        boolean b = Arrays.equals(arregloInt, copiaArregloInt);
        System.out.printf("\n\narregloInt %s copiaArregloInt\n",
                (b ? "==" : "!="));

        //compara si arregloInt y arregloIntLleno son iguales
        b = Arrays.equals(arregloInt, arregloIntLleno);
        System.out.printf("\n\narregloInt %s arregloIntLleno\n",
                (b ? "==" : "!="));

        //Busca en arregloInt el valor 5
        int ubicacion = Arrays.binarySearch(arregloInt, 5);

        if (ubicacion >= 0) {
            System.out.printf("Se encontro 5 en el elemento %d de arregloInt\n", ubicacion);

        } else {
            System.out.println("No se encontro el 5 en el arregloInt");
        }

        ubicacion = Arrays.binarySearch(arregloInt, 8767);
        if (ubicacion >= 0) {
            System.out.printf("Se encontro 8767 en el elemento %d de arregloInt\n", ubicacion);

        } else {
            System.out.println("No se encontro el 8767 en el arregloInt");
        }
    }

    public static void mostrarArreglo(int[] arreglo, String descripcion) {

        System.out.printf("\n%s : ", descripcion);

        for (int i : arreglo) {
            System.out.printf("%d ", i);
        }
    }
}
