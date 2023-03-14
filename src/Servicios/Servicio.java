/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Rectangulos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Servicio {
    Scanner sc = new Scanner(System.in);
    Rectangulo rect = new Rectangulo();
    
    public void llenar(){
        System.out.println("Ingrese la base:");
        rect.setBase(sc.nextInt());
        
        System.out.println("Ingrese la altura:");
        rect.setAltura(sc.nextInt());
    }
    
    public int perimetro(){
        return (rect.getBase() + rect.getAltura()) * 2;
    }
    
    public int superficie(){
        return rect.getBase() * rect.getAltura();
    }
    
    public void dibujar(){
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                //if(i==0 || i==rect.getAltura()-1){
                    System.out.print("*");
               /* }
                else if(j==0 || j==rect.getBase()-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }*/
            }
            System.out.println(" ");
        }
    }
}
