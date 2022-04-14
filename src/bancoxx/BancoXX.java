
package bancoxx;

import Entidades.Cliente;
import Entidades.Prestamo;
import Servicios.ClienteServicio;
import Servicios.PrestamoServicio;
import java.util.ArrayList;


public class BancoXX {

    public static void main(String[] args) {
       
      ClienteServicio cs=new ClienteServicio();
      Cliente cc=new Cliente();
      PrestamoServicio ps= new PrestamoServicio();
      Prestamo p =new Prestamo();
      
      cs.altaCliente();
      p= ps.altaPrestamo();
      ArrayList <Prestamo> listaPrestamo=new ArrayList();
      listaPrestamo.add(p);
      cc.setPrestamo(listaPrestamo);
     
      
      cs.altaCta(cc);
        System.out.println(".....");
    
        System.out.println("....");
      cs.pedidoPrestamo(cc);
      
    }

    }
    

