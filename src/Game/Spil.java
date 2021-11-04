package Game;

import java.util.Scanner;

//Denne klasse indeholder spillogikken
public class Spil {

    public static void main(String[] args) {
        String hemmeligSætning = "wheel of fortune ";
        Scanner scan;
        scan = new Scanner(System.in);
        String spillerGæt = " ";
        boolean ikkeFærdig = true;

        while (ikkeFærdig) {
            ikkeFærdig = false;
            for(char hemmeligtBogstav : hemmeligSætning.toCharArray()) {
                if (spillerGæt.indexOf(hemmeligtBogstav) == -1) {
                    System.out.print("*");
                    ikkeFærdig = true;
                } else {
                    System.out.print(hemmeligtBogstav);
                }

            }
            System.out.println("\nIndtast venligt det bogstav du gætter på");
            String bogstav = scan.next();
            spillerGæt += bogstav;
        }
        System.out.println("Tillykke du er færdig og har vundet spillet! ;)");

    }


}
