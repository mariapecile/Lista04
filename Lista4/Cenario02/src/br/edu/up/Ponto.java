package Lista04.Cenario02;

import java.lang.Math;

class Ponto {
    public double x;
    public double y;

    // Construtor que cria um ponto na origem (0,0)
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    // Construtor que cria um ponto nas coordenadas (x, y)
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para calcular a distância entre dois pontos
    public double calcularDistancia(Ponto outroPonto) {
        double distancia = Math.sqrt(Math.pow(this.x - outroPonto.x, 2) + Math.pow(this.y - outroPonto.y, 2));
        return distancia;
    }

    // Método para alterar o valor de x
    public void setX(double x) {
        this.x = x;
    }

    // Método para alterar o valor de y
    public void setY(double y) {
        this.y = y;
    }

    // Método para retornar o valor de x
    public double getX() {
        return this.x;
    }

    // Método para retornar o valor de y
    public double getY() {
        return this.y;
    }
}
