import net.examenherencia.vehiculo.Vehiculo;
import net.examenherencia.vehiculo.tipos.camion.Camion;
import net.examenherencia.vehiculo.tipos.ciclomotor.Ciclomotor;

public class MainVehiculos {
    public static void main(String[] args) {
        String msg = "Vamos primeramente a mostrar las velocidades de los objetos:";
        Vehiculo vehiculoUno = new Vehiculo("Volvo", 150.7f,200.3f,4,20.3f);
        Camion camionUno = new Camion("Audi", 360.8f,250.4f,3,25.4f,400.33f);
        Ciclomotor ciclomotorUno = new Ciclomotor("Renault", 100.6f,150.2f,2,30.6f,true);
        System.out.println(msg);
        msg = "El del vehiculoUno es: " + vehiculoUno.getVelocidad() + ".\n";
        msg += "El del camionUno es: " + camionUno.getVelocidad() + ".\n";
        msg += "El del ciclomotorUno es: " + ciclomotorUno.getVelocidad() + ".";
        System.out.println(msg);
        msg= "------------------------------------------------\n";
        msg += "Vamos a hacerlos acelerar una vez y volvemos a mostrar la velocidad...acelerando....¡mostrando!";
        System.out.println(msg);
        vehiculoUno.acelerar();
        camionUno.acelerar();
        ciclomotorUno.acelerar();
        msg = "El del vehiculoUno es: " + vehiculoUno.getVelocidad() + ".\n";
        msg += "El del camionUno es: " + camionUno.getVelocidad() + ".\n";
        msg += "El del ciclomotorUno es: " + ciclomotorUno.getVelocidad() + ".";
        System.out.println(msg);
        msg = "------------------------------------------------\n";
        msg += "Ahora vamos a mostrar todos los atributos de camionUno y ciclomotorUno:\n";
        msg += camionUno.toString() + "\n\n";
        msg += ciclomotorUno.toString();
        System.out.println(msg);
    }
}