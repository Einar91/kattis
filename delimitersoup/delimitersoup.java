import java.util.Scanner;
import java.util.ArrayList;

class delimitersoup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt(); in.nextLine();

        String line = in.nextLine();
        boolean failed = false;
        ArrayList<Character> list = new ArrayList<>();
        for (int i=0; i < l; i++) {
            Character c = line.charAt(i); 
            if (c == '(' || c == '[' || c == '{') {
                list.add(c);
            }
            else if (c == ')') {
                if (list.size() == 0) {
                    System.out.println("" + c + " " + i);
                    failed = true;    
                    break;       
                } else {
                    Character v = list.remove(list.size() - 1);
                    if ('(' != v) {
                        System.out.println("" + c + " " + i);
                        failed = true;
                        break;
                    }
                }

                
            }
            else if (c == ']') {
                if (list.size() == 0) {
                    System.out.println("" + c + " " + i);
                    failed = true;   
                    break;        
                } else {
                    Character v = list.remove(list.size() - 1);
                    if ('[' != v) {
                        System.out.println("" + c + " " + i);
                        failed = true;
                        break;
                    }
                }

            }
            else if (c == '}') {
                if (list.size() == 0) {
                    System.out.println("" + c + " " + i);
                    failed = true;  
                    break;         
                } else {
                    Character v = list.remove(list.size() - 1);
                    if ('{' != v) {
                        System.out.println("" + c + " " + i);
                        failed = true;
                        break;
                    }
                }

            }
        }
        if (!failed) {
            System.out.println("ok so far");
        }
    }
}