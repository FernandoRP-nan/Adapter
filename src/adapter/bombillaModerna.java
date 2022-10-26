package adapter;

public class bombillaModerna implements bombilla {

    @Override
    public String encender() {
        return ("Encendido moderno");
    }

    @Override
    public String aumentarIntensidad() {
        return ("Aumentando intensidad moderno");
    }

    @Override
    public String apagar() {
        return ("Apagado moderno");
    }

}
