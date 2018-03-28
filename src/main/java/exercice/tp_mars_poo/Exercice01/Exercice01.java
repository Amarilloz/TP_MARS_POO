/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.tp_mars_poo.Exercice01;

/**
 *
 * @author Formation
 */
public class Exercice01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int i = 0;
            while (i < 15) {
                i++;
                if (i == 1) {
                    System.out.println(i + " kilomètre à pied, ça use, ça use,\n"
                            + i + " kilomètre à pied, ça use les souliers.\n");
                } else {
                    System.out.println(i + " kilomètres à pied, ça use, ça use,\n"
                            + i + " kilomètres à pied, ça use les souliers.\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
