import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        double[] number2 = new double[]{1.57, 7.654, 9.986};
        int[] number3 = {10, 15, 20};
        System.out.println("Задача №2");
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]);
            if (i != number1.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i != number2.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < number3.length; i++) {
            System.out.print(number3[i]);
            if (i != number3.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("Задача №3");
        for (int i = number1.length - 1; i >= 0; i--) {
            System.out.print(number1[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = number3.length - 1; i >= 0; i--) {
            System.out.print(number3[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("Задача №4");
        for (int i = 0; i < number1.length; i++) {
            if(number1[i] % 2 != 0 ){
                number1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number1));
    }
}