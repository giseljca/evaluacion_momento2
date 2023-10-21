/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Jaramillo
 */
public class Principal {

    public static void main(String[] args) {
       System.out.println("******Cuadrado*******");
       System.out.println("");
       Cuadrado C1 = new Cuadrado ("azul", 4);
       C1.CalcularArea();
       Cuadrado C2 = new Cuadrado ("Verde", 10);
       C2.CalcularArea();
       System.out.println("");
       System.out.println("+++++++circulo++++++");
       System.out.println("");
       Circulo cir1 = new Circulo ("Rojo", 5);
       cir1.CalcularArea();
       Circulo cir2 = new Circulo ("Amarillo", 1);
       cir2.CalcularArea();
    }
}
