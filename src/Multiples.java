public class Multiples {
    public static void main(String[] args) {
        int instanceThree = 0;
        int instanceFive = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                instanceThree++;
                instanceFive++;
            }
            else if (i % 3 == 0) {
                instanceThree++;
            }
            else if (i % 5 == 0) {
                instanceFive++;
            }
        }
        System.out.println(instanceThree + instanceFive);
    }
}
