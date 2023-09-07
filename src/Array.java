import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n, sum = 0;
        float mean;
        Scanner input = new Scanner(System.in);


        n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        mean = (float)sum / (float)n;
        System.out.println(sum + " " + mean);
    }
}