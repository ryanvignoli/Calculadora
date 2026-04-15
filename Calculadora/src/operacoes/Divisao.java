/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.Scanner;
import numeros.EntradaNumeros;
/**
 *
 * @author info226
 */
public class Divisao {
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedirNumeros();
        System.out.println(entradaNumeros.x / entradaNumeros.y); 
    }
}
