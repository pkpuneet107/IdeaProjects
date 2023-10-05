
import java.util.Scanner;
public class Main {
        Scanner input = new Scanner(System.in);



        public static int main() {
            Main m = new Main();
            int val = m.summer();
            return val;
        }

        public int summer () {
            int i = 1;
            int sum = 0;
            int N = input.nextInt();
            if(N > 0) {
                while (i <= N) {
                    sum += i;
                    i++;
                }
            }else{
                System.out.println("Please return a positive integer");
            }
            return sum;
        }
        public static void main(String[] args) {
            System.out.println(main());
        }
}

