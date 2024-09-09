/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;

        while (i < 100) {
            i = getFizzBuzz(i);
        }
    }

    private static int getFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }

        i += 1;
        return i;
    }
}
