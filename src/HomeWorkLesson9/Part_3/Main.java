package HomeWorkLesson9.Part_3;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter("Integer Converter");
        System.out.println(converter.getName());

        System.out.println("===================================");
        System.out.println("Convert boolean to int: " + converter.convertToInt(true));
        System.out.println("Convert byte to int: " + converter.convertToInt(10));
        System.out.println("Convert short to int: " + converter.convertToInt(25));
        System.out.println("Convert int to int: " + converter.convertToInt(30));
        System.out.println("Convert long to int: " + converter.convertToInt(10000000000L));
        System.out.println("Convert char to int: " + converter.convertToInt('*'));
        System.out.println("Convert float to int: " + converter.convertToInt(12.34f));
        System.out.println("Convert double to int: " + converter.convertToInt(56.78));
        System.out.println("Convert String to int: " + converter.convertToInt("Hello, World!"));
        System.out.println();
        System.out.println("===================================");
        Converter converterDouble = new Converter("Double Converter");
        System.out.println(converterDouble.getName());
        System.out.println("Convert boolean to double: " + converterDouble.convertToDouble(true));
        System.out.println("Convert byte to double: " + converterDouble.convertToDouble(10));
        System.out.println("Convert short to double: " + converterDouble.convertToDouble(25));
        System.out.println("Convert int to double: " + converterDouble.convertToDouble(30));
        System.out.println("Convert long to double: " + converterDouble.convertToDouble(10000000000L));
        System.out.println("Convert char to double: " + converterDouble.convertToDouble('*'));
        System.out.println("Convert float to double: " + converterDouble.convertToDouble(12.34f));
        System.out.println("Convert double to double: " + converterDouble.convertToDouble(56.78));
        System.out.println("Convert String to double: " + converterDouble.convertToDouble("Hello, World!"));
        System.out.println();
        System.out.println("===================================");
        Converter converterString = new Converter("String Converter");
        System.out.println(converterString.getName());
        System.out.println("Convert byte to String: " + converterString.converToString((byte) 10));
        System.out.println("Convert short to String: " + converterString.converToString((short) 20));
        System.out.println("Convert int to String: " + converterString.converToString(30));
        System.out.println("Convert long to String: " + converterString.converToString(10000000000L));
        System.out.println("Convert char to String: " + converterString.converToString('*'));
        System.out.println("Convert boolean to String: " + converterString.converToString(true));
        System.out.println("Convert float to String: " + converterString.converToString(12.34f));
        System.out.println("Convert double to String: " + converterString.converToString(56.78));
        System.out.println("Convert String to String: " + converterString.converToString("Hello, World!"));


    }
}
