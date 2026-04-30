package mvvm.view;

import java.util.Scanner;
import mvvm.viewmodel.FreteViewModel;

public class FreteView {

    public void iniciar() {
        try (Scanner scanner = new Scanner(System.in)) {
            FreteViewModel vm = new FreteViewModel();

            System.out.print("Digite o Peso (Kg): ");
            vm.setPeso(scanner.nextDouble());

            System.out.print("Digite a Distância (Km): ");
            vm.setDistancia(scanner.nextDouble());

            vm.calcular();

            System.out.println("Frete calculado: R$ " + vm.getResultado());
        } 
    }
}