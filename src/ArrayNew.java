import java.util.Scanner;

public class ArrayNew {
    public static void main(String[] args) {
        int n, sum = 0, i = 0;
        Scanner input = new Scanner(System.in);


        n = input.nextInt();
        int[] array = new int[n];
        while (i < n) {
            array[i] = input.nextInt();
            i++;
        }
        i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < n);

        i = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (i < n) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            i++;
        }
        System.out.println("Sum: " + sum + " Max: " + max + " Min: " + min);
    }
}
