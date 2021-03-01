/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class War2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el palo de la carta del jugador (Corazones, Picas, Tréboles, Diamantes)");        
        Card carta1 = new Card(leer.nextLine());
        
        System.out.println("Introduzca el palo de la carta de la máquina (Corazones, Picas, Tréboles, Diamantes)");
        Card carta2 = new Card(leer.nextLine());               
        
        System.out.println("Mi carta es el "+carta1.getCardRank()+" de "+carta1.getSuit());
        System.out.println("Tu carta"+carta2.getCardRank()+" de "+carta2.getSuit());
        
        carta1.calcularAlto(carta2);
        
    }
}
