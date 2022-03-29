package simple_factory;

public class FabricaMijlocTransport {

    public static MijlocTransport getMijlocTransport(TipMijlocTransport tipMijlocTransport,
                                                     String nrInmatriculare) {
        switch (tipMijlocTransport) {
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
