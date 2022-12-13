public class CriadorCaminho {
    public static String getCaminho(String input) throws ExceptionInstanciador {
        validaInput(input);
        
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("controllers.");
        stringBuilder.append(input.substring(1, 2).toUpperCase().concat(input.substring(2)));
        stringBuilder.append("Controller");
        
        return stringBuilder.toString();
    }

    private static void validaInput(String input) throws ExceptionInstanciador {
        vericaStringNaoVazia(input);
        verificaPrimeiroCaracterIsBarra(input);
        verificaNomeValido(input);
    }

    private static void vericaStringNaoVazia(String input) throws ExceptionInstanciador {
        if(input.length() == 0) {
            throw new ExceptionInstanciador("String vazia informada.");
        }
    }

    private static void verificaPrimeiroCaracterIsBarra(String input) throws ExceptionInstanciador {
        if(input.charAt(0) != '/') {
            throw new ExceptionInstanciador("Barra no inicio do input não informada.");
        }
    }

    private static void verificaNomeValido(String input) throws ExceptionInstanciador {

        if(input.length() == 1) {
            throw new ExceptionInstanciador("Não foi informado o controlador.");
        }

        if(!input.substring(1, input.length()).matches("[A-Za-z]*")) {
            throw new ExceptionInstanciador("O nome deve ser composto somente por letras.");
        }
    }
}
