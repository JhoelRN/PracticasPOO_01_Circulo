/*
   CLASE CIRCULO
        MAIN 01
 */
package edu.utp.poo.utilitarios;

/**
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */

public class Circulo {
    
    //Atributos
    private Punto centro;
    private double radio;
    
    
    public Circulo() {  // constructor sin parámetros
    }

    public Circulo(double cx, double cy,double r) {  //constructor
        centro = new Punto(cx,cy);
        if (r < 0) {
            msgEsNegativo();
            r = -r;
        }
        radio = r; 
    }
    
    //Metodos publicos
    protected void msgEsNegativo(){
        System.out.println("El radio es negativo. Se convierte a positivo");
    }
    
    public double longCircunferencia(){
        System.out.println("La longitud de la circunferencia es: ");
        return 2*Math.PI*radio;
    }
    
    public double areaCirculo(){
        System.out.println("El área de la circunferencia es: ");
        return Math.PI*radio*radio;
    }
}
