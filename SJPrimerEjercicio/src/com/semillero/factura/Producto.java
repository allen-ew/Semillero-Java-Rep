package com.semillero.factura;

public class Producto extends Precio{
    private String atrNombreProducto;
    private int atrCantidad;

    public Producto(String atrNombreProducto, int atrCantidad, int prmValorProducto) {
        super(prmValorProducto);
        this.atrNombreProducto = atrNombreProducto;
        this.atrCantidad = atrCantidad;
    }

    public String getAtrNombreProducto() {
        return atrNombreProducto;
    }

    public void setAtrNombreProducto(String atrNombreProducto) {
        this.atrNombreProducto = atrNombreProducto;
    }

    public int getAtrCantidad() {
        return atrCantidad;
    }

    public void setAtrCantidad(int atrCantidad) {
        this.atrCantidad = atrCantidad;
    }

    public int darValorTotal(){
        return atrCantidad * super.atrValor;
    }

    public int darValorUnitario(){
        return super.atrValor;
    }
}
