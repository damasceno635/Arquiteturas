package mvp;

import mvp.model.FreteModel;
import mvp.presenter.FretePresenter;
import mvp.view.FreteView;
import mvp.view.FreteViewImpl;

public class Main {
    public static void main(String[] args) {
        FreteView view = new FreteViewImpl();
        FreteModel model = new FreteModel();

        FretePresenter presenter = new FretePresenter(view, model);
        presenter.calcular();
    }
}