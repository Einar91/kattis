import java.util.Scanner;

class Patuljci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 9; //num dwarfs
        int[] numbers = new int[n];
        int sum = 0;

        for (int i=0; i < n; i++) {
            numbers[i] = in.nextInt();
            sum = sum + numbers[i];
        }

        int difference = sum - 100;
        int num_one = 0;
        int num_two = 0;

        for (int k=0; k < n-1; k++) {
            for (int j=0; j < n; j++) {
                if (k != j && numbers[k] + numbers[j] == difference) {
                    num_one = numbers[k];
                    num_two = numbers[j];
                }
            }
        }

        for (int x : numbers) {
            if (x != num_one && x != num_two) {
                System.out.println(Integer.toString(x));
            }
        }
    }
}