
/**
 *  Clase para probar el resto de clases
 *  
 *  Elaia
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

     /**
     * Constructor  
     */
    public TestPedido()    {
       pedido1 = new Pedido(new Fecha(4,9,2019),
                  new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra"),
                  new LineaPedido(new Producto("Rotulador fosforecente", 6.70), 20),
                  new LineaPedido(new Producto("Memoria USB 64GB", 14.80), 10));      
       
       
       

       pedido2 = new Pedido(new Fecha(8,10,2019),
                  new Cliente("Elisa Nuin", "C/ Río Alzania 7", "Pamplona", "Navarra"),
                  new LineaPedido(new Producto("Sacapuntas", 6.70), 20),
                  new LineaPedido(new Producto("Memoria USB 64GB", 14.80), 10));
         

    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.println("Pedido 1" + 
                            "\n-------------------" +
                            "\n" + pedido1.toString());
        System.out.println("Pedido 2" + 
                            "\n-------------------" +
                            "\n" + pedido2.toString());
        

    }
}
