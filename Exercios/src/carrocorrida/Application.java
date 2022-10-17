package carrocorrida;
public class Application {
    public static void main(String[] args) {
        CarroCorrida mercedes = new CarroCorrida(
                "Daivid",
                1,
                200.0
        );

        mercedes.ligar();
        mercedes.acelerar(20);
        mercedes.parar();
        mercedes.desligar();
        mercedes.acelerar(100);
        mercedes.acelerar(100);
    }
}