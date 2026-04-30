package mvc.controller;

import mvc.model.ModelFrete;
import mvc.view.ViewFrete;

public class ControllerFrete {

    private ModelFrete model;
    private ViewFrete view;

    public ControllerFrete(ModelFrete model, ViewFrete view) {
        this.model = model;
        this.view = view;
    }

    public void executar() {
        double peso = view.getPeso();
        double distancia = view.getDistancia();

        double frete = model.calcularFrete(peso, distancia);

        view.mostrarResultado(frete);
    }
}