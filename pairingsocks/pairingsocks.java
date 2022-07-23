import java.util.Scanner;
import java.util.Stack;

class pairingsocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 2 * in.nextInt(); in.nextLine();
        Stack<Integer> stk = new Stack<Integer>();  

        String[] socks = in.nextLine().split(" ");
        int moves = 0;
        for (int i=0; i < n; i++) {
            int sock = Integer.parseInt(socks[i]);
            if (!stk.empty()) {
                if(sock == stk.peek()) {
                    stk.pop();
                    moves++;
                    continue;
                }
            }
            stk.push(sock);
            moves++;
        }
        if (!stk.empty()) {
            System.out.println("impossible");
        } else {
            System.out.println("" + moves);
        }
    }
}