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
            int n = 0;
            do {
                n = typeSapin();
                switch (n) {
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
            } while (n != 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static int hauteurSapin() {
        int h = 0;
        System.out.println("\nSaisir une hauteur pour le sapin :");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Saisie invalide !");
            System.out.println("\nSaisir une hauteur pour le sapin :");
        }
        h = sc.nextInt();
        return h;
    }

    public static void sapinPlein() throws Exception {
        int h = hauteurSapin();
        System.out.println("\nSapin plein de hauteur : " + h + "\n");
        for (int i = 1; i < h + 1; i++) {
            for (int espace = 0; espace < h - i; espace++) {
                System.out.print(" ");
            }
            for (int etoile = 0; etoile < 2 * i - 1; etoile++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void sapinVide() throws Exception {
        int h = hauteurSapin();
        System.out.println("\nSapin vide de hauteur : " + h + "\n");
        for (int i = 1; i < h + 1; i++) {
            for (int espace = 0; espace < h - i; espace++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("*");
            }
            for (int etoile = 0; etoile < 2 * i - 3; etoile++) {
                if (i == h) {
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
        for (int i = 1; i < h + 2; i++) {
            for (int etoile = 0; etoile < i - 1; etoile++) {
                System.out.print("*");
            }
            if (i > 1) {
                System.out.println("");
            }
        }
        for (int j = h; j > 0; j--) {
            for (int etoile = 0; etoile < j - 1; etoile++) {
                System.out.print("*");
            }
            if (j != 1) {
                System.out.println("");
            }
        }
    }

    public static int typeSapin() {
        int typeSapin = 0;
        do {
            if (typeSapin != 0
                    && typeSapin != 1 && typeSapin != 2 && typeSapin != 3) {
                System.out.println("Saisie invalide !");
            }
            System.out.println("\nSaisir le type de sapin :"
                    + "\n\t1 : Plein"
                    + "\n\t2 : Vide"
                    + "\n\t3 : Couché"
                    + "\n0 : FIN");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Saisie invalide !");
                System.out.println("\nSaisir le type de sapin :"
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
