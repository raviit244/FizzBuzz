public class Reduce {
    public static void main(String[] args) {
        int x = 100;
        int count = 0;

        while (x != 0) {
            if (x % 2 == 0) {
                x = x / 2;
            }
            else {
                x -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
