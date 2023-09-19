package utils;

import java.util.Random;

public class ArrayUtils {

    public static void print(String[] variavelArray) {
        System.out.printf("[");
        for (int i = 0; i < variavelArray.length; i++) {
            System.out.printf(" %s ", variavelArray[i]);
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

    public static void clone(String[] arrayInteiroOrigem, String[] arrayInteiroDestino) {
        for (int i = 0; i < arrayInteiroOrigem.length; i++) {
            arrayInteiroDestino[i] = arrayInteiroOrigem[i];
        }
    }

    public static String[] adicionaArray(String[] arr1, String[] arr2) {
        int tamanhoTotal = arr1.length + arr2.length;
        String[] resultado = new String[tamanhoTotal];

        for (int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            resultado[i + arr1.length] = arr2[i];
        }

        return resultado;
    }

    public static String[] adicionaElemento(String[] arr, String novaString) {
        int tamanhoOriginal = arr.length;
        int novoTamanho = tamanhoOriginal + 1;

        String[] novoArray = new String[novoTamanho];

        ArrayUtils.clone(arr, novoArray);
        novoArray[novoTamanho - 1] = novaString;

        return novoArray;
    }
}
