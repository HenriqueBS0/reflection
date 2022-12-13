import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InstanciadorController {
    public static Object getInstancia(String input) throws ExceptionInstanciador, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> classT;
        
        try {
            classT = Class.forName(CriadorCaminho.getCaminho(input));
        } catch (ClassNotFoundException e) {
            throw new ExceptionInstanciador("A classe não foi encontrada.");
        }

        Constructor<?> construtorT = classT.getDeclaredConstructor();

        return construtorT.newInstance();
    }
}
