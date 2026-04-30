package mvp.model;
public class FreteModel {

    public double calcularFrete(double peso, double distancia) {
        double frete = (peso * 0.5) + (distancia * 0.2);

        if (peso > 10) {
            frete += 10;
        }

        return frete;
    }
}