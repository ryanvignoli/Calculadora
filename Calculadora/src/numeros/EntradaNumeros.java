/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author info226
 */
public class EntradaNumeros {
    public int x;
    public int y;
    
    public void pedirNumeros(){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
    }
}
