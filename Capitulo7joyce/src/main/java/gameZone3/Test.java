/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Test {
    public static void main(String[] args) {
        SecretPhrase fr = new SecretPhrase();
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println(fr.getFrase());
            System.out.println("Introduzca su intento");
            char resp = leer.nextLine().charAt(0);
            if (fr.adivinanza(resp)) {
                break;
            }
            
        } while (true);

    }
}
