package mvvm.viewmodel;

import mvvm.model.FreteModel;

public class FreteViewModel {

    private double peso;
    private double distancia;
    private double resultado;

    private FreteModel model = new FreteModel();

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getResultado() {
        return resultado;
    }

    public void calcular() {
        resultado = model.calcularFrete(peso, distancia);
    }
}