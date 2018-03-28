/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.Exercice02;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice02 {

    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int n = 0;
            double r = 0;

            saisirEntier();
            n = sc.nextInt();
            if (n == 0) {

            }

            System.out.println("");

            for (int i = 0; i < n; i++) {
                saisirReel();
                r = r + sc.nextDouble();
                System.out.println("");
            }
            System.out.println("La somme de ces " + n + " nombres réels est : " + r);
            System.out.println("La moyenne de ces " + n + " nombres réels est : " + r / n);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void saisirEntier() throws Exception {
        System.out.println("Entrer un nombre entier :");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Saisie invalide\n"
                    + "\rEntrer un nombre entier :");
        }

    }

    public static void saisirReel() throws Exception {
        System.out.println("Entrer un nombre réel :");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Saisie invalide\n"
                    + "\rEntrer un nombre réel :");
        }

    }

}
