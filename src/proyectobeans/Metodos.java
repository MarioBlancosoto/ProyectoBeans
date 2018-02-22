
package proyectobeans;

import paquete.Pedido;
import paquete.Producto;


public class Metodos {
    
    
    public void engadir(){
        Producto pr = new Producto();
        Pedido p = new Pedido();
        
        pr.addPropertyChangeListener(p);
        pr.setStockactual(10);
        System.out.println("Stock actual :"+pr.getStockactual());
        
        pr.setStockactual(-1);
        
        System.out.println("Stock actual :"+pr.getStockactual());
      
        
    }
    
    
}
