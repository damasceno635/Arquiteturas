package mvc;

import mvc.controller.ControllerFrete;
import mvc.model.ModelFrete;
import mvc.view.ViewFrete;

public class Main {
    public static void main(String[] args) {
        ModelFrete model = new ModelFrete();
        ViewFrete view = new ViewFrete();

        ControllerFrete controller = new ControllerFrete(model, view);
        controller.executar();
    }
}