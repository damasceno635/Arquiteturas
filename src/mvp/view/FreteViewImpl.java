package mvp.view;
import java.util.Scanner;

public class FreteViewImpl implements FreteView {

    private Scanner scanner = new Scanner(System.in);

    public double getPeso() {
        System.out.print("Digite o Peso (Kg): ");
        return scanner.nextDouble();
    }

    public double getDistancia() {
        System.out.print("Digite a Distância (Km): ");
        return scanner.nextDouble();
    }

    public void mostrarResultado(double frete) {
        System.out.println("Frete calculado: R$ " + frete);
    }
}