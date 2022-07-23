import java.util.Scanner;

class nsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt(); in.nextLine();
        int res = 0;
        for (int i=0; i < num; i++) {
            res += in.nextInt();
        }
        System.out.println("" + res);
    }
}