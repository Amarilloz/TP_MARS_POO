/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.tp_mars_poo.Exercice05;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice05 {

    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int age = 0;
            int taille = 0;
            while (age == 0) {
                System.out.println("Saisir un âge :");
                while (!sc.hasNextInt()) {
                    sc.next();
                    System.out.println("Saisir un âge :");
                }
                age = sc.nextInt();
                System.out.println("Saisir une taille(cm) :");
                while (!sc.hasNextInt()) {
                    sc.next();
                    System.out.println("Saisir une taille(cm) :");
                }
                taille = sc.nextInt();
                if (age != 0) {
                    if (age > 20 && taille < 100) {
                        System.out.println("Vous êtes peut être un "
                                + "nain adulte?");
                    }
                    if (age > 20 && taille > 200) {
                        System.out.println("Vous êtes un géant adulte ");
                    }
                    if (age < 3 && taille < 50) {
                        System.out.println("Vous êtes peut être un bébé ");
                    }
                    if (age > 15 && age < 18 && taille > 150 && taille < 180) {
                        System.out.println("Vous êtes un ado !");
                    }
                }
                System.out.println("");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
