/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.tp_mars_poo.Exercice03;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice03 {

    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            switch (typeSapin()) {
                case 1:
                    sapinPlein();
                    break;
                case 2:
                    sapinVide();
                    break;
                case 3:
                    sapinCouche();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static int hauteurSapin() {
        int h = 0;
        System.out.println("Saisir une hauteur pour le sapin :");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Saisir une hauteur pour le sapin :");
        }
        h = sc.nextInt();
        return h;
    }

    public static void sapinPlein() throws Exception {
        int h = hauteurSapin();
        System.out.println("\nSapin plein de hauteur : " + h + "\n");
        for (int l = 1; l < h + 1; l++) {
            for (int espace = 0; espace < h - l; espace++) {
                System.out.print(" ");
            }
            for (int etoile = 0; etoile < 2 * l - 1; etoile++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void sapinVide() throws Exception {
        int h = hauteurSapin();
        System.out.println("\nSapin vide de hauteur : " + h + "\n");
        for (int l = 1; l < h + 1; l++) {
            for (int espace = 0; espace < h - l; espace++) {
                System.out.print(" ");
            }
            if (l != 1) {
                System.out.print("*");
            }
            for (int etoile = 0; etoile < 2 * l - 3; etoile++) {
                if (l == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println("");
        }
    }

    public static void sapinCouche() throws Exception {
        int h = hauteurSapin();
        System.out.println("\nSapin couché de hauteur : " + h + "\n");
        for (int l = 1; l < h + 2; l++) {
            for (int etoile = 0; etoile < l - 1; etoile++) {
                System.out.print("*");
            }
            if (l > 1) {
                System.out.println("");
            }
        }
        for (int l = h; l > 0; l--) {
            for (int etoile = 0; etoile < l - 1; etoile++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static int typeSapin() {
        int typeSapin = 0;
        do {
            if (typeSapin != 0
                    && typeSapin != 1 && typeSapin != 2 && typeSapin != 3) {
                System.out.println("Saisie invalide !");
            }
            System.out.println("Saisir le type de sapin :"
                    + "\n\t1 : Plein"
                    + "\n\t2 : Vide"
                    + "\n\t3 : Couché"
                    + "\n0 : FIN");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Saisie invalide !");
                System.out.println("Saisir le type de sapin :"
                        + "\n\t1 : Plein"
                        + "\n\t2 : Vide"
                        + "\n\t3 : Couché"
                        + "\n0 : FIN");
            }
            typeSapin = sc.nextInt();
        } while (typeSapin != 0
                && typeSapin != 1 && typeSapin != 2 && typeSapin != 3);
        return typeSapin;
    }
}
