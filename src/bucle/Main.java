/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle;

import java.util.Scanner;

/**
 *
 * @author DESKTOP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese cuantos numeros de las serie fibonacci desea conocer");
        Scanner scanner = new Scanner(System.in);
        int numfinal = scanner.nextInt();
        int numinicio = 1;
        int numsiguiente = 1;
        System.out.print("La serie Fibonacci de " + numfinal + " son los numeros:");
        int i = 1;
        while (i <= numfinal) {
            System.out.print(numinicio + " ");
            int sum = numinicio + numsiguiente;
            numinicio = numsiguiente;
            numsiguiente = sum;
            i++;
        }

    }

}
