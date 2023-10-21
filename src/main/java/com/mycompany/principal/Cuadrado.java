/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Jaramillo
 */
public class Cuadrado extends FiguraGeometrica {
    private int Lado;

    public Cuadrado(String Color, int Lado) {
        super(Color);
        this.Lado = Lado;
    }

    
    
    @Override
 public void CalcularArea (){
     System.out.println("el area del cuadrado es: " + Lado * Lado);
     System.out.println("El color de la figura es: " + this.getColor());
 }

    
}
