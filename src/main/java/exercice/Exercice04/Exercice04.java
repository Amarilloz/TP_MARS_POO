/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.Exercice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice04 {

    static final Random random = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static List<Integer> score = new ArrayList<Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            do {
                System.out.println("");
                jeuTrouverNombre();
            } while (rejouer() == true);
            System.out.println("");
            afficherMeilleurScore();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static int jeuTrouverNombre() throws Exception {
        int x = 0;
        while (x == 0) {
            x = random.nextInt(100);
        }

        int i = 0;
        int n = 0;
        do {
            n = saisirEntier_1_100();
            if (n >= 1 && n <= 100) {
                if (n < x) {
                    System.out.println("X est supérieur à " + n + "\r");
                }
                if (n > x) {
                    System.out.println("X est inférieur à " + n + "\r");
                }
                if (n == x) {
                    System.out.println("X est égal à " + n + "\r");
                }
                i++;
            }
        } while (n != x);
        System.out.println("\nBRAVO !\n"
                + "Vous avez trouvé X : " + x + "\n"
                + "Score : " + i);
        score.add(i);
        return i;

    }

    public static int saisirEntier_1_100() throws Exception {
        int n = 0;
        do {
            System.out.println("Saisir un entier entre 1 et 100 :");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Saisie invalide !\n");
                System.out.println("Saisir un entier entre 1 et 100 :");
            }
            n = sc.nextInt();
            if (n < 1 || n > 100) {
                System.out.println("Saisie invalide !\n");
            }
        } while (n < 1 || n > 100);
        return n;
    }

    public static boolean rejouer() throws Exception {
        String s = "";
        System.out.println("R : pour rejouer\n"
                + "Q : pour afficher le meilleur score et quitter");
        s = sc.next();
        while (!s.equalsIgnoreCase("R") && !s.equalsIgnoreCase("Q")) {
            System.out.println("Saisie invalide !\n");
            System.out.println("R : pour rejouer\n"
                    + "Q : pour afficher le meilleur score et quitter");
            s = sc.next();
        }
        if (s.equalsIgnoreCase("R")) {
            return true;
        } else {
            return false;
        }
    }

    private static void afficherMeilleurScore() throws Exception {
        int meilleurScore = 0;
        int valtemp = score.get(0);
        for (Integer id : score) {
            if (valtemp > id) {
                valtemp = id;
            }
        }
        meilleurScore = valtemp;
        System.out.println("Votre meilleur score est : " + meilleurScore);
    }

}
