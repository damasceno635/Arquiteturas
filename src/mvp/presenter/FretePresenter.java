package mvp.presenter;

import mvp.model.FreteModel;
import mvp.view.FreteView;

public class FretePresenter {

    private FreteView view;
    private FreteModel model;

    public FretePresenter(FreteView view, FreteModel model) {
        this.view = view;
        this.model = model;
    }

    public void calcular() {
        double peso = view.getPeso();
        double distancia = view.getDistancia();

        double frete = model.calcularFrete(peso, distancia);

        view.mostrarResultado(frete);
    }
}