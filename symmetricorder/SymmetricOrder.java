import java.util.Scanner;

class SymmetricOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();in.nextLine();
        int set_num = 1;

        while (n != 0) {
            System.out.println("SET " + Integer.toString(set_num));
            String[] names = new String[n];

            int f = 0;
            int b = n-1;
            for (int i=0; i < n; i++) {
                if (i % 2 == 0) {
                    names[f++] = in.nextLine();
                } else {
                    names[b--] = in.nextLine();
                }
            }

            for (String name : names) {
                System.out.println(name);
            }
            
            set_num++;
            if (in.hasNextInt()) {
                n = in.nextInt();in.nextLine();
            }
        }

    }
}