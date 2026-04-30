package mvc.view;
import java.util.Scanner;

public class ViewFrete {

    private Scanner scanner = new Scanner(System.in);

    public double getPeso() {
        System.out.print("Digite o peso (kg): ");
        return scanner.nextDouble();
    }

    public double getDistancia() {
        System.out.print("Digite a distância (km): ");
        return scanner.nextDouble();
    }

    public void mostrarResultado(double frete) {
        System.out.println("Frete calculado: R$ " + frete);
    }
}