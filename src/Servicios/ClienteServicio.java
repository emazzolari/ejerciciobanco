package Servicios;

import Entidades.Cliente;
import Entidades.Cuenta;
import Entidades.Prestamo;
import java.util.ArrayList;
import java.util.Scanner;


public class ClienteServicio {
    Scanner leer = new Scanner(System.in);
    
       public Cliente altaCliente(){
        Cliente c1 = new Cliente();
        System.out.println("Ingrese el dni");
        c1.setDni(leer.nextInt());
        System.out.println("Ingrese el nombre");
        c1.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        c1.setApellido(leer.next()); 
        return c1;
        
    }
       
        public Cliente altaCta(Cliente c1){
        
        CuentaServicio cs = new CuentaServicio();
        Cuenta cta = cs.altaCuenta();
        c1.setCuenta(cta);
        
        
        //c1.setCuenta(cs.altaCuenta());
        
        return c1;
    }
        //El cliente pide UN prestamo
        public Cliente pedidoPrestamo(Cliente c1){
        PrestamoServicio presService = new PrestamoServicio();
        //TRAIGO DEL PRESTAMO SERVICE LOS DATOS DE ESTE NUEVO PRESTAMO
        Prestamo p = presService.altaPrestamo();
        //UTILIZO UN ARRAY TEMPORAL UTILIZANDO EL GETTER DEL ATRIBUTO DEL CLIENTE QUE TRAIGO POR PARÁMETRO
        ArrayList <Prestamo> listaPrestamos = c1.getPrestamo();
        //AGREGO EL NUEVO PRESTAMO EN MI ARRAY TEMPORAL
        listaPrestamos.add(p);
        //SETEO EL ARRAY TEMPORAL PARA "GRABAR" LOS CAMBIOS
        c1.setPrestamo(listaPrestamos);
        
        //RETORNO EL OBJETO CON SUS MODIFICACIONES
        return c1;
    }
}
