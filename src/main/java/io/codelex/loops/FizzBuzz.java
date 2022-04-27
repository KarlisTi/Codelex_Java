package io.codelex.Loops;

public class FizzBuzz {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int counter = scan.nextInt();

        for(int c = 1; c <= 5; ++c) {
            for(int j = 1; j <= 20; ++j) {
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.print("FizzBuzz");
                } else if (counter % 3 == 0) {
                    System.out.print("Fizz");
                } else if (counter % 5 == 0) {
                    System.out.print("Buzz");
                } else {
                    System.out.print(counter);
                }

                System.out.print(" ");
                ++counter;
            }

            System.out.println();
        }

    }
}
