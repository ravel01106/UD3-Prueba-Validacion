package net.examenherencia.vehiculo;

public class Vehiculo {
    protected String marca;
    protected float peso;
    protected float potencia;
    protected int numPuertas;
    protected float velocidad;

    public Vehiculo(String marca, float peso, float potencia, int numPuertas, float velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numPuertas = numPuertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    public void acelerar(){
        final int AUMENTO_VELOCIDAD = 10;
        this.velocidad += AUMENTO_VELOCIDAD;
    }
}
