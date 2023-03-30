package net.examenherencia.vehiculo.tipos.camion;

import net.examenherencia.vehiculo.Vehiculo;

public class Camion extends Vehiculo {
    private float carga;
    public Camion(String marca, float peso, float potencia, int numPuertas, float velocidad, float carga) {
        super(marca, peso, potencia, numPuertas, velocidad);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    @Override
    public void acelerar(){
        final int AUMENTO_VELOCIDAD = 5;
        this.velocidad += AUMENTO_VELOCIDAD;
    }
    @Override
    public String toString(){
        String msg = "------------------------------------------------\n";
        msg+= "Tipo de vehículo: Camión.\n";
        msg+= "Marca: " + this.marca + ".\n";
        msg+= "Peso: " + this.peso + ".\n";
        msg+= "Potencia: " + this.potencia + ".\n";
        msg+= "Numero de puertas: " + this.numPuertas + ".\n";
        msg+= "Velocidad actual: " + this.velocidad + ".\n";
        msg+= "------------------------------------------------";
        return msg;
    }
}
