import java.io.*;
import java.util.*;

public class Printer<T> {

    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
    }
}

output:

Your Output (stdout)
1
2
3
Hello
World
Expected Output
1
2
3
Hello
World