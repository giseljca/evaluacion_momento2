/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Jaramillo
 */
public class Circulo extends FiguraGeometrica {
    private double radio;   

    public Circulo(String Color, double radio) {
        super(Color);
        this.radio = radio;
    }
    
    @Override
    public void CalcularArea (){
     System.out.println("El color de la figura es: " + this.getColor());
     System.out.println("el area del circulo es: " + radio * radio * 3.14);
 }
}
