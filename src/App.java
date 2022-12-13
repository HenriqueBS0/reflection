import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ExceptionInstanciador {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Input: ");
        String input = entrada.nextLine();
        entrada.close();

        Object controller;

        try {
            controller = InstanciadorController.getInstancia(input);
            System.out.println(controller);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
