package com.semillero.factura;

public class Factura{
    private String atrEmisor;
    private String atrCliente;

    public Factura(String atrEmisor, String atrCliente) {
        this.atrEmisor = atrEmisor;
        this.atrCliente = atrCliente;
    }

    public void imprimirFactura(Producto prmProducto){
        System.out.println("Emisor: " + atrEmisor + " \nCliente: " + atrCliente + " \nProducto: " + prmProducto.getAtrNombreProducto() + " \nCantidad: " + prmProducto.getAtrCantidad() + " \nValor C/U: " + prmProducto.darValorUnitario() + " \nValor Total:" + prmProducto.darValorTotal());
    }
}