package adapter;

public class bombillaClasica implements bombilla {

    @Override
    public String encender() {
        return ("Encendido clásico");
    }

    @Override
    public String aumentarIntensidad() {
        return ("Aumentando intensidad clasico");
    }

    @Override
    public String apagar() {
        return ("Apagado clásico");
    }

}
