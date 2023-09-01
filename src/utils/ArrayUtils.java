package utils;

import java.util.Random;

public class ArrayUtils {

    public static void print(int[] variavelArray) {
        System.out.printf("[");
        for (int i = 0; i < variavelArray.length; i++) {
            System.out.printf(" %d ", variavelArray[i]);
        }
        System.out.printf("]%n");
    }

    public static void printPositions(int[] variavelArray) {
        int qtdChar = 0;
        for (int i = 0; i < variavelArray.length; i++) {
            int c = Integer.toString(variavelArray[i]).length();
            if (c > qtdChar) qtdChar = c;
        }
        qtdChar = qtdChar + 1;
        for (int i = 0; i < variavelArray.length; i++) System.out.printf("+" + "-".repeat(qtdChar + 1), i);
        System.out.printf("%n");
        for (int i = 0; i < variavelArray.length; i++) {
            System.out.printf("|%" + qtdChar + "d ", variavelArray[i]);
        }
        System.out.printf("%n");
        for (int i = 0; i < variavelArray.length; i++) System.out.printf("|%" + qtdChar + "d ", i);
        System.out.printf("%n");
        for (int i = 0; i < variavelArray.length; i++) System.out.printf("+" + "-".repeat(qtdChar + 1), i);
    }

    public static void preencherArrayComValoresInteirosAleatorios(int[] variavelArray, int limiteSuperior, boolean permitirRepetidos) {
        Random geradorRandomico = new Random();
        for (int i = 0; i < variavelArray.length; i++) {
            int valorGerado = geradorRandomico.nextInt(limiteSuperior);
            if (permitirRepetidos) variavelArray[i] = valorGerado;
            else {
                while (hasValue(variavelArray, valorGerado)) {
                    valorGerado = geradorRandomico.nextInt(limiteSuperior);
                }
                variavelArray[i] = valorGerado;
            }
        }
    }

    public static boolean hasValue(int[] arrayInteiro, int valor) {
        boolean achou = false;
        int i = 0;
        while (!achou && i < arrayInteiro.length) {
            if (arrayInteiro[i] == valor) achou = true;
            i++;
        }
        return achou;
    }

    public static void clone(int[] arrayInteiroOrigem, int[] arrayInteiroDestino) {
        for (int i = 0; i < arrayInteiroOrigem.length; i++) {
            arrayInteiroDestino[i] = arrayInteiroOrigem[i];
        }
    }
}
