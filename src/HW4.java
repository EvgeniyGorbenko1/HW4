import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        //№1234
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array lenght:");
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = scanner.nextInt();
        }
     //   for (int i = 0; i < lenght; i++) {
     //       array[i] = (int) (Math.random() * 100); //Случайные числа
     //       System.out.println(array[i]);
     //   }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        int minInd = 0;
        int maxInd = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minInd]) {
                minInd = i;
            }
            if (array[i] > array[maxInd]) {
                maxInd = i;
            }
        }
        System.out.println("min:" + minInd);
        System.out.println("max:" + maxInd);
        int zero = 0;
        for (int number : array) {
            if (number == 0) {
                zero++;
            }
        }
        System.out.println("Count zero: " + zero);

        int a = array[0];
        int b = array[1];
        array[0] = array[array.length - 1];
        array[array.length - 1] = a;
        array[1] = array[array.length - 1 - 1];
        array[array.length - 1 - 1] = b;
        System.out.print("Заменены 1 и 4, 2 и 3 элементы массива местами:" + " ");
        System.out.println(Arrays.toString(array));

        boolean result = true;
        for (int i = 1; i < lenght; i++) {
            if (array[i] <= array[i - 1]) {
                result = false;
                break;
            }
            if (array[i] > array[i - 1]) {
                result = true;
            }
        }
        if (result) {
            System.out.println("Возрастающий");
        } else {
            System.out.println("Не возрастающий");
        }
        scanner.close();



    }
}


