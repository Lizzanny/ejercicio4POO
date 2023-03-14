/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia04poo;

import Servicios.Servicio;
import Rectangulos.Rectangulo;
/**
 *
 * @author LizzW
 *
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 */
public class Guia04POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ser = new Servicio();
        ser.llenar();
        System.out.println("El perimetro es:" + ser.perimetro());
        System.out.println("La superfice es: " +ser.superficie());
        ser.dibujar();
    }

}
