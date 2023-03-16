import com.semillero.factura.Producto;
import com.semillero.factura.Factura;

public class Main {
    public static void main(String[] args) {

        Producto varProducto = new Producto("Manzana", 3,500);
        Factura varFactura = new Factura("Alejandro", "Allen");
        varFactura.imprimirFactura(varProducto);
    }
}