package Game

import java.util.*

//Denne klasse indeholder spillogikken
object Spil {
    @JvmStatic
    fun main(args: Array<String>) {
        val hemmeligSætning = "wheel of fortune "
        val scan: Scanner
        scan = Scanner(System.`in`)
        var spillerGæt = " "
        var ikkeFærdig = true
        while (ikkeFærdig) {
            ikkeFærdig = false
            for (hemmeligtBogstav in hemmeligSætning.toCharArray()) {
                if (spillerGæt.indexOf(hemmeligtBogstav) == -1) {
                    print("*")
                    ikkeFærdig = true
                } else {
                    print(hemmeligtBogstav)
                }
            }
            println("\nIndtast venligt det bogstav du gætter på")
            val bogstav = scan.next()
            spillerGæt += bogstav
        }
        println("Tillykke du er færdig og har vundet spillet! ;)")
    }
}