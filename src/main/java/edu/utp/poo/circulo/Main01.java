/*
 * CLASE PRINCIPAL MAIN01: POO_01_CIRCULO
 */
package edu.utp.poo.circulo;
import edu.utp.poo.utilitarios.*;
/**
 * Programación Orientada a Objetos.
 * @author Jhoel RN MH
 * jhoelrn@hotmail.com
 */
public class Main01 {

    public static void main(String[] args) {
        
        Circulo obj1 = new Circulo();
        System.out.println(obj1.longCircunferencia());
        System.out.println(obj1.areaCirculo());
        
        Circulo obj2= new Circulo(100, 100, -10);
        System.out.println(obj2.longCircunferencia());
        System.out.println(obj2.areaCirculo());

    }
}
