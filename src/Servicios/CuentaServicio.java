package Servicios;

//@author Juli

import Entidades.Cuenta;
import java.util.Scanner;


public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    
    
    public Cuenta altaCuenta(){
        Cuenta c1 = new Cuenta();
        Integer nroCta = (int) Math.random();
        c1.setNroCta(nroCta);
        c1.setSaldo(0.00);
        System.out.println("Ingrese el tipo de cuenta - CA - CC");
        c1.setTipo(leer.next());
        return c1;
    }


}
