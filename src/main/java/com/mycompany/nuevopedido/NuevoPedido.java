/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class NuevoPedido {

    public static void main(String[] args) {
        //Persona per = new Persona();
        //Cliente 
        Cliente cli1 = new Cliente(10, "Fal 54", "2615332269", 
                new Pedido(1, 2500, EstadoPedido.EN_PROCESO, new Entrega()), 
                23456789, "Leonel", "Valdivia");
        
        //Pago
        Pago pag1 = new Pago(1, "Pagado", EstadoPedido.CERRADO, 2500);
        
        //Productos
        Producto pro = new Producto(1, "Marolio", 1000, 8);
        Producto pro1 = new Producto(2, "La Favorita", 1500, 2);
        
        //Asociamos los productos al cliente
        cli1.getPedidoCliente().setPago(pag1);
        cli1.getPedidoCliente().addProductos(pro);
        cli1.getPedidoCliente().addProductos(pro1);
        
        //Doc Venta
        DocumentoVenta docV = new DocumentoVenta(4, 2500, EstadoPedido.CERRADO);
        
        //Asociamos el docV al cliente
        cli1.getPedidoCliente().setDocumentoVenta(docV);
        
        //Info por pantalla
        System.out.println("\n\tDatos del Cliente"+
                "\nDNI: "+ cli1.getDni()+
                "\nCliente: "+ cli1.getNombrePersona()+
                "\nApellido: "+ cli1.getApellidoPersona()+
                "\nNumero de Cliente: "+ cli1.getNumeroCliente()+
                "\nEstado del Pedido: "+ cli1.getPedidoCliente().getEstado()+
                "\nNumero de Pedido: "+ cli1.getPedidoCliente().getNumeroPedido()+
                "\nNumero del pago: "+ cli1.getPedidoCliente().getPago().getNumeroPago()+
                "\nDescripcion del pago: "+ cli1.getPedidoCliente().getPago().getDescripcion()+
                "\nPrecio de Venta: "+ cli1.getPedidoCliente().getPrecio()+
                "\nProductos: "+ cli1.getPedidoCliente().getProductos().get(0).getMarca()
                + " y " + cli1.getPedidoCliente().getProductos().get(1).getMarca()+
                "\nNum del DocVenta: "+ cli1.getPedidoCliente().getDocumentoVenta().getNumeroDocumentoVenta()+
                "\nEstado del DocVen: "+ cli1.getPedidoCliente().getDocumentoVenta().getEstado()
        );        
        
        //Repartidor
        Repartidor rep = new Repartidor(2, 12345678, "Enzo", "Miretti");
  
        //Pedidos
        Pedido ped1 = new Pedido(3, 1000, EstadoPedido.CERRADO, new Entrega());
        Pedido ped2 = new Pedido(5, 1500, EstadoPedido.CERRADO, new Entrega());
        
        //Entrega
        Entrega en = new Entrega(3, "Campus UNC", ped1);
        Entrega en2 = new Entrega(5, "ITU", ped2);
        
        //Delivery 
        Delivery deli = new Delivery(200, EstadoPedido.EN_PROCESO, rep,
                ped1.getEntrega().getNumeroEntrega(), "Ciudad", ped1);
        Delivery del = new Delivery(150, EstadoPedido.EN_PROCESO, rep,
                ped2.getEntrega().getNumeroEntrega(), "Ciudad", ped2);
        
        //Asociamos los deliverys al repartidor
        rep.addDeliverys(deli);
        rep.addDeliverys(del);
        
        //Asociamos los productos con los pedidos, uso los mismos productos que antes 
        ped1.addProductos(pro);
        ped2.addProductos(pro1);
        
        //Creo nuevos doc para cada pedido
        DocumentoVenta doc1 = new DocumentoVenta(3, 1200, EstadoPedido.EN_PROCESO);
        DocumentoVenta doc2 = new DocumentoVenta(5, 1650, EstadoPedido.CERRADO);
        
        //Asociamos los doc a los pedidos
        ped1.setDocumentoVenta(doc1);
        ped2.setDocumentoVenta(doc2);
        
        //Info por pantalla 
        System.out.println("\n\tDatos del Repartidor");
        System.out.println("DNI: "+ rep.getDni()+
                "\nNombre: "+ rep.getNombrePersona()+
                "\nApellido: "+ rep.getApellidoPersona()+
                "\nNumero de Repartidor: "+ rep.getNumeroRepartidor()+
                "\n\tPedidos del Repartidor\t"+
                        "\nPrimer Pedido: "+
                "\nNumero: "+ rep.getDeliverys().get(0).getPedido().getNumeroPedido()+
                "\nNumero de Entrega: "+ rep.getDeliverys().get(0).getPedido().getEntrega().getNumeroEntrega()+
                "\nPrecio: "+ rep.getDeliverys().get(0).getPedido().getPrecio()+
                "\nNumero del Doc de Venta: "+ rep.getDeliverys().get(0).getPedido().getDocumentoVenta().getNumeroDocumentoVenta()+
                "\nImporte Total: "+ rep.getDeliverys().get(0).getPedido().getDocumentoVenta().getMonto()+
                "\nSegundo Pedido: "+
                "\nNumero: "+ rep.getDeliverys().get(1).getPedido().getNumeroPedido()+
                "\nNumero de Entrega: "+ rep.getDeliverys().get(1).getNumeroEntrega()+
                "\nPrecio: "+ rep.getDeliverys().get(1).getPedido().getPrecio()+
                "\nNumero del Doc de Venta: "+ rep.getDeliverys().get(1).getPedido().getDocumentoVenta().getNumeroDocumentoVenta()+
                "\nImporte Total: "+ rep.getDeliverys().get(1).getPedido().getDocumentoVenta().getMonto()
        );
    }
}
