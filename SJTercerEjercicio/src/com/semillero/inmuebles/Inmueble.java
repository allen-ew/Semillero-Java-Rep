package com.semillero.inmuebles;

public abstract class Inmueble {
    protected String atrIdInmobiliario;
    protected int atrArea;
    protected String atrDireccion;

    public Inmueble(String atrIdInmobiliario, int atrArea, String atrDireccion) {
        this.atrIdInmobiliario = atrIdInmobiliario;
        this.atrArea = atrArea;
        this.atrDireccion = atrDireccion;
    }
    public abstract int calcularPrecio();
}
