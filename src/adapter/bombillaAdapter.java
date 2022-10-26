package adapter;

public class bombillaAdapter implements bombilla {

    private Vela v = new Vela();

    @Override
    public String encender() {
        return v.PrenderFuego();
    }

    @Override
    public String aumentarIntensidad() {
        return v.EcharCCombustible();
    }

    @Override
    public String apagar() {
        return v.SoplarParaApagar();
    }

}
