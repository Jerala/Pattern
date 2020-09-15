package study.mirea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    //    private List<String> stringList1 = new ArrayList<>(Arrays.asList("SomeString", "Patterns", "123"));
    private static List<String> stringList2 = new ArrayList<>(Arrays.asList("SecondArray", "StringToo", "", "Zero"));

    public static void main(String[] args) {
        StringSorter stringSorter = getSorter();
        List<String> result = stringSorter.sort(stringList2);
        System.out.println(result.toString());
    }

    private static StringSorter getSorter() {
        Scanner sc = new Scanner(System.in);
        boolean isCorrectNumberEntered = false;
        int number;
        while (!isCorrectNumberEntered) {
            try {
                System.out.println("Enter a number: ");
                number = Integer.parseInt(sc.nextLine());
                isCorrectNumberEntered = true;
                if (number % 2 == 0) {
                    return new StringByASCIISorter();
                }
                return new StringByLengthSorter();
            } catch (Exception e) {
                System.out.println("Exception: " + e.getLocalizedMessage());
                continue;
            }
        }
        return null;
    }

}
