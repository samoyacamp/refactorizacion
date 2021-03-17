/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author sergi
 */
public class Inventario {

    private double real;
    private double imag;
  
    public Inventario() {
   
    }
    public Inventario(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
   
    public Inventario sumar(Inventario c){
        Inventario aux = new Inventario();
        aux.real = real + c.real;
        aux.imag = imag + c.imag;
        return aux;
    }
   
    public Inventario restar(Inventario c){
        Inventario aux = new Inventario();
        aux.real = real - c.real;
        aux.imag = imag - c.imag;
        return aux;
    }
   
    public Inventario multiplicar(Inventario c){
        Inventario aux = new Inventario();
        aux.real = real * c.real - imag * c.imag;
        aux.imag = real * c.imag + imag * c.real;
        return aux;
    }

    public Inventario multiplicar(double n){
        Inventario aux = new Inventario();
        aux.real = real * n;
        aux.imag = imag * n;
        return aux;
    }

    public Inventario dividir(Inventario c){
        Inventario aux = new Inventario();
        aux.real = (real * c.real + imag * c.imag)/(c.real * c.real + c.imag * c.imag);
        aux.imag = (imag * c.real - real * c.imag)/(c.real * c.real + c.imag * c.imag);
        return aux;
    }

    //método toString
    @Override
    public String toString() {
        return "(" + real + ", " + imag + ")";
    }

    //método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Inventario other = (Inventario) obj;
        
        if (this.real != other.real) {
            return false;
        }else if (this.imag != other.imag) {
            return false;
        }
        return true;
    } 
}
    
