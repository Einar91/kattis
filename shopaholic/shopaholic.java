import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class shopaholic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int items = Integer.parseInt(in.nextLine());
        for (int i=0; i < items; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());

        int discount = 0;
        int i = 2;
        while (i < items) {
            discount = discount + list.get(i);
            i = i+3;
        }
        System.out.println(discount);
    }
}