public class Main {
    public static void main(String[] args) {

        MedioDeTransporte camionDisponible = new MedioDeTransporte(
          500.0, new Dimension(2.5,1.5,
                4),3);

        ObjetoTransportable silla = new ObjetoTransportable(
                "silla madera", 2.0,
                new Dimension(0.4,1,0.4),
                false);

        ObjetoTransportable televisor = new ObjetoTransportable(
                "tlc 42 pulgadas", 8.0,
                new Dimension(1.4,1,0.2),
                false);

        ObjetoTransportable sillaDeMetal = new ObjetoTransportable(
                "silla metal", 2.0,
                new Dimension(0.4,1,0.4),
                false);

        ObjetoTransportable televisorViejo = new ObjetoTransportable(
                "tlc sin pulgadas", 8.0,
                new Dimension(1.4,1,0.2),
                false);

        camionDisponible.cargar(silla);
        camionDisponible.cargar(televisor);
        camionDisponible.cargar(sillaDeMetal);
        camionDisponible.cargar(televisorViejo);

    }
}
