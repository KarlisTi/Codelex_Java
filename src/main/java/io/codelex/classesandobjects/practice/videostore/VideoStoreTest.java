package io.codelex.classesandobjects.practice.videostore;


import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);


        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        VideoStore movieArena = new VideoStore();
        Video movieOne = new Video("", true, 0);
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            movieOne.setTitle(movieName);
            movieOne.addVideo(movieName);
            System.out.println("Enter rating");
            int enterRating = scanner.nextInt();
            movieOne.receiveRating(enterRating);


        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter name of movie that you want to rent");
        String rentMovie = scanner.next();

    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter name of movie that you want to rent");
        String returnMovie = scanner.next();
    }
}
