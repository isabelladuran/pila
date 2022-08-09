/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author ISABE
 */
public class Productos extends Base{

    private int cantidadProducto;
    private String nombreProducto;
    private double precioProducto;

    public Productos() {
    }

    public Productos(String nombreProducto,int cantidadProducto, double precioProducto) {
        this.cantidadProducto = cantidadProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    /**
     * Get the value of precioProducto
     *
     * @return the value of precioProducto
     */
    public double getPrecioProducto() {
        return precioProducto;
    }
    /**
     * Set the value of precioProducto
     *
     * @param precioProducto new value of precioProducto
     */
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    /**
     * Get the value of cantidadProducto
     *
     * @return the value of cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * Set the value of cantidadProducto
     *
     * @param cantidadProducto new value of cantidadProducto
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

       @Override
    public Base copy() {
        
       return new Productos( nombreProducto,cantidadProducto, precioProducto);
        
    }

    @Override
    public String toString() {
        return "Productos" + "\nCantidad Producto= " + cantidadProducto +
               "\nNombre Producto= " + nombreProducto + "\nPrecio Producto=" + precioProducto + "\n";
    }
    
    
    
}
