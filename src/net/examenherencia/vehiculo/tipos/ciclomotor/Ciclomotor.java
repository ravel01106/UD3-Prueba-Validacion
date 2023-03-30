package net.examenherencia.vehiculo.tipos.ciclomotor;

import net.examenherencia.vehiculo.Vehiculo;

public class Ciclomotor extends Vehiculo {
    private boolean habilitadoAutopista;

    public Ciclomotor(String marca, float peso, float potencia, int numPuertas, float velocidad, boolean habilitadoAutopista) {
        super(marca, peso, potencia, numPuertas, velocidad);
        this.habilitadoAutopista = habilitadoAutopista;
    }

    public boolean isHabilitadoAutopista() {
        return habilitadoAutopista;
    }

    public void setHabilitadoAutopista(boolean habilitadoAutopista) {
        this.habilitadoAutopista = habilitadoAutopista;
    }
    @Override
    public void acelerar(){
        final int AUMENTO_VELOCIDAD = 7;
        this.velocidad += AUMENTO_VELOCIDAD;
    }
    @Override
    public String toString(){
        String msg = "------------------------------------------------\n";
        msg+= "Tipo de vehículo: Ciclomotor.\n";
        msg+= "Marca: " + this.marca + ".\n";
        msg+= "Peso: " + this.peso + ".\n";
        msg+= "Potencia: " + this.potencia + ".\n";
        msg+= "Numero de puertas: " + this.numPuertas + ".\n";
        msg+= "Velocidad actual: " + this.velocidad + ".\n";
        msg+= "------------------------------------------------";
        return msg;
    }

}
