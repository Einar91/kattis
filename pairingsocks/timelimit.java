import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;

class timelimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 2 * in.nextInt(); in.nextLine();

        Stack<Integer> original = new Stack<Integer>();  
        Stack<Integer> second = new Stack<Integer>(); 

        HashMap<Integer, Integer> types = new HashMap<>();

        String[] socks = in.nextLine().split(" ");
        for (int i=n-1; i >= 0; i--) {
            int sock = Integer.parseInt(socks[i]);
            original.push(sock);

            if (!types.containsKey(sock)) {
                types.put(sock, 1);
            } else {
                types.put(sock, types.get(sock) + 1);
            }
        }

        boolean fortsett = true;
        for (int value : types.values()) {
            if (value % 2 != 0) {
                System.out.println("impossible");
                fortsett = false;
                break;
            }
        }

        if (fortsett) {
            int moves = 0;
            int direction = 0;
            while (true) {
                if (original.empty() && second.empty()) {
                    break;
                }
                if (!original.empty() && !second.empty()) {
                    if(original.peek() == second.peek()) {
                        original.pop();
                        second.pop();
                        moves++;
                        continue;
                    }
                }
                if (direction == 0 && !original.empty()) {
                    second.push(original.pop());
                    moves++;
                }
            }
            System.out.println("" + moves);
        }
    }
}