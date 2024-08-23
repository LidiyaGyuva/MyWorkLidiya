package HomeWorkLesson9.Part_3;

public class Converter {

   /* Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
    метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
    При вводе boolean выводитсообщение, что введен тип boolean.

    convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
    При вводе boolean выводит сообщение, что введен тип boolean.

    converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

    У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
    А также только один метод геттер для получения информации о названии данного конвертра.*/

    private String name;

    public String getName() {
        return name;
    }

    public Converter(String name) {
        this.name = name;
    }


    //INT converter

    public String convertToInt(boolean value) {
        return "Введен тип boolean";
    }

    public int convertToInt(byte numberByte) {
        return (int) numberByte;
    }

    public int convertToInt(short numberShort) {
        return (int) numberShort;
    }

    public int convertToInt(int numberInt) {
        return numberInt;
    }

    public int convertToInt(long numberLong) {
        return (int) numberLong;
    }

    public int convertToInt(char numbChar) {
        return (int) numbChar;
    }

    public int convertToInt(double numbDouble) {
        return (int) numbDouble;
    }

    public int convertToInt(String numbString) {
        return (Integer.parseInt(numbString));
    }

    public int convertToInt(float numbFloat) {
        return (int) numbFloat;
    }

// BOOLEAN converter

    public double convertToDouble(Object value) {
        if (value instanceof Boolean) {
            System.out.println("Введен тип boolean, конвертация невозможна.");
            return 0.0;
        } else if (value instanceof Byte) {
            return (double) (Byte) value;
        } else if (value instanceof Short) {
            return (double) (Short) value;
        } else if (value instanceof Integer) {
            return (double) (Integer) value;
        } else if (value instanceof Long) {
            return (double) (long) (Long) value;
        } else if (value instanceof Character) {
            return (double) (char) (Character) value;
        } else if (value instanceof Float) {
            return (double) (float) (Float) value;
        } else if (value instanceof Double) {
            return (double) (Double) value;
        } else if (value instanceof String) {
            return Double.parseDouble((String) value);
        } else {
            System.out.println("Неподдерживаемый тип данных.");
        }
        return 0;
    }

//STRING converter

    public String converToString(boolean stringBoolean) {
        return Boolean.toString(stringBoolean);
    }

    public String converToString(byte stringByte) {
        return Byte.toString(stringByte);
    }

    public String converToString(short stringShort) {
        return Short.toString(stringShort);
    }

    public String converToString(int stringInt) {
        return Integer.toString(stringInt);
    }

    public String converToString(long stringLong) {
        return Long.toString(stringLong);
    }

    public String converToString(char stringChar) {
        return Character.toString(stringChar);
    }

    public String converToString(double stringDouble) {
        return Double.toString(stringDouble);
    }

    public String converToString(float stringFloat) {
        return Float.toString(stringFloat);
    }

    public String converToString(String newString) {
        return newString;
    }


}
