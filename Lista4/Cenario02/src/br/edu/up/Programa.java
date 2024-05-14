package Lista04.Cenario02;

public class Programa {
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre ponto1 e ponto2: " + distanciaPonto1Ponto2);

        Ponto coordenadas = new Ponto(7, 2);
        double distanciaPonto2Coordenadas = ponto2.calcularDistancia(coordenadas);
        System.out.println("Distância entre ponto2 e coordenadas (7,2): " + distanciaPonto2Coordenadas);

        ponto1.setX(10);

        ponto1.setY(3);

        System.out.println("Novas coordenadas de ponto1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
    }
}
