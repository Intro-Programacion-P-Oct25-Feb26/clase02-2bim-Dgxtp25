/*
    Estudiante:Luis - M1:8.1 M2:7.9 PROM: 8,0000
    Estudiante:Ana - promedio final: 9,1000
    Estudiante:Mónica - promedio final: 9,6000
    Estudiante:José - promedio final: 9,9000
    Estudiante:Juan - promedio final: 9,8000
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        // Se declara un arreglo de tipo double, llamado promedios
        double[] promediosMateria1 = {8.1, 9.0, 9.5, 10.0, 9.9};
        double[] promediosMateria2 = {7.9, 9.2, 9.7, 9.8, 9.7};
        String[] estudiantes = {"luis", "ana", "mónica", "josé", "juan"};
        double[] promediosFinales = new double[5];

        double sumaNotas;
        double promedio;

        String mensajeFinal = ""; // Reporte final

    // cálculo de promedios
        for (int i = 0; i < promediosFinales.length; i++) {
            sumaNotas = promediosMateria1[i] + promediosMateria2[i];
            promedio = sumaNotas / 2;
            promediosFinales[i] = promedio;
        }

    // generar reporte
        for (int i = 0; i < promediosMateria1.length; i++) {

            mensajeFinal = String.format(
                    "%sEstudiante:%s - promedio final: %.4f (m1:%.1f | m2:%.1f)\n",
                    mensajeFinal,
                    estudiantes[i],
                    promediosFinales[i],
                    promediosMateria1[i],
                    promediosMateria2[i]
            );
        }

        System.out.printf("%s\n", mensajeFinal);

    }

}
