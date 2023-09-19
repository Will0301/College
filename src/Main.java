import service.LaboratoryService;
import service.MyFileReader;
import utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        teste10();
        teste100();
        teste1000();
        teste10000();
        teste10004();
        teste100000();
        teste1000000();
        teste2000000();
    }

    private static void teste10(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_10.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }

    private static void teste100(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_100.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }

    private static void teste1000(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_1000.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }

    private static void teste10000(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_10000.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }

    private static void teste10004(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_10004.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }

    private static void teste100000(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_100000.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }

    private static void teste1000000(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_1000000.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }

    private static void teste2000000(){
        String[] result = LaboratoryService.evaluate(MyFileReader.readTextFileToArray("TestCases/ct_2000000.txt"));
        ArrayUtils.print(result);
        System.out.print("Tamanho do DNA: " + result.length + "\n");
    }
}