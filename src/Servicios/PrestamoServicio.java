package Servicios;

//@author Juli
import Entidades.Prestamo;
import java.util.Scanner;

public class PrestamoServicio {

    Scanner leer = new Scanner(System.in);

    public Prestamo altaPrestamo() {
        Prestamo p1 = new Prestamo();
        Integer nroprestamo = (int) Math.random();
        p1.setNroPrestamo(nroprestamo);
        System.out.println("Ingrese el monto solicitado");
        p1.setMonto(leer.nextDouble());
        p1.setInteres(p1.getMonto() * 0.10);
        p1.setSaldoAdeudado(p1.getMonto() + p1.getInteres());
        return p1;
    }

}
